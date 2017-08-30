package doo.apps.prsaldo.countries;

public class CzechRepublic {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** O2-CZ **/
			case 23002:
				return "*104*#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** O2-CZ **/
		if (name.contains("O2-CZ") || name.contains("O2") || name.contains("o2"))
			return "*104*#";

		else
			return "";
	}
}
