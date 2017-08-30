package doo.apps.prsaldo.countries;

public class Iraq {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Asiacell **/
			case 41805:
				return "*133#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Asiacell **/
		if (name.contains("Asiacell") || name.contains("asiacell") || name.contains("ASIACELL"))
			return "*133#";

		else
			return "";
	}
}
