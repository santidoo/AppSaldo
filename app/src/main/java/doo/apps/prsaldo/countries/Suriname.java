package doo.apps.prsaldo.countries;

public class Suriname {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Digicel **/
		if (name.contains("Digicel") || name.contains("DIGICEL") || name.contains("igiCel") || name.contains("igi"))
			return "*120#";

		else
			return "";
	}
}
