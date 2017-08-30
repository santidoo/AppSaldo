package doo.apps.prsaldo.countries;

public class Canada {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Telus **/
			case 302220:
				return "#123";
				
			/** Bell Mobility **/
			case 302610:
				return "#321";
				
			/** Wind **/
			case 302490:
				return "*123#";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Rogers Wireless **/
		if (name.contains("ROGERS") || name.contains("ogers"))
			return "*225#";
		
		/** Bell Mobility **/
		else if (name.contains("BELL") || name.contains("ell"))
			return "#321";
		
		/** telus Mobility **/
		else if (name.contains("TELUS") || name.contains("elus"))
			return "#123";
		
		/** Wind **/
		else if (name.contains("Wind") || name.contains("WIND") || name.contains("wind"))
			return "*123#";

		else
			return "";
	}
}
