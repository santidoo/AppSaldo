package doo.apps.prsaldo.countries;

public class Afghanistan {

    static public String getCode(String ID, String name) {

        int nr = Integer.parseInt(ID);
        switch (nr) {

            // Etisalat
            case 41240:
                return "*123#";

            default:
                return getCodeByName(name);
        }
    }

    static private String getCodeByName(String name) {

        // Etisalat
        if (name.toLowerCase().contains("etisalat"))
            return "*123#";

        else
            return "";
    }
}
