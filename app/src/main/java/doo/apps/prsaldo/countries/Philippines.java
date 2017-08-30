package doo.apps.prsaldo.countries;

public class Philippines {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** GLOBE Telecom **/ // "*143*2*1" OR "d222"  OR "BAL to 222"
			case 51502:
				return "s222:BAL"; 
				
			/** Smart Communications | Talk N Text **/
			case 51503:
				return "*214#";
				
			/** Digitel (Sun Cellular Mobile) **/
			case 51505:
				return "*221#";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Smart Communications **/ // "d1515" OR "?1515 to 214"
		if (name.toLowerCase().contains("smart") || name.toLowerCase().contains("communications"))
			return "*214#"; 
		
		/** GLOBE Telecom **/ // "*123" in Roaming OR "BAL to 222"
		else if (name.toLowerCase().contains("globe"))
			return "s222:BAL";
		
		/** Digitel - Sun Cellular Mobile **/
		else if (name.toLowerCase().contains("sun") || name.toLowerCase().contains("digi"))
			return "*221#";
		
		/** TALK N TEXT **/
		else if (name.toLowerCase().contains("talk") || name.toLowerCase().contains("text"))
			return "15001";
		
		/** TM (Touch Mobile) **/
		else if (name.toLowerCase().contains("tm") || name.toLowerCase().contains("touch"))
			return "*102#";
		
		/** Red Mobile **/
		else if (name.toLowerCase().contains("red"))
			return "s9939:999";
		
		/** SMART Prepaid **/ // s214:?1515 OR d1515 (cost 1 PHP) OR s211:BILL? OR *133#*2 OR *888
		else if (name.toLowerCase().contains("smart"))
			return "s214:?1515";

		else
			return "";
	}
}
