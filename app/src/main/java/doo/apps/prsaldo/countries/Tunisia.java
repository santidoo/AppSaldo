package doo.apps.prsaldo.countries;

public class Tunisia {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** ELISSA / Tunisie Telecom / TUNTEL  **/
			case 60502:
				return "*122#";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** TUNTEL / tunisie telecom **/
		if (name.toLowerCase().contains("tuntel"))
			return "*122#";
		
		/** ELISSA **/ 
		else if (name.toLowerCase().contains("elissa"))
			return "*122#";
		
		/** TUNISIANA | ooredoo **/ // d1222 
		else if (name.toLowerCase().contains("tunisiana") || name.toLowerCase().contains("ooredoo"))
			return "*100#";
		
		/** Orange Tunisie **/
		else if (name.toLowerCase().contains("orange"))
			return "*101#";

		else
			return "";
	}
}
