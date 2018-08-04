package doo.apps.prsaldo.countries;

public class Colombia {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
				
			// Claro Colombia (Comcel)
			case 732101:
				return "*103#";
				
			// TIGO 4G
			case 732103:
				return "*10#";

            // Avantel 4G LTE
            case 732130:
                return "*357";

            // TIGO or Movil Exito or Avantel 4G LTE
            case 732111:
                return "*10#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// Claro Colombia (Comcel)
		if (name.toLowerCase().contains("claro") || name.contains("comcel"))
			return "*103#";
		
		// TIGO 4G
		else if (name.toLowerCase().contains("tigo"))
			return "*10#";
		
		// Uff! Móvil
		else if (name.toLowerCase().contains("uff"))
			return "*222#";
		
		// Movistar Colombia
		else if (name.toLowerCase().contains("movistar"))
			return "*226#";
		
		// ETB Voz Móvil Colombia | *77#
		else if (name.toLowerCase().contains("etb") || name.contains("voz"))
			return "*701";
		
		// UNE EPM
		else if (name.toLowerCase().contains("une"))
			return "*155#";
		
		// Virgin Mobile Colombia
		else if (name.toLowerCase().contains("virgin"))
			return "*10#";
		
		// // Movil Exito
		else if (name.toLowerCase().contains("exito"))
			return "*3333#";

        // Avantel 4G LTE
        else if (name.toLowerCase().contains("avantel"))
            return "*357";

		else
			return "";
	}
}
