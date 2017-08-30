package doo.apps.prsaldo.countries;

public class Haiti {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** NATCOM **/
			case 37203:
				return "*101#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** NATCOM **/
		if (name.contains("NATCOM") || name.contains("Natcom") || name.contains("natcom"))
			return "*101#";

		else
			return "";
	}
}
