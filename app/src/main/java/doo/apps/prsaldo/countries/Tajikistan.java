package doo.apps.prsaldo.countries;

public class Tajikistan {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			// Beeline TJ
            case 43605:
                return "*114#";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// Beeline TJ | *114# data balance
		if (name.toLowerCase().contains("beeline"))
			return "*114#";

		else
			return "";
	}
}

