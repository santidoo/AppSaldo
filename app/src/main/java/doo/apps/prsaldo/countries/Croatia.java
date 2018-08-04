package doo.apps.prsaldo.countries;

public class Croatia {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

            // HT HR, T-Mobile/Cronet aka Hrvatski Telekom
            case 21901:
                return "*100#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// Tele2 | *130#
		if (name.toLowerCase().contains("tele2"))
			return "*150#";

        // VIP
        else if (name.toLowerCase().contains("vip"))
            return "*101#";

        // HT HR - Hrvatski Telekom
        else if (name.toLowerCase().contains("ht") || name.toLowerCase().contains("telekom") || name.toLowerCase().contains("hrvatski"))
            return "*100#";

		else
			return "";
	}
}
