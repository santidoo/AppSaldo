package doo.apps.prsaldo.countries;

public class ArabEmirates {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {

            // Du
            case 42403:
                return "*135#";

            // etisalat or five
            case 42402:
                return "*121#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {
				
		// Du | or SMS 'balance' to 1355
		if (name.toLowerCase().contains("du"))
			return "*135#";

        // etisalat or five
        else if (name.toLowerCase().contains("etisalat"))
        	return "*121#";

            // etisalat or five
        else if (name.toLowerCase().contains("five"))
            return "*121#";

		else
			return "";
	}
}
