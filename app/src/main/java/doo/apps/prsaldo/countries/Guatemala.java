package doo.apps.prsaldo.countries;

public class Guatemala {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			/** Claro **/
			case 70401:
				return "*5#";
				
			/** tigo Guatemala  **/
			case 70402:
				return "*256";
				
			/** Movistar **/
			case 70403:
				return "*333";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Claro **/ // Costo de Q. 1.00
		if (name.toLowerCase().contains("claro"))
			return "*5#";
		
		/** Tigo Guatemala **/ // "s256:SALDO"
		else if (name.toLowerCase().contains("tigo"))
			return "*256";
		
		/** Movistar **/ // *333 or SALDO al 700
		else if (name.toLowerCase().contains("movistar"))
			return "*333";

		else
			return "";
	}
}

/** http://www.claro.com.gt/wps/portal/gt/pc/personas/movil/prepago/otros-servicios/con-costo **/
