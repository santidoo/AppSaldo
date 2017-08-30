package doo.apps.prsaldo.countries;

public class Cuba {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Cubacell **/
			case 36801:
				return "*222#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Cubacell **/ // *666
		if (name.toLowerCase().contains("cubacell"))
			return "*222#";

		else
			return "";
	}
}
