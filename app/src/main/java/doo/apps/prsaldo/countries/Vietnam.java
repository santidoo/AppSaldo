package doo.apps.prsaldo.countries;

public class Vietnam {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// Viet Nam Mobile Service (Mobifone) | VMS (MOBIFONE)
			case 45201:
				return " *101#";
				
			// VIETTEL
			case 45204:
				return "*101#";

            // VINAPHONE
            case 45202:
                return "*101#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// Viet Nam Mobile Service (Mobifone) | VMS (MOBIFONE) | Call 901
		if (name.toLowerCase().contains("avea"))
			return "*101#";
		
		// VIETTEL | or Dial 901
		else if (name.toLowerCase().contains("viettel"))
			return "*101#";

        // VINAPHONE
        else if (name.toLowerCase().contains("vinaphone"))
            return "*101#";
		
		else
			return "";
	}
}
