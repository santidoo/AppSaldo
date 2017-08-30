package doo.apps.prsaldo.countries;

public class RepublicaDominicana {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** CLARO **/
			case 37002:
				return "*122#";
				
			/** ORANGE **/	
			case 37001:
				return "#131#";
				
			/** Default | PR Wireless **/ // From Puerto Rico
			case 330120:
				return "#225";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** CLARO **/
		if (name.contains("CLARO") || name.contains("Claro") || name.contains("claro"))
			return "*122#";
		
		/** ORANGE **/
		if (name.contains("ORANGE") || name.contains("Orange") || name.contains("orange"))
			return "#131#";
		
		/** TravelSIM **/
		else if (name.contains("TravelSIM") || name.contains("ravel") || name.contains("SIM"))
			return "*146*099";
		
		/** Default | PR Wireless **/
		else if (name.contains("Default") || name.contains("Default") || name.contains("DEFAULT") || 
				 name.contains("PR Wireless") || name.contains("PR wireless"))
			return "#225";
		
		else
			return "";
	}
}
