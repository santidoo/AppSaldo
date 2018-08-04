package doo.apps.prsaldo.countries;

public class EquatorialGuinea {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// GETESA-ORANGE
			case 62701:
				return "*124#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// GETESA-ORANGE
		if (name.toLowerCase().contains("getesa") || name.toLowerCase().contains("orange"))
			return "*124#";

		else
			return "";
	}
}
