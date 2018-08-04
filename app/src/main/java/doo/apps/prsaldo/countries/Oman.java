package doo.apps.prsaldo.countries;

public class Oman {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			// nawras
			case 42203:
				return "*141*332#";
			
			// FRiENDi mobile
			case 42202:
				return "*122#";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// nawras
		if (name.toLowerCase().contains("nawras"))
			return "*141*332#";
		
		// FRiENDi mobile
		else if (name.toLowerCase().contains("friendi"))
			return "*122#";

		else
			return "";
	}
}
