package doo.apps.prsaldo;

import doo.apps.prsaldo.countries.*;
import doo.apps.prsaldo.services.USSDService;
import doo.apps.saldo.R;

import android.Manifest;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.LocalBroadcastManager;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

import java.util.List;

public class MainActivity extends Activity {

	private static final String INFO = "dooApps";
	private static TelephonyManager tlfnoMgr;

	private String USSD_kod;
	private AlertDialog alertDialog;

    private String alert_message;
	private String alert_yes;
	private String alert_no;
	private String body;
	private String chooser_title;
    private String serviceID;

	private static final int PERMISSIONS_CALL_PHONE = 1;
	private static final int PERMISSIONS_SEND_SMS = 2;

	private enum CountriesSupported {
		ae, af, am, ao, ar, au, az, bb, bd, be, bg, bh, bj, bn, bo, br, by, bz, ca, cg, ch, cl, cm, cn, co, cr, cu, cz,
		de, dk, doo, dz, ec, eg, es, et, fi, fr, ge, gb, gh, gm, gt, hk, hn, hr, ht, hu, id, ie, il, in, iq, ir, it,
		jm, jo, ke, kh, kr, kw, kz, lb, lk, ly, ma, mh, mm, mo, mq, mw, mx, my, na, ncn, ng, ni, nl, no, np, nz, om,
		pa, pe, ph, pk, pl, pr, pt, py, qa, ro, rs, ru, sa, sd, se, sg, so, sr, sv, sy, th, tm, tn, tr, tt,
		ua, ug, uk, us, uy, uz, ve, vn, ye, za, zh, zw
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Initialize all strings to support Locale feature
        String no_sim = getResources().getString(R.string.no_sim);
		alert_message = getResources().getString(R.string.alert_message);
		alert_yes = getResources().getString(android.R.string.ok);
		alert_no = getResources().getString(R.string.alert_no);
		body = getResources().getString(R.string.email_body);
		chooser_title = getResources().getString(R.string.chooser_title);
        serviceID = getPackageName() + "/" + USSDService.class.getCanonicalName();

        // WIP
        // registerReceiver();

		tlfnoMgr = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
		if (tlfnoMgr.getSimState() == TelephonyManager.SIM_STATE_READY) {
			String cc = tlfnoMgr.getSimCountryIso();
			if (TextUtils.isEmpty(cc))
				cc = "ncn"; // WHY this? Because some simcards do not have the country name on it..

			USSD_kod = getUSSDkod(cc);
			//USSD_kod = "u*133#:*555#";
            //USSD_kod = "";

			if (TextUtils.isEmpty(USSD_kod)) {
				// TODO: CREATE AN ALERTDIALOG AND OPEN EMAIL PROVIDER
				showAlert();
			} else if (USSD_kod.startsWith("s"))
				checkPermissions(Manifest.permission.SEND_SMS, PERMISSIONS_SEND_SMS);
			else
				checkPermissions(Manifest.permission.CALL_PHONE, PERMISSIONS_CALL_PHONE);
		} else {
			Toast.makeText(MainActivity.this, no_sim, Toast.LENGTH_SHORT).show();
			finish();
		}
	}

	// Our handler for received Intents.
	// This will be called whenever an Intent with an action named "message" is broadcasted.
	private BroadcastReceiver bReceiver = new BroadcastReceiver() {

		@Override
		public void onReceive(Context context, Intent intent) {
			// Put here whatever you want your activity to do with the intent received
			String message = intent.getStringExtra("ussd");
			Log.d("santi", "BroadcastReceiver: " + message);

			if (message.contentEquals("OK"))
				finish();
			else
			    if (USSD_kod.startsWith("u")) {
				    // Show alert to ask user for a second try
				    showAlert2();
			    }
			    else {
				    showAlert();
			    }
		}
	};

	private void registerReceiver() {
		Log.d("santi", "registerReceiver");
		LocalBroadcastManager.getInstance(this).registerReceiver(bReceiver, new IntentFilter("message"));
	}

	private void unregisterReceiver() {
		Log.d("santi", "unregisterReceiver");
		LocalBroadcastManager.getInstance(this).unregisterReceiver(bReceiver);
	}

/*	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		super.onWindowFocusChanged(hasFocus);
		Log.d("santi", "onWindowFocusChanged");

		if (! hasFocus) {
			Intent closeDialog = new Intent(Intent.ACTION_CLOSE_SYSTEM_DIALOGS);
			sendBroadcast(closeDialog);
		}
	}*/

	private void checkPermissions(String permission, int code) {

		int permissionCheck = ContextCompat.checkSelfPermission(MainActivity.this, permission);
		if (permissionCheck != PackageManager.PERMISSION_GRANTED) {

			// Should we show an explanation?
//			if (ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this, Manifest.permission.CALL_PHONE)) {
//
//				Toast.makeText(this, "shouldShowRequestPermissionRationale", Toast.LENGTH_SHORT).show();
//				// Show an expanation to the user *asynchronously* -- don't block
//				// this thread waiting for the user's response! After the user
//				// sees the explanation, try again to request the permission.
//
//			} else {

			// No explanation needed, we can request the permission.
			ActivityCompat.requestPermissions(MainActivity.this, new String[]{permission}, code);
			// The callback method gets the result of the request.
//		    }
		} else //if (code == PERMISSIONS_CALL_PHONE)
			getBalance(USSD_kod);
	}

	private String getUSSDkod(String data) {

		if (data.equals("do"))
			data = "doo"; // WHY this? Because I can write ´do´ as constant...

		String mccmnc = tlfnoMgr.getSimOperator();
		String operatorName = tlfnoMgr.getSimOperatorName();

		try {

			CountriesSupported country = CountriesSupported.valueOf(data);
			switch (country) {

				case ae:
					return ArabEmirates.getCode(mccmnc, operatorName);

                case af:
                    return Afghanistan.getCode(mccmnc, operatorName);

				case am:
					return Armenia.getCode(mccmnc, operatorName);

				case ao:
					return Angola.getCode(mccmnc, operatorName);

				case ar:
					return Argentina.getCode(mccmnc, operatorName);

				case au:
					return Australia.getCode(mccmnc, operatorName);

				case az:
					return Azerbaijan.getCode(mccmnc, operatorName);

				case bb:
					return Barbados.getCode(mccmnc, operatorName);

				case bd:
					return Bangladesh.getCode(mccmnc, operatorName);

				case be:
					return Belgium.getCode(mccmnc, operatorName);

				case bg:
					return Bulgaria.getCode(mccmnc, operatorName);

				case bh:
					return Bahrain.getCode(mccmnc, operatorName);

				case bj:
					return Benin.getCode(mccmnc, operatorName);

				case bn:
					return Brunei.getCode(mccmnc, operatorName);

				case bo:
					return Bolivia.getCode(mccmnc, operatorName);

				case br:
					return Brazil.getCode(mccmnc, operatorName);

				case by:
					return Belarus.getCode(mccmnc, operatorName);

				case bz:
					return Belice.getCode(mccmnc, operatorName);

				case ca:
					return Canada.getCode(mccmnc, operatorName);

				case cg:
					return Congo.getCode(mccmnc, operatorName);

				case ch:
					return Switzerland.getCode(mccmnc, operatorName);

				case cl:
					return Chile.getCode(mccmnc, operatorName);

				case cm:
					return Cameroon.getCode(mccmnc, operatorName);

				case cn:
					return China.getCode(mccmnc, operatorName);

				case co:
					return Colombia.getCode(mccmnc, operatorName);

				case cr:
					return CostaRica.getCode(mccmnc, operatorName);

				case cu:
					return Cuba.getCode(mccmnc, operatorName);

				case cz:
					return CzechRepublic.getCode(mccmnc, operatorName);

				case de:
					return Germany.getCode(mccmnc, operatorName);

				case dk:
					return Denmark.getCode(mccmnc, operatorName);

				case doo:
					return RepublicaDominicana.getCode(mccmnc, operatorName);

				case dz:
					return Algeria.getCode(mccmnc, operatorName);

				case ec:
					return Ecuador.getCode(mccmnc, operatorName);

				case eg:
					return Egypt.getCode(mccmnc, operatorName);

				case es:
					return Spain.getCode(mccmnc, operatorName);

				case et:
					return Ethiopia.getCode(mccmnc, operatorName);

				case fi:
					return Finland.getCode(mccmnc, operatorName);

				case fr:
					return France.getCode(mccmnc, operatorName);

				case ge:
					return Georgia.getCode(mccmnc, operatorName);

				case gb:
					return UK.getCode(mccmnc, operatorName);

				case gh:
					return Ghana.getCode(mccmnc, operatorName);

                case gm:
                    return Gambia.getCode(mccmnc, operatorName);

                case gt:
                    return Guatemala.getCode(mccmnc, operatorName);

				case hk:
					return HongKong.getCode(mccmnc, operatorName);

				case hn:
					return Honduras.getCode(mccmnc, operatorName);

				case hr:
					return Croatia.getCode(mccmnc, operatorName);

				case ht:
					return Haiti.getCode(mccmnc, operatorName);

				case hu:
					return Hungary.getCode(mccmnc, operatorName);

				case id:
					return Indonesia.getCode(mccmnc, operatorName);

				case ie:
					return Ireland.getCode(mccmnc, operatorName);

				case il:
					return Israel.getCode(mccmnc, operatorName);

				case in:
					return India.getCode(mccmnc, operatorName);

				case iq:
					return Iraq.getCode(mccmnc, operatorName);

				case ir:
					return Iran.getCode(mccmnc, operatorName);

				case it:
					return Italy.getCode(mccmnc, operatorName);

				case jm:
					return Jamaica.getCode(mccmnc, operatorName);

				case jo:
					return Jordan.getCode(mccmnc, operatorName);

				case ke:
					return Kenya.getCode(mccmnc, operatorName);

				case kh:
					return Cambodia.getCode(mccmnc, operatorName);

				case kr:
					return SouthKorea.getCode(mccmnc, operatorName);

				case kw:
					return Kuwait.getCode(mccmnc, operatorName);

				case kz:
					return Kazakhstan.getCode(mccmnc, operatorName);

				case lb:
					return Lebanon.getCode(mccmnc, operatorName);

				case lk:
					return SriLanka.getCode(mccmnc, operatorName);

				case ly:
					return Libyan.getCode(mccmnc, operatorName);

				case ma:
					return Morocco.getCode(mccmnc, operatorName);

                case mh:
                    return Marshall_Islands.getCode(mccmnc, operatorName);

				case mm:
					return Myanmar.getCode(mccmnc, operatorName);

				case mo:
					return Macao.getCode(mccmnc, operatorName);

				case mq:
					return Martinique.getCode(mccmnc, operatorName);

				case mw:
					return Malawi.getCode(mccmnc, operatorName);

				case mx:
					return Mexico.getCode(mccmnc, operatorName);

				case my:
					return Malaysia.getCode(mccmnc, operatorName);

				case no:
					return Norway.getCode(mccmnc, operatorName);

				case np:
					return Nepal.getCode(mccmnc, operatorName);

				case na:
					return Namibia.getCode(mccmnc, operatorName);

				case ncn:
					return NoCountryName.getCode(mccmnc, operatorName);

				case ng:
					return Nigeria.getCode(mccmnc, operatorName);

				case ni:
					return Nicaragua.getCode(mccmnc, operatorName);

				case nl:
					return Netherland.getCode(mccmnc, operatorName);

				case nz:
					return NewZealand.getCode(mccmnc, operatorName);

				case om:
					return Oman.getCode(mccmnc, operatorName);

				case pa:
					return Panama.getCode(mccmnc, operatorName);

				case pe:
					return Peru.getCode(mccmnc, operatorName);

				case pk:
					return Pakistan.getCode(mccmnc, operatorName);

				case ph:
					return Philippines.getCode(mccmnc, operatorName);

				case pl:
					return Poland.getCode(mccmnc, operatorName);

				case pr:
					return PuertoRico.getCode(mccmnc, operatorName);

				case pt:
					return Portugal.getCode(mccmnc, operatorName);

				case py:
					return Paraguay.getCode(mccmnc, operatorName);

				case qa:
					return Qatar.getCode(mccmnc, operatorName);

				case ro:
					return Romania.getCode(mccmnc, operatorName);

				case rs:
					return Serbia.getCode(mccmnc, operatorName);

				case ru:
					return Russia.getCode(mccmnc, operatorName);

				case sa:
					return ArabiaSaudi.getCode(mccmnc, operatorName);

				case sd:
					return Sudan.getCode(mccmnc, operatorName);

				case se:
					return Sweden.getCode(mccmnc, operatorName);

				case sg:
					return Singapore.getCode(mccmnc, operatorName);

				case so:
					return Somalia.getCode(mccmnc, operatorName);

				case sr:
					return Suriname.getCode(mccmnc, operatorName);

				case sv:
					return El_Salvador.getCode(mccmnc, operatorName);

				case sy:
					return Syria.getCode(mccmnc, operatorName);

				case th:
					return Thailand.getCode(mccmnc, operatorName);

				case tm:
					return Turkmenistan.getCode(mccmnc, operatorName);

				case tn:
					return Tunisia.getCode(mccmnc, operatorName);

				case tr:
					return Turquey.getCode(mccmnc, operatorName);

				case tt:
					return Trinidad.getCode(mccmnc, operatorName);

				case ua:
					return Ukraine.getCode(mccmnc, operatorName);

				case ug:
					return Uganda.getCode(mccmnc, operatorName);

				case uk:
					return UK.getCode(mccmnc, operatorName);

				case us:
					return USA.getCode(mccmnc, operatorName);

				case uy:
					return Uruguay.getCode(mccmnc, operatorName);

				case uz:
					return Uzbekistan.getCode(mccmnc, operatorName);

				case ve:
					return Venezuela.getCode(mccmnc, operatorName);

				case vn:
					return Vietnam.getCode(mccmnc, operatorName);

				case ye:
					return Yemen.getCode(mccmnc, operatorName);

				case za:
					return SouthAfrica.getCode(mccmnc, operatorName);

				case zh:
					return China.getCode(mccmnc, operatorName);

				case zw:
					return Zimbabwe.getCode(mccmnc, operatorName);

				default:
					return "";
			}
		} catch (NumberFormatException e) {
			// TODO: handle NumberFormatException: Invalid int: ""
			Log.e(INFO, "" + e);
			return "";
		} catch (Exception e) {
			Log.e(INFO, "" + e);
			return "";
		}
	}

	private void showAlert() {

		AlertDialog.Builder builder;

		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
			builder = new AlertDialog.Builder(this, android.R.style.Theme_Material_Dialog_Alert);
		else
			builder = new AlertDialog.Builder(this);

		builder.setIcon(android.R.drawable.ic_dialog_info);
		builder.setTitle("Ouch!");
		builder.setCancelable(false);
		builder.setMessage(alert_message);
		builder.setPositiveButton(alert_yes, new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				sendEmail();
			}
		});
		builder.setNegativeButton(alert_no, new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				finish();
			}
		});

		alertDialog = builder.create();
		alertDialog.show();
	}

	private void showAlert2() {
		AlertDialog.Builder builder;
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
			builder = new AlertDialog.Builder(this, android.R.style.Theme_Material_Dialog_Alert);
		else
			builder = new AlertDialog.Builder(this);

		builder.setTitle(R.string.alert_title_try_again)
				.setMessage(R.string.alert_message_try_again)
				.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						// Try the second USSD code stored in the string
						getBalance(USSD_kod.substring(USSD_kod.indexOf(":") + 1));
					}
				})
				.setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						unregisterReceiver();
						finish();
					}
				})
				.setIcon(android.R.drawable.ic_dialog_alert)
				.show();
	}

	private void sendEmail() {

		// Get the user versionName
		String versionName = "-";
		try {
			PackageInfo pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
			versionName = pInfo.versionName;
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Suggested way to send an email
		Intent emailIntent2 = new Intent(Intent.ACTION_VIEW);
		emailIntent2.setData(Uri.parse("mailto:checkbalance.dooapps@gmail.com"));
		emailIntent2.putExtra(Intent.EXTRA_SUBJECT, "Carrier Details");
		emailIntent2.putExtra(Intent.EXTRA_TEXT, body +
				" \n\n--------Debug-logs--------" +
				" \nSimCountryIso: " + tlfnoMgr.getSimCountryIso() +
				" \nSimOperatorName: " + tlfnoMgr.getSimOperatorName() +
				" \nSimOperator: " + tlfnoMgr.getSimOperator() +
				" \nNetworkOperator: " + tlfnoMgr.getNetworkOperator() +
				" \nApp version: " + versionName);

		startActivity(Intent.createChooser(emailIntent2, chooser_title));
		finish();
	}

	/** Dial the USSD code **/
	private void getBalance(String kod) {

		if (kod.startsWith("s")) {

			String smsNumber = kod.substring(1, kod.indexOf(":"));
			String smsText = kod.substring(kod.indexOf(":") + 1);

			if (smsText.isEmpty())
				sendEmptySMS(smsNumber);
			else
				sendSMS(smsNumber, smsText);

            finish();

		} else
			// Special case when two USSD codes are stored in the same string -- WIP
			if (kod.startsWith("u")) {

				// Get the first USSD code
				String ussd = kod.substring(1, kod.indexOf(":"));
				ussd = "tel:" + ussd.replace("#", Uri.encode("#"));
				Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(ussd));

				if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
					return;

				startActivity(intent);
			}
			else { // NORMAL CASE

				Log.d("santi", "calling: " + kod);
				String ussd = "tel:" + kod.replace("#", Uri.encode("#"));
				Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(ussd));
				startActivity(intent);
			}

        Log.d("santi", "isAccessibilityEnabled: " + isAccessibilityEnabled(MainActivity.this, serviceID));
        if (!isAccessibilityEnabled(MainActivity.this, serviceID))
            finish();
	}

	public final void sendEmptySMS(String smsNumber) {

		Toast.makeText(MainActivity.this, "Please, send the following EMPTY SMS", Toast.LENGTH_LONG).show();

		Uri smsUri = Uri.parse("smsto:" + smsNumber);
		Intent intent = new Intent(Intent.ACTION_SENDTO, smsUri);
		intent.putExtra("sms_body", " ");
		startActivity(intent);
	}

	public final void sendSMS(String smsNumber, String smsText) {
		SmsManager manager = SmsManager.getDefault();
		manager.sendTextMessage(smsNumber, null, smsText, null, null);
		Toast.makeText(MainActivity.this, "SMS balance inquiry has been sent", Toast.LENGTH_SHORT).show();
	}

	public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
		if (requestCode == PERMISSIONS_CALL_PHONE) {
			// If request is cancelled, the result arrays are empty.
			if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
				getBalance(USSD_kod);
			else {
				// permission denied, boo! Disable the functionality that depends on this permission.
				Toast.makeText(MainActivity.this, "To check your balance you need to Allow call permissions", Toast.LENGTH_LONG).show();
				finish();
			}
		}
		else if (requestCode == PERMISSIONS_SEND_SMS) {
			// If request is cancelled, the result arrays are empty.
			if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
				getBalance(USSD_kod);
			else {
				// permission denied, boo! Disable the functionality that depends on this permission.
				Toast.makeText(MainActivity.this, "To check your balance you need to Allow SMS permissions", Toast.LENGTH_LONG).show();
				finish();
			}
		}
	}

    public static boolean isAccessibilityEnabled(Context context, String id) {

        AccessibilityManager am = (AccessibilityManager) context.getSystemService(Context.ACCESSIBILITY_SERVICE);
        List<AccessibilityServiceInfo> runningServices = am.getEnabledAccessibilityServiceList(AccessibilityEvent.TYPES_ALL_MASK);
        for (AccessibilityServiceInfo service : runningServices) {
            if (id.equals(service.getId()))
                return true;
        }
        return false;
    }

    @Override
    public void finish() {
        unregisterReceiver();
        Log.d("santi", "finish");
        super.finish();
    }
}
