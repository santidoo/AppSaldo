package doo.apps.prsaldo.countries;

public class Jamaica {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// Digicel
			case 338050:
				return "*120#";

            // LIME (or FLOW) | or *129# or sending "BAL" to 127 or send text "bcc" to 124
            case 338180:
                return "*120#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// Digicel | Airtime: *124#
		if (name.toLowerCase().contains("digicel"))
			return "*120#";

        // LIME (or FLOW) | or *129# or sending "BAL" to 127 or send text "bcc" to 124
        else if (name.toLowerCase().contains("lime") || name.toLowerCase().contains("flow"))
            return "*120#";

		else
			return "";
	}
}
