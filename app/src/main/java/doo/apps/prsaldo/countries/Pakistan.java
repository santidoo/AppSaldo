package doo.apps.prsaldo.countries;

public class Pakistan {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// Mobilink | at Rs 0.20+tax
			case 41001:
				return "*111#";

            // Verizon | dial #BAL
            case 41003:
                return "#225";

            case 41004:
				return "*222#";
				
			// Telenor
			case 41006:
				return "*444#";

            // WARID Telecom
            case 41007:
                return "*100#";

            // NetworkOperator for Telenor PK
            case 42203:
                return "*444#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// ZONG
		if (name.toLowerCase().contains("zong"))
			return "*222#";
		
		// Telenor
		else if (name.toLowerCase().contains("telenor"))
			return "*444#";
		
		// Ufone
		else if (name.toLowerCase().contains("ufone"))
			return "*124#";
		
		// Mobilink Jazz | "*106*2*", "*101*2" at Rs 0.20+tax
		else if (name.toLowerCase().contains("jazz") || name.toLowerCase().contains("mobilink"))
			return "*111#";
		
		// Glow
		else if (name.toLowerCase().contains("glow"))
			return "*100#";

        // WARID Telecom | dial 121
		else if (name.toLowerCase().contains("warid"))
			return "*100#";

        // Verizon
        else if (name.toLowerCase().contains("verizon"))
            return "#225";

		else
			return "";
	}
}
