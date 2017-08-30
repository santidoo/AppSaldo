package doo.apps.prsaldo.countries;

public class NewZealand {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** vodafone NZ **/
			case 53001:
				return "s777:BAL";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** vodafone NZ **/
		if (name.contains("vodafone") || name.contains("Vodafone") || name.contains("VODAFONE"))
			return "s777:BAL";

		else
			return "";
	}
}
