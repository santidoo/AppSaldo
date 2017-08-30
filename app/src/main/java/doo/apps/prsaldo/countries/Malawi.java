package doo.apps.prsaldo.countries;

public class Malawi {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			case 65001:
				return "#123#";
				
			/** Airtel MW **/
			case 65010:
				return "*137#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
			
		/** TNM **/ // You can also check your balance on Prepaid by dialing 103
		if (name.contains("TNM") || name.contains("tnm") || name.contains("Tnm"))
			return "#123#";
		
		/** Airtel MW **/ // *304#
		else if (name.contains("Airtel MW") || name.contains("Airtel") || name.contains("airtel"))
			return "*137#";

		else
			return "";
	}
}
