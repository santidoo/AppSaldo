package doo.apps.prsaldo.countries;

public class Somalia {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// HORMUUD
			case 63750:
				return "*122#";

            // Telesom
            case 63701:
                return "*122#";

            // SOMNET
            case 63720:
                return "*132#";

            // Somtel - Mubarak
            case 63771:
                return "*142#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// HORMUUD
		if (name.toLowerCase().contains("hormuud"))
			return "*122#";

        // telesom
        else if (name.toLowerCase().contains("telesom"))
            return "*122#";

        // SOMNET | call 132
        else if (name.toLowerCase().contains("somnet"))
            return "*132#";

        // Somtel - Mubarak
        else if (name.toLowerCase().contains("mubarak") || name.toLowerCase().contains("somtel"))
            return "*142#";

		else
			return "";
	}
}

// https://www.azercell.com/en/personal/services/payment_balance/balance_info/

