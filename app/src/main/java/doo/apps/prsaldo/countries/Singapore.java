package doo.apps.prsaldo.countries;

public class Singapore {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** SingTel **/
			case 52501:
				return "100#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** SingTel **/ //*1344 (option 2) or *1626
		if (name.contains("SingTel") || name.contains("SINGTEL") || name.contains("singtel"))
			return "100#";

		else
			return "";
	}
}
