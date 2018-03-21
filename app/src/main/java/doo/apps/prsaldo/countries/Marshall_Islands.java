package doo.apps.prsaldo.countries;

public class Marshall_Islands {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// NTA or MINTA
            case 55101:
                return "";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// NTA or Marshall Islands National Telecommunications Authority (MINTA)
		if (name.toLowerCase().contains("nta") || name.toLowerCase().contains("minta"))
			return "";
		
		else
			return "";
	}
}
