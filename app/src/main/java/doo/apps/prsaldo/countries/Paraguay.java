package doo.apps.prsaldo.countries;

public class Paraguay {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// Personal
			case 74405:
				return "*121#";
				
			// TIGO
			case 74404:
				return "*611#";

            // Claro PY | SALDO al 222 or *222
            case 74402:
                return "*111#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {

		// Personal
		if (name.toLowerCase().contains("personal"))
			return "*121#";
		
		// TIGO - Telecel | *611# y *222#
		else if (name.toLowerCase().contains("tigo"))
			return "*611#";

        // Claro PY | s222:SALDO o *222
        else if (name.toLowerCase().contains("claro"))
            return "*111#";

        else return "";
    }
}
