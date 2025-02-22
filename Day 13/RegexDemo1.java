import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
    public static void main(String[] args) {
        String s="Tamil is the oldest language  ABC &*()_+#@!$ 123456";
        //! to check whether the "Tamil is starting at first"
        // Pattern p=Pattern.compile("^Tamil");
        // Pattern p=Pattern.compile("[a-z]");
        // Pattern p=Pattern.compile("[A-Z]");
        // Pattern p=Pattern.compile("[a-zA-Z]");
        // Pattern p=Pattern.compile("[0-9]");
    
        Matcher m= p.matcher(s);
        while(m.find())
        {
            System.out.println(m.group() +" at "+m.start());
        }
    }
}
