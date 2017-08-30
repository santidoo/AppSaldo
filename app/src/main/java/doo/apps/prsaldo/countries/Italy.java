package doo.apps.prsaldo.countries;

public class Italy {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Telecom Italy Mobile - TIM **/
			case 22201:
				return "4916";
			
			/** Wind Telecomunicazioni **/
			case 22288:
				return "*123#";

			/** 3 Italia **/
			case 22299:
				return "4030";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
					
		/** Telecom Italy Mobile - TIM **/ 
											// Dial *123# (only abroad while in roaming)
											// Send an SMS for free to 40916, with a text: PRE CRE SIN
        if(name.contains("TIM") || name.contains("Tim") || name.contains("tim") ||
           name.contains("Telecom Italy Mobile") || name.contains("Telecom italy mobile"))
        	
        	return "4916";
        
		/** Wind **/
        else if(name.contains("Wind") || name.contains("WIND") || name.contains("wind"))
        	return "*123#";

        /** Vodafone **/
        else if(name.contains("odafone") || name.contains("Vodafone") || name.contains("VODAFONE"))
        	return "404";
        
        /** 3 Italia **/
        else if(name.contains("3 Italia") || name.contains("3"))
        	return "4030";

		else
			return "";
	}
}
