import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        // String sentence="Thuppaarkkuth Thuppaaya Thuppaakkith Thuppaarkkuth Thuppaaya Thooum Mazhai";
        // String sentence="Tamil is oldest language";

        String sentence="abcBcacabaaabbc12345 !@#$%^&*()";

        // Pattern p=Pattern.compile("Thuppa");
        // Pattern p=Pattern.compile("Tamil");
        // Pattern p=Pattern.compile("^Tamil");

        // Pattern p=Pattern.compile("language$");
        // Pattern p=Pattern.compile("o|e");
        
        // Pattern p=Pattern.compile("[abc]");
        // Pattern p=Pattern.compile("[^abc]");
        // Pattern p=Pattern.compile("[a-z]");
        // Pattern p=Pattern.compile("[^a-z]");
        // Pattern p=Pattern.compile("[a-zA-Z]");
        // Pattern p=Pattern.compile("[^a-zA-Z]");
        // Pattern p=Pattern.compile("[0-9]");
        // Pattern p=Pattern.compile("[^0-9]");
        // Pattern p=Pattern.compile("[^a-zA-Z0-9]");
        // Pattern p=Pattern.compile("^[a-zA-Z0-9]");
        Pattern p=Pattern.compile("^[a-zA-Z0-9]");
        Matcher m= p.matcher(sentence);
        // int count=0;

        while(m.find())
        {
            // count++;
            System.out.println(m.group()+" start at " +m.start()+" ends at "+ m.end());
        }
        // System.out.println(count);
    }
}
