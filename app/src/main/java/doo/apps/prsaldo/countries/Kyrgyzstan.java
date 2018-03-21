package doo.apps.prsaldo.countries;

public class Kyrgyzstan {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// Beeline KG
			case 43701:
				return "*102#";

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

		else
			return "";
	}
}
