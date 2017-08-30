package doo.apps.prsaldo.countries;

public class Nepal {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Namaste **/
			case 42901:
				return "*400#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Ncell **/
		if (name.contains("Ncell") || name.contains("CELL") || name.contains("ell"))
			return "*101#";

        /** NTC **/
        else if(name.contains("NTC") || name.contains("ntc") || name.contains("Ntc"))
        	return "*400#";
		
        /** Namaste **/ // Dial 1414
        else if(name.contains("Namaste") || name.contains("namaste") || name.contains("NAMASTE"))
        	return "*400#";

		else
			return "";
	}
}
