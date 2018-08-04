package doo.apps.prsaldo.countries;

public class Kyrgyzstan {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// Beeline KG
			case 43701:
				return "*102#";

            // O!
            case 43709:
                return "*100#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// Beeline KG
		if (name.toLowerCase().contains("beeline"))
			return "*102#";

        // MegaCom
        else if (name.toLowerCase().contains("megacom"))
            return "*500#";

            // O!
        else if (name.toLowerCase().contains("o!"))
            return "*100#";

		else
			return "";
	}
}
