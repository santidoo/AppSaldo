package doo.apps.prsaldo.countries;

public class Colombia {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
				
			/** Claro Colombia (Comcel) **/
			case 732101:
				return "*103#";
				
			/** TIGO 4G **/
			case 732103:
				return "*10#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Claro Colombia (Comcel) **/
		if (name.contains("COMCEL") || name.contains("omcel") || name.contains("CLARO") || name.contains("laro"))
			return "*103#";
		
		/** TIGO 4G **/
		else if (name.contains("TIGO") || name.contains("Tigo") || name.contains("tigo"))
			return "*10#";
		
		/** Uff! Móvil **/
		else if (name.contains("Uff") || name.contains("uff") || name.contains("tigo"))
			return "*222#";
		
		/** Movistar Colombia **/
		else if (name.contains("MOVISTAR") || name.contains("Movistar") || name.contains("movistar"))
			return "*226#";
		
		/** ETB Voz Móvil Colombia **/
		else if (name.contains("ETB") || name.contains("etb") || name.contains("Voz") || name.contains("voz"))
			return "*77#";
		
		/** UNE EPM **/
		else if (name.contains("UNE") || name.contains("EPM") || name.contains("une") || name.contains("epm"))
			return "*155#";
		
		/** Virgin Mobile Colombia **/
		else if (name.contains("VIRGIN") || name.contains("Virgin") || name.contains("virgin"))
			return "*10#";
		
		/** movilexito **/
		else if (name.contains("movilexito") || name.contains("EXITO") || name.contains("xito"))
			return "*3333#";

		else
			return "*10#"; // TEMP
	}
}
