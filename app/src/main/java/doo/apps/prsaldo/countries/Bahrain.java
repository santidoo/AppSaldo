package doo.apps.prsaldo.countries;

public class Bahrain {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// zain BH
			case 42602:
				return "*142#";

            // VIVA
            case 42604:
                return "*101#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// zain BH | "*124#" or Dial 111 or *500# (postpaid)
		if (name.toLowerCase().contains("zain"))
			return "*142#";

        // VIVA
        else if (name.toLowerCase().contains("viva"))
            return "*101#";

		else
			return "";
	}
}
