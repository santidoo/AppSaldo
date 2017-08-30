package doo.apps.prsaldo.countries;

public class Paraguay {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Personal **/
			case 74405:
				return "*121#";
				
			/** TIGO **/
			case 74404:
				return "*611#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Personal **/
		if (name.contains("Personal") || name.contains("personal") || name.contains("PERSONAL"))
			return "*121#";
		
		/** TIGO **/ // *611# y *222#
		else if (name.contains("TIGO") || name.contains("Tigo") || name.contains("tigo"))
			return "*611#";

		else
			return "";
	}
}
