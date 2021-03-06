package doo.apps.prsaldo.countries;

public class China {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

            // CMCC aka China Mobile Communications Corporation
            case 46000:
                return "s10086:ye";
			
			// China Telecom
			case 46003:
				return "s10086:ye";
				
			// MECTel,MPT | MECTel,Telenor
			case 41403:
				return "*444#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// China Telecom | s10001:102 or "s10001:101" or text "ye" to 10086
		if (name.toLowerCase().contains("telecom"))
			return "s10086:ye";

        // CMCC aka China Mobile Communications Corporation
        else if (name.toLowerCase().contains("cmcc"))
            return "s10086:ye";

		// MPT | no codes in internet, so i put the one for china telecom
		else if (name.toLowerCase().contains("mpt"))
			return "s10086:ye";

		// MECTel, Telenor | *111# (like a menu…) or *122# (creo que no china..) or *444#
		else if (name.toLowerCase().contains("telenor") || name.toLowerCase().contains("mectel"))
			return "*444#";

		else
			return "";
	}
}

/*
  text "YE" to "10010" on China Unicom to check balance.
  text "113" to "10086" on China Mobile to check balance.
  http://cellularhowto.com/china/how-to-check-balance-on-china-mobile
 */
