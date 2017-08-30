package doo.apps.prsaldo.countries;

public class Brazil {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** TIM **/
			case 72402:
				return "*222#";
				
			/** Claro BR **/
			case 72405:
				return "*545#";
				
			/** VIVO **/
			case 72406:
				return "*8000";
				
			/** VIVO / ATL Algar **/
			case 72410:
				return "*8000";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** TIM **/ // "s222:SAL" ; "d*222" ; *222
		if (name.toLowerCase().contains("tim"))
			return "*222#";
		
		/** Claro BR **/ // *544#
		else if (name.toLowerCase().contains("claro"))
			return "*545#";
		
		/** VIVO **/
		else if (name.toLowerCase().contains("vivo"))
			return "*8000";
		
		/** OI **/ // *804 or *805
		else if (name.toLowerCase().contains("oi"))
			return "*804";

		else
			return "";
	}
}
