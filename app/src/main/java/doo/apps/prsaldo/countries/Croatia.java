package doo.apps.prsaldo.countries;

public class Croatia {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Tele2 **/
		if (name.contains("Tele2") || name.contains("TELE") || name.contains("ele"))
			return "*130#";

		else
			return "";
	}
}
