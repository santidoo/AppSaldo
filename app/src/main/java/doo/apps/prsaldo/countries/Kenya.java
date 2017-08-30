package doo.apps.prsaldo.countries;

public class Kenya {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Safaricom **/
			case 63902:
				return "*144#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Safaricom **/ // Via SMS: Send "Balance" to 144 or Via Dialer: Dial 144
		if (name.contains("Safaricom") || name.contains("safaricom") || name.contains("SAFARICOM"))
			return "*144#";

		else
			return "";
	}
}
