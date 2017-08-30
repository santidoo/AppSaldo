package doo.apps.prsaldo.countries;

public class Argentina {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Claro AR **/
			case 722310:
				return "*611*4*1#";
				
			/** Movistar **/ // Coste $0.24
			case 72207:
				return "s*444:Saldo";
				
			/** Personal **/
			case 72234:
				return "*150#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Claro AR **/ // *555 or s555:saldo
		if (name.toLowerCase().contains("claro"))
			return "*611*4*1#";
		
		/** Movistar **/ // Coste $0.24
		else if (name.toLowerCase().contains("movistar"))
			return "s*444:Saldo";
		
		/** Personal **/
		else if (name.toLowerCase().contains("personal"))
			return "*150#";

		else
			return "";
	}
}
