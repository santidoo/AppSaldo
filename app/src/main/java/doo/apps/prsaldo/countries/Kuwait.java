package doo.apps.prsaldo.countries;

public class Kuwait {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			/** Zain KW **/
			case 41902:
				return "*142#";
				
			/** Ooredoo **/
			case 41903:
				return "*555#";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Zain KW **/
		if (name.contains("Zain KW") || name.contains("ZAIN") || name.contains("Zain") || name.contains("zain"))
			return "*142#";
		
		/** Ooredoo **/
		else if (name.contains("Ooredoo") || name.contains("ooredoo"))
			return "*555#";

		else
			return "";
	}
}

