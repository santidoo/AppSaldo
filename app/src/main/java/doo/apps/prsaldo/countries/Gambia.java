package doo.apps.prsaldo.countries;

public class Gambia {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// Africell
			case 60702:
				return "*133#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// Africell
		if (name.toLowerCase().contains("africell"))
			return "*133#";

		else
			return "";
	}
}
