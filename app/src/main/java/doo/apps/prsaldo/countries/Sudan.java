package doo.apps.prsaldo.countries;

public class Sudan {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Zain SD **/
		if (name.contains("Zain") || name.contains("zain") || name.contains("ZAIN"))
			return "*888#";

        /** Sudani **/
        else if(name.contains("Sudani") || name.contains("sudani") || name.contains("SUDANI"))
        	return "*222#";

		else
			return "";
	}
}
