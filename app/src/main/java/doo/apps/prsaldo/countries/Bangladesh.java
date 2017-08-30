package doo.apps.prsaldo.countries;

public class Bangladesh {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** grameenphone **/
			case 47001:
				return "*566#";
			
			/** Banglalink **/
			case 47003:
				return "*124#";
				
			/** AKTEL **/
			case 47002:
				return "*124#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Banglalink **/
		if (name.contains("Banglalink") || name.contains("BANGLALINK"))
			return "*124#";
		
		/** Airtel **/
		else if (name.contains("AIRTEL") || name.contains("irtel") || name.contains("irTel"))
			return "*778#";
		
		/** Robi | Previously known as AKTEL **/ // OR *222#1
		else if (name.contains("ROBI") || name.contains("Robi") || name.contains("robi") || 
				 name.contains("AKTEL") || name.contains("Aktel") || name.contains("aktel"))
			return "*222#";
		
		/** Teletalk **/
		else if (name.contains("TELETALK") || name.contains("eletalk") || name.contains("eleTalk"))
			return "*152#";
		
		/** Citycell **/
		else if (name.contains("CITYCELL") || name.contains("itycell") || name.contains("ityCell"))
			return "*8111";
		
		/** Grameenphone **/
		else if (name.contains("GRAMEENPHONE") || name.contains("rameenphone") || name.contains("rameEn"))
			return "*566#";
		
		/** Grameenphone:
		 *  Dial *566*2# to check your SMS balance
		 *  Dial *500*60# to check your data balance and validity 
		 *  Dial *566*14# to check your MMS balance **/

		else
			return "";
	}
}
