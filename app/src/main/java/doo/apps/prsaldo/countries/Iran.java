package doo.apps.prsaldo.countries;

public class Iran {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Irancell **/
			case 43235:
				return "*141*1#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Irancell **/
		if (name.contains("Irancell") || name.contains("irancell") || name.contains("IRANCELL"))
			return "*141*1#";

		else
			return "";
	}
}
