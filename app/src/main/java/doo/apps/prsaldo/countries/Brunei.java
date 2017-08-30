package doo.apps.prsaldo.countries;

public class Brunei {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
							
			/** PCSB **/
			case 52802:
				return "*179#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
			
		/** PCSB **/
		if (name.contains("PCSB") || name.contains("PCSB"))
			return "*179#";

		else
			return "";
	}
}
