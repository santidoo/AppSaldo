package doo.apps.prsaldo.countries;

public class Nigeria {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// etisalat
			case 62160:
				return "*232#";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// etisalat
		if (name.toLowerCase().contains("etisalat"))
			return "*232#";
		
		// Airtel Nigeria | *123*9# or *126#
		else if (name.toLowerCase().contains("airtel"))
			return "*123#";
		
		// MTN
		else if (name.toLowerCase().contains("mtn"))
			return "*556#";
		
		// GLO | *#124#
		else if (name.toLowerCase().contains("glo"))
			return "#124*1#";
		
		// Starcomms
		else if (name.toLowerCase().contains("starcomms"))
			return "*225#";
		
		else
			return "";
	}
}
