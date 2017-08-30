package doo.apps.prsaldo.countries;

public class Namibia {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** MTC NAM **/
			case 64901:
				return "*131#";
				
			/** TN MOBILE **/
			case 64903:
				return "*124#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** MTC NAM **/ // *139# or 139
		if (name.contains("MTC NAM") || name.contains("MTC") || name.contains("mtc") || name.contains("Mtc"))
			return "*131#";
		
		/** TN MOBILE **/ // Send a blank SMS to 124, or call 139 to hear your balance
		else if (name.toLowerCase().contains("tn"))
			return "*124#";

		else
			return "";
	}
}
