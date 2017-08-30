package doo.apps.prsaldo.countries;

public class HongKong {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			/** SmarTone Mobile Communications Ltd **/
			case 45406:
				return "*#123#";
				
			/** 3 Three **/
			case 45403:
				return "*##107#";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** PCCW-HKT **/
		if (name.contains("PCCW-HKT") || name.contains("PCCW") || name.contains("ccw") || name.contains("hkt"))
			return "##122#";
		
		/** SmarTone Mobile Communications Ltd **/ // *111#
		else if (name.contains("SmarTone") || name.contains("SMARTONE") || name.contains("Smartone"))
			return "*#123#";
		
		/** 3 Three | Hutchison 3G | Hutchison Telecom (HK) Ltd (3) | 3 HK **/
		else if (name.contains("3") || name.contains("THREE") || name.contains("three") || name.contains("Three"))
			return "*##107#";

		else
			return "";
	}
}
