package doo.apps.prsaldo.countries;

public class Belice {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** DigiCell / Belize Telimedia Limited **/
			case 70267:
				return "*72#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** DigiCell / Belize Telimedia Limited **/
		if (name.toLowerCase().contains("digicell") || name.toLowerCase().contains("telimedia"))
			return "*72#";

		else
			return "";
	}
}
