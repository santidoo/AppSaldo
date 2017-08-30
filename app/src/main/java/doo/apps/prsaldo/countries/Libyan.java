package doo.apps.prsaldo.countries;

public class Libyan {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Libyana **/
			case 60600:
				return "*121#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Libyana **/
		if (name.contains("Libyana") || name.contains("libyana") || name.contains("LIBYANA"))
			return "*121#";

		else
			return "";
	}
}
