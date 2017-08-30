package doo.apps.prsaldo.countries;

public class Australia {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Lycamobile **/
			case 50519:
				return "*131#";
				
			/** Vodafone **/
			case 50503:
				return "1512";
				
			/** Virgin Mobile **/
			case 50502:
				return "s225:BAL";				

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Telstra **/
		/** NOTES:
		 *  #100#     - Telstra USSD menu
		 *  #125*1*1# - Immediate Balance
		 *  #125*3#   - Account balance
		 */
		if (name.contains("TELSTRA") || name.contains("elstra"))
			return "#125*3#";
		
		/** AMAYSim **/
		else if (name.contains("AMAYSim") || name.contains("amaysim") || name.contains("Amaysim") || 
				 name.contains("AmaySim") || name.contains("AMAYSIM"))
			return "s568:BAL";
		
		/** Lycamobile **/
		else if (name.contains("Lycamobile") || name.contains("lycamobile") || name.contains("LYCAMOBILE"))
			return "*131#";
		
		/** Vodafone **/ // Dial 1512 OR Send a blank TXT message to 1555 or 1512
		else if (name.contains("Vodafone") || name.contains("VODAFONE") || name.contains("vodafone"))
			return "s1512:";
		
		/** Lebara **/ // call 126 123
		else if (name.contains("LEBARA") || name.contains("Lebara") || name.contains("lebara"))
			return "s126172:Balance";
		
		/** Virgin Mobile **/ // or Call 225 (Cost 20c) or call 1512 ?
		else if (name.contains("Virgin") || name.contains("virgin") || name.contains("VIRGIN"))
			return "s225:BAL";
		
		else
			return "";
	}
}
