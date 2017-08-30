package doo.apps.prsaldo.countries;

public class Algeria {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Nedjma **/
			case 60303:
				return "*200#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Nedjma **/ // or calling 222
		if (name.contains("Nedjma") || name.contains("nedjma") || name.contains("NEDJMA"))
			return "*200#";

		else
			return "";
	}
}
