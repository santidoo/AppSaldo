package doo.apps.prsaldo.countries;

public class Qatar {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Vodafone Qatar **/
			case 42702:
				return "*100*1#";
			
			/** Qtel Qatar = Ooredoo **/
			case 42701:
				return "*129#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Vodafone Qatar **/ // Ifnot, just *100#
		if (name.contains("Vodafone Qatar") || name.contains("vodafone") || name.contains("Vodafone") || name.contains("VODAFONE"))
			return "*100*1#";
		
		/** Qtel Qatar = Ooredoo **/
		else if (name.contains("Qtel") || name.contains("qtel") || name.contains("Q-tel") || name.contains("QTEL") ||
				 name.contains("Ooredoo") || name.contains("ooredoo") || name.contains("OOREDOO"))
			return "*129#";

		else
			return "";
	}
}

/** 
 * On Qtel Hala, you can check your Account Balance by typing in *129# and press Send/Call. 
 * To check Bonus Credit, simply dial *129*2#. 
 * To check Free Credit balance, simply dial *129*6#
 */
