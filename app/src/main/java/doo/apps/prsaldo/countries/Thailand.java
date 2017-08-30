package doo.apps.prsaldo.countries;

public class Thailand {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** DTAC, DTAC/DTN/Tri-NET **/
			case 52005:
				return "*101*9#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** AIS **/ // Old *139#
		if (name.contains("AIS") || name.contains("ais") || name.contains("Ais"))
			return "*121#";

        /** Truemove **/
        else if(name.contains("True") || name.contains("TRUE") || name.contains("True"))
        	return "#123#";
		
        /** Dtac **/ // *101# (Thai message) and *101*9# (english)
        else if(name.contains("DTAC") || name.contains("tac"))
        	return "*101*9#";

		else
			return "";
	}
}
