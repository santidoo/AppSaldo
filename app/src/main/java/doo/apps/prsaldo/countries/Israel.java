package doo.apps.prsaldo.countries;

public class Israel {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// JAWWAL
			case 42505:
				return "";

            // Pelephone | *998 or *199
            case 42503:
                return "*998";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// JAWWAL
		if (name.toLowerCase().contains("jawwal"))
			return "";

        // Pelephone | *998 or *199
        else if (name.toLowerCase().contains("pelephone"))
            return "*998";

		else
			return "";
	}
}
