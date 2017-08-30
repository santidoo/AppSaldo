package doo.apps.prsaldo.countries;

public class Azerbaijan {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** SimSim **/
			case 40001:
				return "s2112:";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** SimSim **/ // Call 2112 or dial *111*1*7#YES
		if (name.toLowerCase().contains("simsim"))
			return "s2112:";

		else
			return "";
	}
}

// https://www.azercell.com/en/personal/services/payment_balance/balance_info/

