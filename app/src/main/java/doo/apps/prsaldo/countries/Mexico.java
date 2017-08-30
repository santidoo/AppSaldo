package doo.apps.prsaldo.countries;

public class Mexico {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Iusacell | Unefon **/
			case 334050:
				return "s1111:SALDO";
				
			/** Iusacell | Unefon **/
			case 33404:
				return "s1111:SALDO";
				
			/** Nextel **/
			case 334090:
				return "*611";

			/** Telcel **/ // Costo de la consulta: $0.88
			case 334020:
				return "*133#";
				
			/** Telcel **/ // Costo de la consulta: $0.88
			case 334030:
				return "*133#";

			/** Flash Mobile **/ //  o al *555
			case 33403:
				return "*555#";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Telcel **/ // "d*333" (Costo de la llamada: $1.19) 
					   // "s333:SALDO" Costo de la consulta: $0.88
		if (name.toLowerCase().contains("telcel") || name.toLowerCase().contains("amigo"))
			return "*133#"; // Costo de la consulta: $0.88

		/** movistar mexico **/ // "d*72536" ; "*133#"
		else if(name.toLowerCase().contains("movistar"))
			return "*102#";
		
		/** Iusacell | Unefon **/ // "d*611" + instrucciones, Unefon: "d*8482" + instrucciones. 
		//La consulta se cobra $1.16 
		else if(name.toLowerCase().contains("iusacell"))
			return "s1111:SALDO";
		
		/** Nextel **/ // http://www.nextel.com.mx/nextel-libre/consulta-de-saldo.html 
		else if(name.toLowerCase().contains("nextel"))
			return "*611";

		/** Flash Mobile **/ //  o al *555
		else if(name.toLowerCase().contains("flash"))
			return "*555#";

		else
			return "";
	}
}
