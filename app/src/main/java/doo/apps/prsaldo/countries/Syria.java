package doo.apps.prsaldo.countries;

public class Syria {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
						
			/** MTN **/
			case 41702:
				return "*100#";
				
			/** Syriatel **/
			case 41701:
				return "*100#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
			
		/** MTN **/
		if (name.toLowerCase().contains("mtn"))
			return "*100#";

		/** Syriatel **/
		else if (name.toLowerCase().contains("syriatel"))
			return "*100#";
		
		else
			return "";
	}
}
