package doo.apps.prsaldo.countries;

public class Somalia {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** HORMUUD **/
			case 63750:
				return "*122#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** HORMUUD **/
		if (name.toLowerCase().contains("hormuud"))
			return "*122#";

		else
			return "";
	}
}

// https://www.azercell.com/en/personal/services/payment_balance/balance_info/

