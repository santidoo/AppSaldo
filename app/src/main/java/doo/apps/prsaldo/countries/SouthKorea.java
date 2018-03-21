package doo.apps.prsaldo.countries;

public class SouthKorea {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// olleh
			case 45008:
				return "#0";
				
			// sk telecom
			case 45005:
				return "*10";

            // LGU+
            case 45006:
                return "*81";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// olleh | Dial #0 or Call 1500
		if (name.toLowerCase().contains("olleh"))
			return "#0";
		
		// sk telecom | or *11
		else if (name.toLowerCase().contains("sk") || name.toLowerCase().contains("telecom"))
			return "*10";

        // LG U+ ( LG Telecom) | 1500 2111
        else if (name.toLowerCase().contains("lgu"))
            return "*81";

		else
			return "";
	}
}
