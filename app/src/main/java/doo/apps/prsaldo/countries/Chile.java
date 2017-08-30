package doo.apps.prsaldo.countries;

public class Chile {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** movistar **/
			case 73002:
				return "*300#";
				
			/** Claro **/
			case 73003:
				return "*103#";

			/** Virgin **/
			case 73007:
				return "103";
				
			/** vtr **/
			case 73008:
				return "*103#";

			/** WOM **/
			case 73009:
				return "*611#";			
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** movistar **/
		if (name.toLowerCase().contains("movistar"))
			return "*300#";
		
		/** Entel Telefonica Móvil **/
		else if (name.toLowerCase().contains("entel"))
			return "*103#";

		/** Claro **/
		else if (name.toLowerCase().contains("claro"))
			return "*103#";
		
		/** Virgin **/ // 103 (free) or *151# ($30)
		else if (name.toLowerCase().contains("virgin"))
			return "103";
		
		/** vtr **/
		else if (name.toLowerCase().contains("vtr"))
			return "*103#";
		
		/** wom | nextel **/ // *611# o *611
		else if (name.toLowerCase().contains("wom") || name.toLowerCase().contains("nextel"))
			return "*611#";

		else
			return "";
	}
}
