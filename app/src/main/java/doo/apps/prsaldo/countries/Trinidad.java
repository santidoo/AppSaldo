package doo.apps.prsaldo.countries;

public class Trinidad {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// DIGICEL
			case 37413:
				return "*120#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// DIGICEL
		if (name.toLowerCase().contains("digicel"))
			return "*120#";

		else
			return "";
	}
}
