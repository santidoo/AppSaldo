package doo.apps.prsaldo.countries;

public class Barbados {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** LIME **/
			case 342600:
				return "*120#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** LIME **/
		if (name.contains("LIME") || name.contains("Lime") || name.contains("lime"))
			return "*120#";

		else
			return "";
	}
}
