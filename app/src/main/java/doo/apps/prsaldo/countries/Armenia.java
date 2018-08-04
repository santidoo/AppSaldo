package doo.apps.prsaldo.countries;

public class Armenia {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

            // Beeline AM
            case 28301:
                return "*102#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// VivaCell-MTS
		if (name.toLowerCase().contains("mts") || name.toLowerCase().contains("viva"))
			return "*122#";

        // Beeline AM
        else if (name.toLowerCase().contains("beeline"))
            return "*102#";

		else
			return "";
	}
}
