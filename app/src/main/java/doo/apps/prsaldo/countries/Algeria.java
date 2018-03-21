package doo.apps.prsaldo.countries;

public class Algeria {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// Nedjma
			case 60303:
				return "*200#";

            // mobilis
            case 60301:
                return "*600#";

            // Djezzy | calling number 710
            case 60302:
                return "*777#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {

        // Nedjma | or calling 222
		if (name.toLowerCase().contains("nedjma"))
			return "*200#";

        // mobilis | or *222#
        else if (name.toLowerCase().contains("mobilis"))
            return "*600#";

        // Djezzy | calling number 710
        else if (name.toLowerCase().contains("djezzy"))
            return "*777#";

		else
			return "";
	}
}
