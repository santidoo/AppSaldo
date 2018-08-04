package doo.apps.prsaldo.countries;

public class Morocco {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// Maroc Telecom
			case 60401:
				return "#580#";

            // Orange (Medi-Telecom), Meditel | Dial 5554
            case 60400:
                return "#554#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// inwi / Maroc Telecom | "d1202"
		if (name.toLowerCase().contains("inwi") || name.toLowerCase().contains("wana"))
			return "*120*30#";
		
		// Maroc Telecom
		else if (name.toLowerCase().contains("maroc"))
			return "#580#";

        // Orange (Medi-Telecom) | Dial 5554
        else if (name.toLowerCase().contains("orange") || name.toLowerCase().contains("meditel"))
            return "#554#";

		else
			return "";
	}
}
