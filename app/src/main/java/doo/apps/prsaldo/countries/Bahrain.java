package doo.apps.prsaldo.countries;

public class Bahrain {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** zain BH **/
			case 42602:
				return "*142#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** zain BH **/ // "*124#" / Dial 111 / *500# (postpaid)
		if (name.contains("zain BH") || name.contains("ZAIN") || name.contains("zain") || name.contains("Zain"))
			return "*142#";

		else
			return "";
	}
}
