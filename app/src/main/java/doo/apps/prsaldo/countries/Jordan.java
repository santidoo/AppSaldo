package doo.apps.prsaldo.countries;

public class Jordan {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** umniah **/
			case 41603:
				return "*155#";
			
			/** zain JO **/
			case 41601:
				return "*116#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** umniah | Orange **/
		if (name.contains("umniah") || name.contains("Orange") || name.contains("orange"))
			return "*155#";
		
		/** zain JO **/
		else if (name.contains("zain JO") || name.contains("ZAIN") || name.contains("zain") || name.contains("Zain"))
			return "*116#";

		else
			return "";
	}
}
