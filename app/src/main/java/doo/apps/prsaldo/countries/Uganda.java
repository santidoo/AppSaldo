package doo.apps.prsaldo.countries;

public class Uganda {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** MTN **/
			case 64110:
				return "*156#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** MTN **/
		if (name.contains("MTN") || name.contains("Mtn") || name.contains("mtn"))
			return "*156#";

        /** Orange Uganda **/
        else if(name.contains("ORANGE") || name.contains("Orange") || name.contains("orange"))
        	return "*131#";
		
        /** Airtel Uganda **/
        else if(name.contains("AIRTEL") || name.contains("Airtel") || name.contains("airtel"))
        	return "*131#";
		
        /** Uganda Telecom(UTL) **/
        else if(name.contains("TELECOM") || name.contains("Telecom") || name.contains("telecom") ||
        		name.contains("UTL") || name.contains("Utl") || name.contains("utl"))
        	return "#122#";
		
        /** Smart Telecom Uganda **/
        else if(name.contains("SMART") || name.contains("Smart") || name.contains("smart"))
        	return "*131#";

		else
			return "";
	}
}
