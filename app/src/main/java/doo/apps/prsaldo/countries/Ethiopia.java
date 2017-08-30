package doo.apps.prsaldo.countries;

public class Ethiopia {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** ethio tel **/
			case 63601:
				return "*804#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** ethio tel **/
		if (name.contains("ethio tel") || name.contains("Ethio") || name.contains("ethio"))
			return "*804#";
		
		else
			return "";
	}
}
