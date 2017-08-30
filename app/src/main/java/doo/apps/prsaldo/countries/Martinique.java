package doo.apps.prsaldo.countries;

public class Martinique {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Digicel **/
		if (name.contains("Digi") || name.contains("DIGI") || name.contains("digi"))
			return "*123#";

		else
			return "";
	}
}
