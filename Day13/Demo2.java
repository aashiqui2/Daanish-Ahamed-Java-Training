// package Day13;

import java.util.regex.*;

public class Demo2 {
    public static void main(String[] args) {
        String s ="English is new object";
        //! to check whether the "Tsmil is strating at first"
        Pattern p = Pattern.compile("[a-z]");
        Pattern p1 = Pattern.compile("Engilh");
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
