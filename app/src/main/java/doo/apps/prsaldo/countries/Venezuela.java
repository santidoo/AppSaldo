package doo.apps.prsaldo.countries;

public class Venezuela {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** MOVILNET **/ // Post-paid - "s611:Saldo"
			case 73406:
				return "*55";
				
			/** DIGICEL **/
			case 73402:
				return "*123#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** MOVILNET **/
		if (name.contains("MOVILNET") || name.contains("Movilnet") || name.contains("movilnet"))
			return "*55";
		
		/** Cantv Habla Ya **/
		else if (name.contains("CANTV") || name.contains("Cantv") || name.contains("cantv"))
			return "";

		/** DIGICEL **/
		else if (name.contains("DIGICEL") || name.contains("igicel") || name.contains("igiCel"))
			return "*123#";
		
		/** Movistar **/
		else if (name.contains("Movistar") || name.contains("movistar") || name.contains("MOVISTAR"))
			return "*88";
		
		else
			return "";
	}
}
