package doo.apps.prsaldo.countries;

public class Jamaica {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Digicel **/
			case 338050:
				return "*120#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Digicel **/ // Airtime: *124#
		if (name.contains("Digicel") || name.contains("digicel") || name.contains("DIGICEL"))
			return "*120#";

		else
			return "";
	}
}
