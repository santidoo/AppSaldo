package doo.apps.prsaldo.countries;

public class Hungary {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

            // Telekom HU
            case 21630:
                return "*102#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// T-Mobile Domino
		if (name.toLowerCase().contains("domino") || name.contains("t-"))
			return "*102#";

        // Telekom a.k.a. Magyar Telekom (formerly T-Mobile/Westel)
        else if (name.toLowerCase().contains("telekom"))
            return "*102#";

		else
			return "";
	}
}
