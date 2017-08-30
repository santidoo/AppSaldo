package doo.apps.prsaldo.countries;

public class Germany {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			/** T-mobile **/
			case 26201:
				return "*100#";

			/** Vodafone **/
			case 26202:
				return "*100#";

			/** E-Plus **/
			case 26203:
				return "*100#";

			/** O2 **/
			case 26207:
				return "*101#";

			/** Telekom **/
			case 26212:
				return "*100#";
			
			/** Lycamobile **/
			case 26243:
				return "*131#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Vodafone **/
		if (name.contains("odafone") || name.contains("ODAFONE"))
			return "*100#";
		
		/** E-Plus **/
		else if (name.contains("plus") || name.contains("Plus") || name.contains("PLUS"))
			return "*100#";
		
		/** Lycamobile **/ // Dial 321 (or 95#) and listen to your balance, or  *131# (or 94#)
		// *137# 1 stan internetu;  *137# 2 stan minut
		else if (name.contains("Lycamobile") || name.contains("lycamobile") || name.contains("LYCAMOBILE"))
			return "*131#";
		
		/** Congstar **/
		else if (name.contains("CONGSTAR") || name.contains("ongstar"))
			return "*100#";
		
		/** LEBARA **/
		else if (name.contains("LEBARA") || name.contains("Lebara") || name.contains("lebara"))
			return "*141#";
		
		else
			return "";
	}
}
