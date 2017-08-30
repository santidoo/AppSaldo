package doo.apps.prsaldo.countries;

public class Bulgaria {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			/** BG GLOBUL **/
			case 28405:
				return "*123*1#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
			
		/** BG GLOBUL **/
		if (name.contains("BG GLOBUL") || name.contains("Globul") || name.contains("globul"))
			return "*123*1#";

		else
			return "";
	}
}
