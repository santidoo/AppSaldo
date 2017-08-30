package doo.apps.prsaldo.countries;

public class Norway {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Telenor **/
			case 24201:
				return "s2525:SALDO";
				
			/** Chess / Netcom **/
			case 24202:
				return "*150#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Telenor **/ // 91500500 or SALDO to 1999
		if (name.toLowerCase().contains("telenor"))
			return "s2525:SALDO";
		
		/** Chess **/
		else if (name.toLowerCase().contains("chess"))
			return "*150#";
		
		/** MyCall (formely Lebara Norway) **/
		else if (name.toLowerCase().contains("mycall") || name.toLowerCase().contains("lebara"))
			return "*150#";

		else
			return "";
	}
}

/** http://wiki.apnchanger.org/Norway **/
