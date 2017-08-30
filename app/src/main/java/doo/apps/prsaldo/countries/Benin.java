package doo.apps.prsaldo.countries;

public class Benin {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** MTN | Moov **/
			case 61603:
				return "*375*6#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Moov | MTN **/ // Website says *300# and 6
		if (name.toLowerCase().contains("mtn") || name.toLowerCase().contains("moov"))
			return "*375*6#";

		else
			return "";
	}
}

// MTN ->  *124#
// http://mstabukasblog.blogspot.com/2015/09/moov-and-mtn-benin-internet-data-plans.html

