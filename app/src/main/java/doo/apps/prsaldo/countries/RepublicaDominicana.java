package doo.apps.prsaldo.countries;

public class RepublicaDominicana {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// CLARO
			case 37002:
				return "*122#";
				
			// ORANGE
			case 37001:
				return "#131#";

            // VIVA | *74
            case 37004:
                return "#111#";

            // Default or PR Wireless | From Puerto Rico
			case 330120:
				return "#225";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// CLARO
		if (name.toLowerCase().contains("claro"))
			return "*122#";
		
		// ORANGE
		if (name.toLowerCase().contains("orange"))
			return "#131#";
		
		// TravelSIM
		else if (name.toLowerCase().contains("travel") || name.toLowerCase().contains("sim"))
			return "*146*099";

        // VIVA | *74
        else if (name.toLowerCase().contains("viva"))
            return "#111#";
		
		// Default or PR Wireless
		else if (name.toLowerCase().contains("default") || name.toLowerCase().contains("wireless"))
			return "#225";
		
		else
			return "";
	}
}
