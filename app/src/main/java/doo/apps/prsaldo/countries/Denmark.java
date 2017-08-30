package doo.apps.prsaldo.countries;

public class Denmark {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Oister **/
			case 23806:
				return "s1426:Saldo";
				
			/** BiBoB | One mobile **/
			case 23802:
				return "s1221:saldo";
				
			/** Coop Mobil **/
			case 23801:
				return "";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Oister **/
		if (name.contains("Oister") || name.contains("OiSTER") || name.contains("oister"))
			return "s1426:Saldo";
		
		/** Telia **/
		else if (name.contains("TELIA") || name.contains("Telia") || name.contains("telia"))
			return "*110#";
		
		/** Coop Mobil **/ // #121# CH
		else if (name.contains("Coop Mobil") || name.contains("coop") || name.contains("Coop") || name.contains("COOP"))
			return "";

		/** LEBARA **/ // call 50101234
		else if (name.contains("LEBARA") || name.contains("Lebara") || name.contains("lebara"))
			return "s50101234:balance";
		
		/** BiBoB | One mobile **/ // Send "saldo" as sms to 1221 (not free)
		else if (name.contains("BiBoB") || name.contains("bibob") || name.contains("Bibob") ||
				 name.contains("One") || name.contains("one") || name.contains("ONE"))
			return "s1221:saldo";
		
		else
			return "";
	}
}

// http://www.prepaidgsm.net/en/denmark.html
