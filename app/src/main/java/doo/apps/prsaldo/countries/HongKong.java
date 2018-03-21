package doo.apps.prsaldo.countries;

public class HongKong {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			// SmarTone Mobile Communications Ltd
			case 45406:
				return "*#123#";
				
			// 3 Three
			case 45403:
				return "*##107#";

            // 1528 SMART aka CSL | *109# or ##121#
            case 45400:
                return "*109#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// PCCW-HKT
		if (name.toLowerCase().contains("hkt") || name.toLowerCase().contains("pccw"))
			return "##122#";
		
		// SmarTone Mobile Communications Ltd | *111#
		else if (name.toLowerCase().contains("smartone"))
			return "*#123#";
		
		// 3 Three - Hutchison 3G - Hutchison Telecom (HK) Ltd (3) - 3 HK
		else if (name.contains("3") || name.toLowerCase().contains("three"))
			return "*##107#";

        // 1528 SMART aka CSL | *109# or ##121#
        else if (name.toLowerCase().contains("csl") || name.toLowerCase().contains("smart") || name.contains("1528"))
            return "*109#";

		else
			return "";
	}
}
