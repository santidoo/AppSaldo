package doo.apps.prsaldo.countries;

public class UK {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			/** O2 **/
			case 23402:
				return "*#10#";
				
			/** O2 **/ 
			case 23410:
				return "*#10#";
				
			/** Vodafone **/
			case 23415:
				return "*#1345#";
				
			/** Lycamobile **/
			case 23426:
				return "*131#";
				
			/** Three **/
			case 23420:
				return "444";

			/** T-Mobile **/
			case 23430:
				return "s150:BA";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** O2 **/ 	// or.. Dial 4444 FREE from your mobile to hear your balance and to top-up. 
					// or.. Send a blank text to 21202
					// or.. Send text "balance" to 20202

		if (name.toLowerCase().contains("o2"))
			return "*#10#";
		
		/** Orange UK **/
		else if (name.toLowerCase().contains("orange"))
        	return  "d453";
		
		/** Three UK **/
        else if (name.toLowerCase().contains("three") || name.contains("3"))
        	return "444";

		/** giffgaff UK **/
        else if (name.toLowerCase().contains("giff"))
        	return "*100#";

		/** tesco mobile UK **/
        else if (name.toLowerCase().contains("tesco"))
        	return "*#10#";
        
		/** ASDA mobile UK **/
        else if (name.toLowerCase().contains("asda"))
        	return "*#1345#";
		
		/** ToggleMobile **/
		else if (name.toLowerCase().contains("toggle"))
			return "*131#";
		
		/** Lycamobile **/
		else if (name.toLowerCase().contains("lycamobile"))
			return "*131#";
		
		/** Lebara **/
		else if (name.toLowerCase().contains("lebara"))
			return "*#1345#";

		/** T-Mobile **/ // s150:AL
		else if (name.toLowerCase().contains("t-mobile"))
			return "s150:BA";
        	
		else
			return "";
	}
}
