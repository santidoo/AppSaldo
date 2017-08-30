package doo.apps.prsaldo.countries;

public class Uruguay {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Antel **/
			case 74801:
				return "*77";
			
			/** movistar **/
			case 74807:
				return "s222:";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Antel **/ // *611 -> Sin costo ; *77 -> OK, pero cuesta $1 ; 226 con el texto SALDO -> INTERNET
		if (name.contains("ANTEL") || name.contains("Antel") || name.contains("antel"))
			return "*611";
		
		/** movistar **/ // *222 (costo $1 para clientes sin contrato y sin costo para contrato controlado)
		else if (name.contains("movistar") || name.contains("Movistar") || name.contains("MOVISTAR"))
			return "s222:";

		else
			return "";
	}
}
