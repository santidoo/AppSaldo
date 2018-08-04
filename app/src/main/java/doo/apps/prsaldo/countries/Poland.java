package doo.apps.prsaldo.countries;

public class Poland {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			// PLUS
			case 26001:
				return "*100#";

			// ERA/T-Mobile | Cost 4 grz
			case 26002:
				return "*108#";

			// ORANGE
			case 26003:
                return "*124*#";

			// PLAY
			case 26006:
				return "*101*#";

			// T-Mobile Polska
			case 26034:
				return "*101*#";
				
			// Cyfrowy POLSAT S.A. | "s2222:SALDO" Price of normal sms
			case 26012:
				return "s2222:S";
				
			// Lycamobile
			case 26009:
				return "*131#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
		
		// NJU | "s604:ile" Cost 9 gr ; "*602"
		if (name.toLowerCase().contains("nju"))
			return "*127*1#";
		
		// Simplus
		else if (name.toLowerCase().contains("simplus"))
			return "*100#";
		
		// Lycamobile | "94#" or Dial 321 (or 95#)
		else if (name.toLowerCase().contains("lycamobile"))
			return "*131#";
		
		else		
			return "";
	}
}
