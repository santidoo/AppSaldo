package doo.apps.prsaldo.countries;

public class Portugal {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** vodafone **/
			case 26801:
				return "1512";
				
			/** NOS **/
			case 26803:
				return "*111#";
				
			/** TMN **/
			case 26806:
				return "*#123#";
				
			/** Lycamobile **/
			case 26804:
				return "*123#";

			/** UNITEL (angola) **/
			case 63102:
				return "*102#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** UZO **/
		if (name.toLowerCase().contains("uzo"))
			return "#123#";
		
		/** vodafone **/ // or send a blank TXT message to '1512'
		else if (name.toLowerCase().contains("vodafone"))
			return "1512";
		
		/** NOS **/ // 1220
		else if (name.toLowerCase().contains("nos"))
			return "*111#";
		
		/** TMN **/ // or Dial 12044
		else if (name.toLowerCase().contains("tmn"))
			return "*#123#";
		
		/** Lycamobile (mvno) using vodafone network **/ 
		// *#123#, *#137# -> Los dijo un usuario
		// *123#, *94# OR Dial 123 (or 95#) and listen to your balance -> Pag oficial de lycamobile pt
		// *137# -> Alguna pagina de internet (wiki)
		else if (name.toLowerCase().contains("lycamobile"))
			return "*123#";

		else if (name.toLowerCase().contains("unitel"))
			return "*102#";

		else
			return "";
	}
}
