package doo.apps.prsaldo.countries;

public class Slovakia {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// Orange
			case 23101:
				return "";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// Orange
		if (name.toLowerCase().contains("orange"))
			return "";

        else if (name.toLowerCase().contains("4ka") || name.toLowerCase().contains("swan"))
            return "*55#";

		else
			return "";
	}
}
