package doo.apps.prsaldo.countries;

public class Egypt {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Mobinil | Vodafone? **/
			case 60201:
				return "#100*3#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Vodafone Egypt **/
		if (name.toLowerCase().contains("vodafone"))
			return "*868*1#";
		
		/** Mobinil | Vodafone? **/
		else if (name.toLowerCase().contains("mobinil"))
			return "#100*3#";
		
		/** etisalat **/ // *121#
		else if (name.toLowerCase().contains("etisalat")) 
			return "";
		
		else
			return "";
	}
}
