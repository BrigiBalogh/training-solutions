package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String str){
        if (str.equals(null) || str.equals("")) {
            return false;

        }
        return true;

    }
    public static boolean isEmpty (List<String> items) {
        if (items.isEmpty() ) {
            return false;
        }
        return true;
    }
}
