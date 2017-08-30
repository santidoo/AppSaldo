package doo.apps.prsaldo.countries;

public class Belarus {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** MTS.BY **/
			case 25702:
				return "*100#";
				
			/** life:) BY **/
			case 25704:
				return "*100#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** MTS.BY **/
		if (name.contains("MTS.BY") || name.contains("mts"))
			return "*100#";
		
		/** life:) BY **/ // OR *105#
		if (name.contains("life:) BY") || name.contains("LIFE") || name.contains("Life") || name.contains("life"))
			return "*100#";

		else
			return "";
	}
}
