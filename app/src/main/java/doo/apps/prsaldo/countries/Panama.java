package doo.apps.prsaldo.countries;

public class Panama {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			/** +Movil **/
			case 71401:
				return "*165#";
				
			/** CLARO **/
			case 71403:
				return "*103#";
				
			/** DIGICEL **/
			case 71404:
				return "*120#";

			/** movistar **/
			case 714020:
				return "*123#";

			default:
				return getCodeByName(name);
		}
	}

	static private String getCodeByName(String name) {

		/** DIGICEL **/
		if (name.contains("DIGICEL") || name.contains("igicel") || name.contains("igiCel"))
			return "*120#";

		/** +Movil **/
		else if (name.contains("+Movil"))
			return "*165#";

		/** movistar **/
		else if (name.contains("movistar") || name.contains("Movistar") || name.contains("MOVISTAR"))
			return "*123#";
		
		/** CLARO **/
		else if (name.contains("CLARO") || name.contains("Claro") || name.contains("claro"))
			return "*103#";

		else
			return "";
	}
}
