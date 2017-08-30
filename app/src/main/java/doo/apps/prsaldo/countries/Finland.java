package doo.apps.prsaldo.countries;

public class Finland {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			/** Saunalahti **/
			case 24405:
				return "*100#";
				
			/** DNA **/
			case 24412:
				return "*100#";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
			
		/** Saunalahti **/ // or "s18258:TILI" 
		if (name.contains("Saunalahti") || name.contains("saunalahti"))
			return "*100#";
		
		/** GoMobile **/
		else if (name.contains("GoMobile") || name.contains("GOMOBILE") || name.contains("gomobile"))
			return "*100#";
		
		/** Sonera **/ // s15400:EASY SALDO -> € 0,08 (0.11$)/ message).
		else if (name.contains("Sonera") || name.contains("sonera") || name.contains("SONERA"))
			return "s15400:EASY SALDO";
		
		/** TeleFinland **/ // s15400:TELE SALDO -> (€ 0.07 / 0.09$ per message) 
		else if (name.contains("TELE") || name.contains("Tele") || name.contains("tele"))
			return "s15400:TELE SALDO";
		
		/** DNA **/ // SALDO to 14000 
		else if (name.contains("DNA") || name.contains("dna") || name.contains("Dna"))
			return "*100#";
       
		else
			return "";
	}
}
