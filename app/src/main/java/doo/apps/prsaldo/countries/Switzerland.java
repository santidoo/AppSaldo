package doo.apps.prsaldo.countries;

public class Switzerland {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
				
			/** Sunrise | Lebara **/
			case 22802:
				return "*121#";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Orange Communications SA **/
		if (name.contains("ORANGE") || name.contains("range") || name.contains("ommunications"))
			return "#121#";
		
		/** coop mobile **/
		else if (name.contains("COOP") || name.contains("Coop") || name.contains("coop"))
			return "#121#";
		
		/** Sunrise **/
		else if (name.contains("SUNRISE") || name.contains("Sunrise") || name.contains("sunrise"))
			return "*121#";
		
		/** mucho mobile **/
		else if (name.contains("MUCHO") || name.contains("mucho") || name.contains("Mucho"))
			return "*139*2#";	
		
		/** Prepaid Natel Easy | Swisscom **/
		else if (name.contains("NATEL") || name.contains("atel") || name.contains("asy"))
			return "*130#";
		
		/** M-Budget Mobile | Swisscom **/
		else if (name.contains("M-Budget") || name.contains("M-budget") || name.contains("udget"))
			return "*130#";
		
		/** XXSIM **/ // *146*009
		else if (name.contains("XXSIM") || name.contains("xxsim") || name.contains("xxSim") || name.contains("XXSim"))
			return "*146*099#";
		
		/** Lebara **/
		else if (name.contains("Lebara") || name.contains("LEBARA") || name.contains("lebara"))
			return "*147#";
		
		/** OK.- **/
		else if (name.contains("OK.-") || name.contains("Ok.-") || name.contains("ok.-"))
			return "s3131:Balance";

		/** Swisscom **/
		else if (name.contains("Swisscom") || name.contains("swisscom") || name.contains("SWISSCOM"))
			return "s444:STATUS";

		else
			return "";
	}
}
