package doo.apps.prsaldo.countries;

public class Turkmenistan {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** TM CELL **/
			case 43802:
				return "*0800#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** TM CELL **/
		if (name.contains("TM CELL") || name.contains("TMCELL") || name.contains("tm"))
			return "*0800#";

		else
			return "";
	}
}
