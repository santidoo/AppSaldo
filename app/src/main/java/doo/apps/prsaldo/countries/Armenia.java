package doo.apps.prsaldo.countries;

public class Armenia {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** VivaCell-MTS **/
		if (name.contains("MTS") || name.contains("mts") || name.contains("Mts") || 
			name.contains("VivaCell") || name.contains("VIVA") || name.contains("Viva") || name.contains("viva"))
			return "*122#";

		else
			return "";
	}
}
