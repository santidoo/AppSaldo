package doo.apps.prsaldo.countries;

public class Nicaragua {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Claro **/
			case 71021:
				return "*812";
				
			/** movistar **/
			case 710300:
				return "*72536";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Claro **/
		if (name.contains("Claro"))
			return "*812";
		
		/** movistar **/ // Envia SALDO al 611
		else if (name.contains("movistar") || name.contains("Movistar"))
			return "*72536";

		else
			return "";
	}
}
