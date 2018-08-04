package doo.apps.prsaldo.countries;

public class Albania {

	static public String getCode(String ID, String name) {

		int nr = Integer.parseInt(ID);
		switch (nr) {
			
			// VODAFONE AL || s141:Balance
            case 27602:
                return "#123#";

            default:
				return getCodeByName(name);
		}
	}
	
	static private String getCodeByName(String name) {

        // VODAFONE AL || s141:Balance
		if (name.toLowerCase().contains("vodafone"))
            return "#123#";

		else
			return "";
	}
}
