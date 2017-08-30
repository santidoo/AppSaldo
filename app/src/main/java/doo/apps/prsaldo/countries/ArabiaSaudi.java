package doo.apps.prsaldo.countries;

public class ArabiaSaudi {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** STC **/
			case 42001:
				return "*166#";
				
			/** mobily **/
			case 42003:
				return "*1411#";
			
			/** zain SA **/	
			case 42004:
				return "*142#";
				
			/** FRiENDi mobile | Virgin Mobile | STC **/
			case 42005:
				return getCodeByName(name);
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** mobily **/ // *1422#
		if (name.toLowerCase().contains("mobily"))
			return "*1411#";
		
		/** zain SA **/
		else if (name.toLowerCase().contains("zain"))
			return "*142#";
		
		/** FRiENDi mobile **/
		else if (name.toLowerCase().contains("friendi"))
			return "*102#";
		
		/** STC **/
		else if (name.toLowerCase().contains("stc"))
			return "*166#";
		
		/** Virgin Mobile **/ // Apparently STC too. *166# or call 1500 (free of charge) 
		else if (name.toLowerCase().contains("virgin"))
			return "*166#";

		else
			return "";
	}
}
