package doo.apps.prsaldo.countries;

public class Ghana {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			/** MTN **/ // *141#
			case 62001:
				return "*124#";
				
			/** Tigo **/
			case 62003:
				return "*821#";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** MTN **/ // *141#
		if (name.contains("MTN") || name.contains("Mtn") || name.contains("mtn"))
			return "*124#";
		
		/** Tigo **/
		else if (name.contains("Tigo") || name.contains("TIGO") || name.contains("tigo"))
			return "*821#";

		else
			return "";
	}
}

