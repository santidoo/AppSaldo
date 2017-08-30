package doo.apps.prsaldo.countries;

public class Ecuador {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Movistar **/
			case 74000:
				return "*100#";
				
			/** CLARO **/
			case 74001:
				return "*102#";

			/** CNT **/
			case 74002:
				return "*611#";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** CLARO **/ // *102# o *123#
		if (name.contains("CLARO") || name.contains("Claro") || name.contains("claro"))
			return "*102#";

		/** Movistar **/ // marcando *001, *520, *100# o también puedes enviar SALDO al 654.
		else if (name.contains("Movistar") || name.contains("MOVISTAR") || name.contains("ovistar"))
			return "*100#";
		
		/** CNT **/
		else if (name.contains("CNT") || name.contains("cnt") || name.contains("Cnt"))
			return "*611#";
		
		else
			return "";
	}
}
