package doo.apps.prsaldo.countries;

public class Trinidad {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** DIGICEL **/
			case 37413:
				return "*120#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** DIGICEL **/
		if (name.contains("DIGICEL") || name.contains("Digicel") || name.contains("digicel"))
			return "*120#";

		else
			return "";
	}
}
