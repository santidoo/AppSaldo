package doo.apps.prsaldo.countries;

public class Egypt {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// Orange Egypt (Mobinil) || #100*3#
			case 60201:
				return "#100#";

            // WE (te - Telecom Egypt)
            case 60204:
                return "*130#";

            // etisalat | Call 555
            case 60203:
                return "*134#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// Vodafone Egypt | *111# or *868*1# (before)
		if (name.toLowerCase().contains("vodafone"))
			return "*141#";
		
		// Orange Egypt (Mobinil) | *555#
		else if (name.toLowerCase().contains("mobinil") || name.toLowerCase().contains("orange"))
			return "#100#";
		
		// etisalat | *130# or *121# or Call 555
		else if (name.toLowerCase().contains("etisalat")) 
			return "*134#";

        // WE (te - Telecom Egypt)
        else if (name.toLowerCase().contains("te") || name.toLowerCase().contains("we") || name.toLowerCase().contains("telecom"))
            return "*130#";
		
		else
			return "";
	}
}
