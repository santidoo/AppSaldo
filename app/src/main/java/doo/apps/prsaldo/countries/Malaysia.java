package doo.apps.prsaldo.countries;

public class Malaysia {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Maxis Mobile **/
			case 50212:
				return "*122#";
				
			/** Celcom **/
			case 50219:
				return "*124#";
				
			/** U-Mobile **/
			case 50218:
				return "1328";
			
			/** DiGi **/
			case 50216:
				return "*126#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Digi **/ // postpaid - *128# or *#128*1*1#
		if (name.contains("Digi") || name.contains("DIGI") || name.contains("DiGi"))
			return "*126#";
		
		/** Maxis Mobile | Hotlink **/
		else if (name.contains("MAXIS") || name.contains("Maxis") || name.contains("maxis") ||
				 name.contains("HOTLINK") || name.contains("Hotlink") || name.contains("hotlink"))
			return "*122#";
		
		/** Celcom **/ // Type BAL and send to 2888
		else if (name.contains("Celcom") || name.contains("celcom") || name.contains("CELCOM"))
			return "*124#";
		
		/** U-Mobile **/
		else if (name.contains("U-Mobile") || name.contains("U Mobile") || name.contains("u-mobile") || name.contains("u mobile"))
			return "1328";

		else
			return "";
	}
}
