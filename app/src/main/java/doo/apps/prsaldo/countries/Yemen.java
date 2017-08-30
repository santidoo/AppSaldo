package doo.apps.prsaldo.countries;

public class Yemen {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** MTN **/
			case 42102:
				return "222";
				
			/** SabaFon **/
			case 42101:
				return "*102#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** MTN **/ // or 444
		if (name.contains("MTN") || name.contains("mtn") || name.contains("Mtn"))
			return "222";
		
		/** SabaFon **/ // *102# -> Roaming
		else if (name.contains("SabaFon") || name.contains("SabaFon") || name.contains("SabaFon"))
			return "*102#";

		else
			return "";
	}
}
