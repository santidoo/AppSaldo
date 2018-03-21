package doo.apps.prsaldo.countries;

public class CostaRica {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			//  ICE Kolbi
			case 71201:
				return "*1150#";
				
			//  ICE Kolbi
			case 71202:
				return "*1150#";				

			// Claro CR
			case 71203:
				return "*30";
				
			// Movistar CR - kolbi? | *650#
			case 71204:
				return "*123#";
				
			// fullmovil
			case 71220:
				return "*123#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// Claro CR
		if (name.toLowerCase().contains("claro") || name.toLowerCase().contains("cr"))
			return "*30";
		
		// Movistar CR - kolbi? | *123# or "s651:SALDO"
		else if (name.toLowerCase().contains("movistar"))
			return "*123#";

		//  fullmovil
		else if (name.toLowerCase().contains("fullmovil"))
			return "*123#";
		
		//  Kolbi ICE | or "s1150:" or *1151#
		else if (name.toLowerCase().contains("kolbi") || name.toLowerCase().contains("ice"))
			return "*1150#";

		else
			return "";
	}
}

// http://prepaid-data-sim-card.wikia.com/wiki/Costa_Rica
