package doo.apps.prsaldo.countries;

public class Turkey {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// AVEA
			case 28603:
				return "*123#";
			
			case 28601:
				return "*123#";

            // Telsim (Vodafone)
            case 28602:
                return "*123#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// AVEA | text KONTOR to 9333
		if (name.toLowerCase().contains("avea"))
			return "*123#";
		
		// Turkcell
		else if (name.toLowerCase().contains("turkcell"))
			return "*123#";

        // Telsim (Vodafone) | *153# or Text "BAKIYE" to 7501
        else if (name.toLowerCase().contains(""))
            return "*123#";

		else
			return "";
	}
}
