package doo.apps.prsaldo.countries;

public class Pakistan {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Mobilink **/ // at Rs 0.20+tax
			case 41001:
				return "*111#";
				
			case 41004:
				return "*222#";
				
			/** Telenor **/
			case 41006:
				return "*444#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** ZONG **/
		if (name.contains("ZONG") || name.contains("Zong") || name.contains("zong"))
			return "*222#";
		
		/** Telenor **/
		else if (name.contains("TELENOR") || name.contains("Telenor") || name.contains("telenor"))
			return "*444#";
		
		/** Ufone **/
		else if (name.contains("UFONE") || name.contains("Ufone") || name.contains("ufone"))
			return "*124#";
		
		/** Mobilink Jazz **/ // "*106*2*", "*101*2" at Rs 0.20+tax
		else if (name.contains("JAZZ") || name.contains("Jazz") || name.contains("jazz") || 
				 name.contains("MOBILINK") || name.contains("Mobilink") || name.contains("mobilink"))
			return "*111#";
		
		/** Glow **/
		else if (name.contains("GLOW") || name.contains("Glow") || name.contains("glow"))
			return "*100#";
		
		/** Warid **/
		else if (name.contains("WARID") || name.contains("Warid") || name.contains("warid"))
			return "*100#";

		else
			return "";
	}
}
