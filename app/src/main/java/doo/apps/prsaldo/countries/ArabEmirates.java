package doo.apps.prsaldo.countries;

public class ArabEmirates {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Du **/
		if (name.contains("Du") || name.contains("DU") || name.contains("du"))
			return "*135#";

        /** ETISALAT **/
        else if(name.contains("ETISALAT") || name.contains("tisalat") || name.contains("Eti") || name.contains("eti"))
        	return "*121#";

		else
			return "";
	}
}
