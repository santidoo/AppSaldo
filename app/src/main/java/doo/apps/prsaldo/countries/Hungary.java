package doo.apps.prsaldo.countries;

public class Hungary {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** T-Mobile Domino **/
		if (name.contains("DOMINO") || name.contains("omino") || name.contains("T-") || name.contains("t-"))
			return "*102#";
		
		/** T-Mobile, Telenor and Vodafone. **/

		else
			return "";
	}
}
