package doo.apps.prsaldo.countries;

public class Georgia {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Geocell **/
			case 28201:
				return "*100#";
				
			/** MAGTICOM **/
			case 28202:
				return "*111*1#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Geocell **/
		if (name.contains("Geocell") || name.contains("geocell") || name.contains("GEO"))
			return "*100#";
		
		/** MAGTICOM **/ // Dial 444
		else if (name.toLowerCase().contains("magti"))
			return "*111*1#";

		else
			return "";
	}
}
