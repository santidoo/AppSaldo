package doo.apps.prsaldo.countries;

public class Tanzania {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// VodaCom Tanzania
			case 64004:
				return "*149*60#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// VodaCom Tanzania | airtime balance *102# or send "BALANCEDATA" to 15300 or *100#
		if (name.toLowerCase().contains("vodacom"))
			return "*149*60#"; // check bundle (can be internet or balance)

        // airtel
        else if (name.toLowerCase().contains("airtel"))
            return "*102#";

        // tigo
        else if (name.toLowerCase().contains("tigo"))
            return "*102#";

        // Halotel
        else if (name.toLowerCase().contains("halotel"))
            return "*102#";

		else
			return "";
	}
}
