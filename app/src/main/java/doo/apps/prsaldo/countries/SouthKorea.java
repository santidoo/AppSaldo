package doo.apps.prsaldo.countries;

public class SouthKorea {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** olleh **/
			case 45008:
				return "#0";
				
			/** sk telecom **/
			case 45005:
				return "*10";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** olleh **/ // Dial #0 or Call 1500
		if (name.contains("OLLEH") || name.contains("Olleh") || name.contains("olleh"))
			return "#0";
		
		/** sk telecom **/ // or *11
		else if (name.toLowerCase().contains("sk") || name.toLowerCase().contains("telecom"))
			return "*10";

		else
			return "";
	}
}
