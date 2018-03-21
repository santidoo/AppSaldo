package doo.apps.prsaldo.countries;

public class SouthAfrica {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// MTN
			case 65510:
				return "*141#";

            // TelkomSA
			case 65502:
				return "*100#";
			
			// vodacom
			case 65501:
				return "*111*500#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {

		// Vodacom | Prepaid: *100# -> will give you an update on your remaining free minutes or SMS bundle
		//  *111*500# -> it will display both data and airtime balance
		if (name.toLowerCase().contains("vodacom"))
			return "*111*500#";
		
		// TelkomSA | *188# or Blank SMS to 188
		else if (name.toLowerCase().contains("telkomsa"))
			return "*100#";

        // MTN-SA | *141*1# for a detailed balance
        else if (name.toLowerCase().contains("mtn") || name.equals("MTN-SA"))
            return "*141#";

		else
			return "";
	}
}

// http://mybroadband.co.za/vb/showthread.php/308093-How-to-check-how-much-prepaid-airtime-you-have-left-on-Vodacom-MTN-and-Cell-C
