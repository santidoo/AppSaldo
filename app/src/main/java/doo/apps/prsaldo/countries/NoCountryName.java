package doo.apps.prsaldo.countries;

public class NoCountryName {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			// TIGO 4G - COLOMBIA
			case 732103:
				return "*10#";
				
			// GLOBE - PHILIPPINES || *143*2*1 OR d222 OR BAL to 222
			case 51502:
				return "s222:BAL";
				
			// SMART Prepaid - PHILIPPINES || Text ?1515 to 214 OR *121# OR Dial 1515
			case 51503:
				return "*214#";

            // Cubacel
            case 36801:
                return "*222#";
				
			// ////////////////////////////////////////////////////// //
            // Probando suerte. Personas sin el adjunto en el email
				
			// Telcel || Costo de la consulta: $0.88
			case 334030:
				return "*133#";
					
			// Telcel || Costo de la consulta: $0.88
			case 334020:
				return "*133#";
				
			// Personal
			case 72234:
				return "*150#";
				
			// Claro BR
			case 72405:
				return "*545#";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// TIGO 4G || *600
		if (name.toLowerCase().contains("tigo"))
			return "*10#";
		
		// GLOBE || "*123" in Roaming OR "BAL to 222"
		else if (name.toLowerCase().contains("globe"))
			return "s222:BAL";
		
		// Telcel || "d*333" (Costo de la llamada: $1.19) or "s333:SALDO" Costo de la consulta: $0.88
		else if (name.toLowerCase().contains("telcel") || name.toLowerCase().contains("amigo"))
			return "*133#"; // Costo de la consulta: $0.88
		
		// Personal
		else if (name.toLowerCase().contains("personal"))
			return "*150#";
		
		// Claro BR || *544#
		else if (name.toLowerCase().contains("claro"))
			return "*545#";

        // Cubacel
        else if (name.toLowerCase().contains("cubacel"))
            return "*222#";

		else
			return "";
	}
}

