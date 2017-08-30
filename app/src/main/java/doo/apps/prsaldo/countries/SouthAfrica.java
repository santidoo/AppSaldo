package doo.apps.prsaldo.countries;

public class SouthAfrica {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** MTN **/
			case 65510:
				return "*141#";
			
			/** TelkomSA **/
			case 65502:
				return "*100#";
			
			/** vodacom **/
			case 65501:
				return "*111*500#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Vodacom **/ 
		// Vodacom prepaid dial *100# -> will give you an update on your remaining free minutes or SMS bundle
		//  *111*500# it will display both data and airtime balance
		if (name.contains("Vodacom") || name.contains("VODA") || name.contains("voda") || name.contains("com") || name.contains("COM"))
			return "*111*500#";
		
		/** MTN **/
		else if (name.contains("Vodacom") || name.contains("VODA") || name.contains("voda") || name.contains("com") || name.contains("COM"))
			return "*141#";
		
		/** TelkomSA **/ // *188# , Blank SMS to 188
		else if (name.contains("TelkomSA") || name.contains("TELKOMSA"))
			return "*100#";

		else
			return "";
	}
}

// http://mybroadband.co.za/vb/showthread.php/308093-How-to-check-how-much-prepaid-airtime-you-have-left-on-Vodacom-MTN-and-Cell-C
