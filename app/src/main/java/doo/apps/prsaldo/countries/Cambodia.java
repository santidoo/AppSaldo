package doo.apps.prsaldo.countries;

public class Cambodia {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** Smart **/
			case 45606:
				return "*888#";
				
			/** qb **/
			case 45604:
				return "#132#";

			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		/** Smart **/
		if (name.contains("SMART") || name.contains("Smart") || name.contains("smart"))
			return "*888#";
		
		/** Beeline **/
		else if (name.contains("BEELINE") || name.contains("eeline") || name.contains("eeLine"))
			return "*102#";
		
		/** Cellcard / Mobitel **/
		else if (name.contains("CELLCARD") || name.contains("ellcard") || name.contains("ellCard") || 
			name.contains("MOBITEL") || name.contains("obitel") || name.contains("obiTel"))
			return "#124#";
		
		/** Hello **/
		else if (name.contains("HELLO") || name.contains("Hello") || name.contains("hello"))
			return "*100#";
		
		/** MetFone **/
		else if (name.contains("METFONE") || name.contains("MetFone") || name.contains("etfone"))
			return "*097#";
		
		/** Mfone / Camshin **/
		else if (name.contains("MFONE") || name.contains("mfone") || name.contains("MFone") || name.contains("mFone") || 
			name.contains("Mfone") || name.contains("CAMSHIN") || name.contains("amshin"))
			return "*222#";
		
		/** qb | qbMore **/
		else if (name.contains("qb") || name.contains("Qb") || name.contains("QB"))
			return "#132#";
		
		/** Star-Cell **/
		else if (name.contains("STAR-CELL") || name.contains("Star-Cell") || name.contains("star-cell") || 
			name.contains("STARCELL") || name.contains("tarcell") || name.contains("tarCell"))
			return "*121#";

		else
			return "";
	}
}

// http://prepaid-data-sim-card.wikia.com/wiki/Cambodia
// http://cambodia-ict.epipe.com/how-to-check-pre-paid-mobile-phone-sim-card-account-balance-in-cambodia_80
