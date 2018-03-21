package doo.apps.prsaldo.countries;

public class Singapore {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// SingTel
			case 52501:
				return "100#";

            // StarHub
            case 52505:
                return "*123#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// SingTel | *1344 (option 2) or *1626
		if (name.toLowerCase().contains("singtel"))
			return "100#";

        // StarHub
        else if (name.toLowerCase().contains("starhub"))
            return "*123#";

		else
			return "";
	}
}
