package doo.apps.prsaldo.countries;

public class France {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Orange France **/
		if (name.contains("range") || name.contains("RANGE"))
			return "#123#";
        
		/** SFR **/
        else if(name.contains("sfr") || name.contains("SFR") || name.contains("Sfr"))
        	return "950";
		
		/** LEBARA **/
		else if (name.contains("LEBARA") || name.contains("Lebara") || name.contains("lebara"))
			return "2323";
       
		else
			return "";
	}
}
