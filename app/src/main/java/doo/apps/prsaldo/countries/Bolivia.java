package doo.apps.prsaldo.countries;

public class Bolivia {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// MOVIL 4G | Entel
			case 73602:
				return "*105#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// MOVIL 4G | Entel | SALDO al 330
		if (name.toLowerCase().contains("movil 4g") || name.contains("entel"))
			return "*105#";
		
		// TIGO
		else if (name.toLowerCase().contains("tigo"))
			return "*123#";
		
		// VIVA | s105:c
		else if (name.toLowerCase().contains("viva"))
			return "*105#";

		else
			return "";
	}
}
