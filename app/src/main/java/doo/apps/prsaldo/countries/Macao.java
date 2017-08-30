package doo.apps.prsaldo.countries;

public class Macao {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** CTM **/
			case 45501:
				return "*122#";
			
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** CTM **/
		if (name.contains("CTM") || name.contains("Ctm") || name.contains("ctm"))
			return "*122#";

		else
			return "*122#";
	}
}
