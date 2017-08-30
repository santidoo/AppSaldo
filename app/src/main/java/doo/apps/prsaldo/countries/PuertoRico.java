package doo.apps.prsaldo.countries;

public class PuertoRico {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** CLARO P.R. **/
			case 330110:
				return "*611#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** CLARO P.R. **/
		if (name.contains("Claro") || name.contains("claro") || name.contains("CLARO"))
			return "*611#";
		
		else
			return "";
	}
}
