package doo.apps.prsaldo.countries;

public class Netherland {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			/** Simyo **/
			case 20408:
				return "*111#";
				
			/** Lycamobile **/
			case 20404:
				return "*101#";
			
			/** Lebara **/
			case 20412:
				return "*100#";
				
			/** T-Mobile  NL **/
			case 20416:
				return "1244";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
			
		/** Vodafone **/
		if (name.contains("odafone"))
			return "#101#";
		
		/** ToggleMobile **/
		else if (name.contains("ToggleMobile") || name.contains("TOGGLE") || name.contains("oggle"))
			return "*131#";
		
		/** Lycamobile **/ // *136# -  to check your bundle information
		else if (name.contains("Lycamobile") || name.contains("LYCAMOBILE") || name.contains("lycamobile"))
			return "*101#";
		
		/** Lebara **/
		else if (name.contains("Lebara") || name.contains("LEBARA") || name.contains("lebara"))
			return "*100#";
		
		/** T-Mobile  NL **/
		else if (name.contains("T-Mobile  NL") || name.contains("T-Mobile") || name.contains("t-mobile"))
			return "1244";

		else
			return "";
	}
}
