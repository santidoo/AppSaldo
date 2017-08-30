package doo.apps.prsaldo.countries;

public class Sweden {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Comviq | Tele2 **/
			case 24007:
				return "*111#";
				
			/** halebop **/
			case 24001:
				return "*101#";
				
			/** 3 (tre) **/
			case 24002:
				return "*133#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Comviq | Tele2 **/
		if (name.contains("Tele2") || name.contains("TELE") || name.contains("ele") || 
			name.contains("Comviq"))
			return "*111#";

        /** Telia **/
        else if(name.contains("elia") || name.contains("TELIA"))
        	return "*120#";
		
        /** halebop **/
        else if(name.contains("halebop") || name.contains("Halebop") || name.contains("HALEBOP"))
        	return "*101#";
		
		/** 3 (tre) **/
        else if(name.contains("3") || name.contains("Tre") || name.contains("tre") || name.contains("TRE"))
        	return "*133#";

		else
			return "";
	}
}
