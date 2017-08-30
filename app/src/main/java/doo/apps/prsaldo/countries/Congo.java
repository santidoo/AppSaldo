package doo.apps.prsaldo.countries;

public class Congo {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** MTN-CG **/
			case 62910:
				return "*555#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** MTN-CG **/
		if (name.contains("MTN-CG") || name.contains("Mtn") || name.contains("mtn"))
			return "*555#";

		else
			return "";
	}
}
