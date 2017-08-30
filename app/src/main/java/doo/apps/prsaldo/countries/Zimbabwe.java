package doo.apps.prsaldo.countries;

public class Zimbabwe {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Econet **/
			case 64804:
				return "*121#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Econet **/ // s1244:BAL // *125# ?
		if (name.contains("Econet") || name.contains("econet") || name.contains("ECONET"))
			return "*121#";
		
		/** Telecel **/
		else if (name.contains("Telecel") || name.contains("telecel") || name.contains("TELECEL"))
			return "*144#";

		else
			return "";
	}
}
