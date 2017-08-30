package doo.apps.prsaldo.countries;

public class Serbia {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Telenor **/
		if (name.contains("TELENOR") || name.contains("Telenor") || name.contains("telenor"))
			return "*121#";

		else
			return "";
	}
}
