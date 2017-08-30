package doo.apps.prsaldo.countries;

public class Angola {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** UNITEL **/
			case 63102:
				return "*103#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** UNITEL **/ // *103# or *102#
		if (name.toLowerCase().contains("unitel"))
			return "*103#";

        /** Movicel **/ // or "s19196:"
        else if(name.toLowerCase().contains("movicel"))
        	return "*196#";

		else
			return "";
	}
}
