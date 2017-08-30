package doo.apps.prsaldo.countries;

public class El_Salvador {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** TIGO **/
			case 70603:
				return "*725#";
				
			/** DIGICEL **/
			case 70602:
				return "*120#";
				
			/** Movistar **/ 
			case 70604:
				return "..";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** TIGO **/
		if (name.contains("TIGO") || name.contains("Tigo") || name.contains("tigo"))
			return "*725#";
		
		/** Claro **/
		else if (name.contains("CLARO") || name.contains("Claro") || name.contains("claro"))
			return "s72536:saldo";
		
		/** DIGICEL **/
		else if (name.contains("DIGICEL") || name.contains("digicel") || name.contains("Digicel"))
			return "*120#";
		
		/** Movistar **/ // Marcando gratis *333 (o *555)
		else if (name.contains("Movistar") || name.contains("MOVISTAR") || name.contains("movistar"))
			return "s700:SALDO";

		else
			return "";
	}
}
