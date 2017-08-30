package doo.apps.prsaldo.countries;

public class Uzbekistan {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			/** UCell **/
			case 43405:
				return "*100#";
				
			case 43404:
				return "*102#";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** UCell **/ // *110# for Postpaid
		if (name.contains("UCell") || name.contains("CELL") || name.contains("ell"))
			return "*100#";
		
		/** Beeline **/ // *110# for Postpaid
		else if (name.contains("BEELINE") || name.contains("Beeline") || name.contains("beeline"))
			return "*102#";

		else
			return "";
	}
}
