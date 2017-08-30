package doo.apps.prsaldo.countries;

public class Israel {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** JAWWAL **/
			case 42505:
				return "";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** JAWWAL **/
		if (name.contains("JAWWAL") || name.contains("Jawwal") || name.contains("jawwal"))
			return "";

		else
			return "";
	}
}
