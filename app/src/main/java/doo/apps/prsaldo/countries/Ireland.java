package doo.apps.prsaldo.countries;

public class Ireland {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			/** Meteor **/
			case 27203:
				return "*#100#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
			
		/** Vodafone **/
		if (name.contains("odafone"))
			return "*174#";

		/** O2 **/
        else if(name.contains("2"))
        	return "*100#";
		
		/** Meteor **/
        else if(name.contains("eteor"))
        	return "*#100#";

		/** Postfone **/
        else if(name.contains("ostfone"))
        	return "*200#";

		/** Tesco **/
        else if(name.contains("esco"))
        	return "*100#";
		
		/** eMobile **/
        else if(name.contains("obile") || name.contains("EMOB") || name.contains("e-m") || name.contains("E-M") || 
        		name.contains("e-M") || name.contains("E-m"))
        	return "*#100";
		
		/** Three **/
        else if(name.contains("hree") || name.contains("3") || name.contains("THREE"))
        	return "1745";
		
		/** Lycamobile **/
		else if (name.contains("Lycamobile") || name.contains("LYCAMOBILE") || name.contains("lycamobile"))
			return "*131#";
        
        else
			return "";
	}
}
