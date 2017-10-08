package doo.apps.prsaldo.countries;

public class Belgium {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// PROXIMUS
			case 20601:
				return "#121#";
				
			// Base | Telenet
			case 20605:
				return "*444*#";

            // Lycamobile
            case 20606:
                return "*103*100#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// PROXIMUS
		if (name.toLowerCase().contains("proxi"))
			return "#121#";
		
		// BASE | *777*# also seems to do the same
		else if (name.toLowerCase().contains("base"))
			return "*444*#";
		
		// Base | Telenet -> s1914:CONSULT
		else if (name.toLowerCase().contains("telenet"))
			return "*444*#";

        // Lycamobile | *103# or 93# or dial 1966 or 92# or SMS to 1966 with the message BAL
        else if (name.toLowerCase().contains("lycamobile"))
            return "*103*100#";

		else
			return "";
	}
}
