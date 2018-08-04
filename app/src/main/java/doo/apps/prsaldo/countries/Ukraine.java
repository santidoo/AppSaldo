package doo.apps.prsaldo.countries;

public class Ukraine {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// KYIVSTAR
			case 25503:
				return "*111#";
				
			// Beeline UA
			case 25502:
				return "*102#";

            // Lifecell
            case 25506:
                return "*111#";

            // Phoenix
            case 25599:
                return "*101#";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// KYIVSTAR
		if (name.toLowerCase().contains("kyivstar"))
			return "*111#";
		
		// Beeline UA
		else if (name.toLowerCase().contains("beeline"))
			return "*102#";

        // Lifecell
        else if (name.toLowerCase().contains("lifecell"))
            return "*111#";

        // Phoenix
        else if (name.toLowerCase().contains("phoenix"))
            return "*101#";

		else
			return "";
	}
}
