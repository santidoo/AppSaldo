package doo.apps.prsaldo.countries;

public class Myanmar {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** MPT - Myanma Posts and Telecommunications **/
			case 41404:
				return "*124#";
				
			/** MECTel **/
			case 41403:
				return "";
				
			/** Ooredoo **/
			case 41405:
				return "*133#";
				
			/** Telenor **/
			case 41406:
				return "*124#";				

			/** MPT **/
			case 41401:
				return "*124#";	
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** MPT - Myanma Posts and Telecommunications **/
		if (name.contains("MPT") || name.contains("mpt"))
			return "*124#";
		
		/** MECTel **/
		else if (name.contains("MECTel") || name.contains("Mectel") || name.contains("MecTel"))
			return "";
		
		/** Ooredoo **/
		else if (name.contains("Ooredoo") || name.contains("ooredoo") || name.contains("OOREDOO"))
			return "*133#";

		/** Telenor **/ // *124*1#
		else if (name.contains("Telenor") || name.contains("telenor") || name.contains("TELENOR"))
			return "*124#";
		
		else
			return "";
	}
}
