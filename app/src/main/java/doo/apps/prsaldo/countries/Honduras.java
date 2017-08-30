package doo.apps.prsaldo.countries;

public class Honduras {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** TIGO **/
			case 708020:
				return "#111#";
				
			/** Claro **/
			case 708001:
				return "*120#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** TIGO **/ // #123#
		if (name.contains("TIGO") || name.contains("tigo") || name.contains("Tigo"))
			return "*111#";
		
		/** Claro **/ // GRATIS llamando al *55
		else if (name.contains("Claro") || name.contains("claro") || name.contains("CLARO"))
			return "*120#";

		else
			return "";
	}
}
