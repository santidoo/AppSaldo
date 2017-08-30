package doo.apps.prsaldo.countries;

public class Russia {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			case 25039:
				return "*123#";
				
			/** Beeline **/
			case 25099:
				return "*102#";
				
			/** Tele2 **/
			case 25020:
				return "*105#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** MTS **/
		if (name.toLowerCase().contains("mts") || name.toLowerCase().contains("mtc"))
        	return "*100#";

		/** Megafon **/
        else if(name.toLowerCase().contains("megafon"))
        	return "*100#";

        /** Beeline **/
        else if(name.toLowerCase().contains("beeline"))
        	return "*102#";
		
        /** Rostelecom **/
        else if(name.toLowerCase().contains("rostelecom"))
        	return "*123#";
		
		/** Tele2 **/
        else if(name.toLowerCase().contains("tele2"))
        	return "*105#";	
    		
		else
			return "";
	}
}
