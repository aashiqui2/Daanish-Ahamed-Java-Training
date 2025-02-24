// package Day13;
import java.util.regex.*;
public class RegixDemo {
    public static void main(String[] args) {
        // Pattern p = new Pattern;
        String s = "thu id rhums thu where is in thu ";
        Pattern p = Pattern.compile("thu");
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group()+" come at "+ m.start() + " end at " + m.end());
        }
    }
}
