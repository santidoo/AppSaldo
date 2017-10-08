package doo.apps.prsaldo.countries;

public class Iraq {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// Asiacell
			case 41805:
				return "*133#";

            // KOREK (KorekTel)
            case 41840:
                return "*211#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// Asiacell
		if (name.toLowerCase().contains("asiacell"))
			return "*133#";

        // KOREK (KorekTel) | or 211 or 321 or *212*1*2#
        else if (name.toLowerCase().contains("korek"))
            return "*211#";

		else
			return "";
	}
}
