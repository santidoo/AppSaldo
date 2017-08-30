package doo.apps.prsaldo.countries;

public class Lebanon {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** alfa **/
			case 41501:
				return "*11#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** mtc touch **/
		if (name.contains("MTC") || name.contains("mtc") || name.contains("ouch") || name.contains("OUCH"))
			return "*220#";
		
		/** alfa **/
		else if (name.contains("alfa") || name.contains("Alfa") || name.contains("ALFA"))
				return "*11#";

		else
			return "";
	}
}
