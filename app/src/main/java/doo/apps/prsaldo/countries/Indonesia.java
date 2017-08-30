package doo.apps.prsaldo.countries;

public class Indonesia {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			/** INDOSAT **/
			case 51001:
				return "*555#";
			
			/** Telkomsel **/
			case 51010:
				return "*888#";
			
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
        /** Mentari | StarOne **/
        if(name.contains("MENTARI") || name.contains("entari") || 
        	name.contains("STARONE") || name.contains("starone") || name.contains("starOne") || 
        	name.contains("StarOne") || name.contains("starOne"))
        	return "*555#";
		
        /** IM3 **/ // "*555"
        else if(name.contains("IM3") || name.contains("m3"))
        	return "*388#";
				
		/** XL Axiata **/
        else if (name.contains("XL") || name.contains("xl") || name.contains("xiata") || name.contains("XIATA"))
			return "*123#";
        
		/** Axis **/
        else if (name.contains("xis") || name.contains("AXIS"))
			return "*888#";
		
        /** Telkomsel **/ // "d188"
        else if(name.contains("Telkomsel") || name.contains("telkomsel") || name.contains("TELKOMSEL") || name.contains("elk"))
        	return "*888#";
        
        /** INDOSAT **/
        else if(name.contains("INDOSAT") || name.contains("ndosat"))
        	return "*555#";
        
        /** 3 **/ 
        else if(name.contains("3"))
        	return "*111*1#";
		
        /** Esia **/ // "d*955"
        else if(name.contains("ESIA") || name.contains("sia"))
        	return "*555#";
		
        /** Flexi **/ // "*99"
        else if(name.contains("lexi") || name.contains("FLEXI"))
        	return "*999#";
        
        /** Simpati | AS **/ 
        else if(name.contains("impati") || name.contains("SIMPATI") || name.contains("AS") || name.contains("as") || name.contains("As"))
        	return "*888#";
        
        /** Fren **/ // "s999:CEK"
        else if(name.contains("FREN") || name.contains("Fren") || name.contains("fren"))
        	return "*999";
        
        /** Hepi | MOBI **/ 
        else if(name.contains("HEPI") || name.contains("Hepi") || name.contains("hepi") || 
        		 name.contains("MOBI") || name.contains("Mobi") || name.contains("mobi"))
        	return "s999:CEK";

		else
			return "";
	}
}
