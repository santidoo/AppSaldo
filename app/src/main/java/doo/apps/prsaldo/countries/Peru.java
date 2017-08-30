package doo.apps.prsaldo.countries;

public class Peru {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** movistar **/
			case 71606:
				return "*515#";
				
			/** Nextel **/
			case 71617:
				return "s144:S";
				
			/** Bitel **/
			case 71615:
				return "121#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Claro Peru **/
		if (name.toLowerCase().contains("claro"))
			return "*777#";
		
		/** Nextel **/ // s144:S
		else if (name.toLowerCase().contains("nextel"))
			return "144";		
		
		/** movistar **/
		else if (name.toLowerCase().contains("movistar"))
			return "*515#";
		
		/** Bitel **/ // s161:VEA or *122#
		else if (name.toLowerCase().contains("bitel"))
			return "121#";

		else
			return "";
	}
}
