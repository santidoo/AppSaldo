package doo.apps.prsaldo.countries;

public class Belgium {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** PROXIMUS **/
			case 20601:
				return "#121#";
				
			/** Base | Telenet **/
			case 20605:
				return "*444*#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** PROXIMUS **/
		if (name.contains("PROXI") || name.contains("roxi"))
			return "#121#";
		
		/** BASE **/ //  *777*# also seems to do the same
		else if (name.contains("BASE") || name.contains("ase"))
			return "*444*#";
		
		/** Base | Telenet **/ // s1914:CONSULT
		else if (name.contains("Telenet") || name.contains("TELENET") || name.contains("telenet") ||
				 name.contains("BASE") || name.contains("Base") || name.contains("base"))
			return "*444*#";

		else
			return "";
	}
}
