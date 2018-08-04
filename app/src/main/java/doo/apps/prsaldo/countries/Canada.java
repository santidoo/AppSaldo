package doo.apps.prsaldo.countries;

public class Canada {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// Telus
			case 302220:
				return "#123";
				
			// Bell Mobility
			case 302610:
				return "#321";
				
			// Wind
			case 302490:
				return "*123#";

            // chatr | *100# or call *611
            case 302720:
                return "*225#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// Rogers Wireless
		if (name.toLowerCase().contains("rogers"))
			return "*225#";
		
		// Bell Mobility
		else if (name.toLowerCase().contains("bell"))
			return "#321";
		
		// telus Mobility
		else if (name.toLowerCase().contains("telus"))
			return "#123";
		
		// Wind
		else if (name.toLowerCase().contains("wind"))
			return "*123#";

        // chatr | *100# or call *611
        else if (name.toLowerCase().contains("chatr"))
            return "*225#";

		else
			return "";
	}
}
