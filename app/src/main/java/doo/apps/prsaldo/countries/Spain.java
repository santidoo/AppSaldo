package doo.apps.prsaldo.countries;

public class Spain {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

			/** Vodafone **/
			case 21401:
				return "*134#";

			/** Orange **/
			case 21403:
				return "*111#";

			/** Yoigo **/
			case 21404:
				return "*111#";

			/** Tuenti **/
			case 21405:
				return "2201";
				
			/** Tuenti **/
			case 21432:
				return "2201";
				
			/** Pepephone **/ // Coste: 0,09€ más iva
			/** Eroski Movil **/ // no tiene USSD
			case 21406:
				return "*134#";

			/** Movistar **/
			case 21407:
				return "*133#";

//			/** ONO **/
//			case 21418:
//				return "x";

			/** Simyo **/ // 20408
			case 21419:
				return "*111#";
				
			/** Lycamobile **/
			case 21425:
				return "*221#";
				
			/** Digi.Mobil **/
			case 21422:
				return "*134#";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Lebara **/
		if (name.contains("ebara"))
			return "*124#";
		
		/** Simyo **/
		else if (name.contains("imyo"))
			return "*111#";
		
		/** pepephone **/ // Coste: 0,09€ más iva
		else if (name.contains("pepephone"))
			return "*134#";
		
		/** Eroski Movil **/
		else if (name.contains("Eroski Movil"))
			return "";
		
		/** Lycamobile **/ // "94#" or Marca 221 (o 95#) y escucha tu saldo
		else if (name.contains("Lycamobile"))
			return "*221#";
		
		/** Digi.Mobil **/
		else if (name.contains("Digi.Mobil") || name.contains("digi") || name.contains("Digi"))
			return "*134#";
		
		/** Tuenti **/
		else if (name.contains("Tuenti") || name.contains("tuenti") || name.contains("TUENTI"))
			return "2201";
		
//		/** ONO **/
//		else if (name.contains("ONO"))
//			return "";
		
		else
			return "";
	}
}
