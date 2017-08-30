package doo.apps.prsaldo.countries;

public class Cameroon {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** MTN **/
			case 62401:
				return "*141#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** MTN **/
		if (name.contains("MTN"))
			return "*141#";

		else
			return "";
	}
}
