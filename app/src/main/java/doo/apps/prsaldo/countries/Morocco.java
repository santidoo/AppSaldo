package doo.apps.prsaldo.countries;

public class Morocco {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Maroc Telecom **/
			case 60401:
				return "#580#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** inwi / Maroc Telecom **/ // "d1202"
		if (name.contains("INWI") || name.contains("Inwi") || name.contains("inwi") || 
			name.contains("WANA") || name.contains("Wana") || name.contains("wana") ||
			name.isEmpty())
			return "*120*30#";
		
		/** Maroc Telecom **/
		else if (name.contains("Maroc Telecom") || name.contains("maroc") || name.contains("Maroc") ||name.contains("MAROC"))
			return "#580#";

		else
			return "";
	}
}
