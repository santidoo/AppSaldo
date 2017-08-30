package doo.apps.prsaldo.countries;

public class Kazakhstan {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			/** Beeline **/
			case 40101:
				return "*102#";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Kcell **/
		if (name.contains("ell") || name.contains("KCELL") || name.contains("Fintir") || name.contains("Kazakh"))
			return "*123*3*1#";
		
		/** Beeline **/
		else if (name.contains("Beeline") || name.contains("beeline") || name.contains("BEELINE"))
			return "*102#";

		else
			return "";
	}
}
