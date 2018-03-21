package doo.apps.prsaldo.countries;

public class USA {
	
	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

            // Verizon Wireless; Mid-Tex Cellular
            case 31000:
                return "#225";

                // T-Mobile
			case 310026:
				return "#999#";
				
			// T-Mobile USA
			case 310260:
				return "#999#";
				
			// AT&T | *225# - Bill Balance (Postpaid only)
			case 310030:
				return "*777#";
				
			// AT&T Cingular Wireless
			case 310150:
				return "*777#";
				
			// AT
			case 310090:
				return "*777#";

			// Cingular Wireless - at&t mobile | 611 to check your account balance
			case 310410:
				return "*777#";
				
			// Iowa Wireless (i wireless)
			case 310770:
				return "#225";
				
			// MetroPCS
			case 311660:
				return "*99";
			
			// Virgin Mobile
			case 311490:
				return "";

			// Verizon Wireless
			case 311480:
				return "*611";
					
			// Verizon | TracFone - Not possible yet by USSD or SMS
			case 310000:
				return "#225";

            // Sprint USA | *5 or s1311:usage
            case 310120:
                return "*5";

            // OTHERS ///////////////////////////////////////////////
			// movistar CHILE
			case 73002:
				return "*300#";
				
			// Claro COLOMBIA
			case 732101:
				return "*103#";
				
			// TIGO 4G
			case 732103:
				return "*10#";
				
			// Kolbi ICE | s1150:
			case 71201:
				return "*1150#";
				
			default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// Cingular
		if (name.toLowerCase().contains("cingular"))
			return "*777#";
		
		// T-Mobile | "h#225#"
		else if (name.toLowerCase().contains("t-mobile"))
			return "#999#";
		
		// Verizon Wireless | or *611
		else if (name.toLowerCase().contains("verizon"))
			return "#225";
		
		// AT&T usa | *225#
    	else if(name.toLowerCase().contains("&") || name.toLowerCase().contains("at"))
    		return "*777#";
		
		// Sprint | *2
    	else if(name.toLowerCase().contains("sprint"))
    		return "*3";
		
		// boost Mobile
    	else if(name.toLowerCase().contains("boost"))
    		return "#225";
		
		// Cricket
    	else if(name.toLowerCase().contains("cricket"))
    		return "*729";
		
		// U.S. Cellular
    	else if(name.toLowerCase().contains("cellular"))
    		return "611";
		
		// MetroPCS
    	else if(name.toLowerCase().contains("metropcs"))
    		return "*99"; 
    	
		// Iowa Wireless (i wireless) | #5338
    	else if(name.toLowerCase().contains("i-wireless"))
    		return "#225";

        // Virgin Mobile
        else if(name.toLowerCase().contains("virgin"))
            return "";

        // Sprint USA
        else if(name.toLowerCase().contains("sprint"))
            return "";

		// OTHERS //////////////////////////////////////////////////
		// movistar
    	else if (name.toLowerCase().contains("movistar"))
    			return "*300#";
		
		// Claro Colombia (Comcel)
    	else if (name.toLowerCase().contains("comcel") || name.toLowerCase().contains("claro"))
			return "*103#";
		
		// TIGO 4G
		else if (name.toLowerCase().contains("tigo"))
			return "*10#";
		
		// Kolbi ICE
		else if (name.toLowerCase().contains("kolbi") || name.toLowerCase().contains("ice"))
			return "*1150#";
		
		else
			return "";
	}
}

// Verizon Wireless: http://www.verizonwireless.com/wcms/contact-us.html
// http://www.verizonwireless.com/prepaid/

// US - 310120 -> Sprint USA: Not possible… http://es.ccm.net/faq/26205-saber-los-minutos-utilizados-en-sprint
