package doo.apps.prsaldo.countries;

public class Romania {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			/** Cosmote **/ // When you are in roaming you can check your balance inquiry by simply keying in *134#
			case 22603:
				return "*100#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Cosmote **/
		if (name.contains("osmote"))
			return "*100#";	
		
		/** Orange Romania **/
		else if (name.contains("range") || name.contains("RANGE"))
        	return "*133#";
		
		/** Vodafone Romania **/
		else if (name.contains("VODA") || name.contains("oda"))
        	return "*123#";
		
		else
			return "";
	}
}
