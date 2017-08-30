package doo.apps.prsaldo.countries;

public class SriLanka {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** airtel **/
			case 41305:
				return "*550#";
				
			/** Dialog **/
			case 41302:
				return "*#456#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** airtel **/ // To check your data balance, Please Dial *550#
		if (name.contains("airtel") || name.contains("Airtel") || name.contains("AIRTEL"))
			return "*550#";
		
		/** Etisalat **/
		else if (name.contains("Etisalat") || name.contains("etisalat") || name.contains("ETISALAT"))
			return "#134#";

		/** Dialog **/
		else if (name.contains("Dialog") || name.contains("dialog") || name.contains("DIALOG"))
			return "*#456#";

		else
			return "";
	}
}
