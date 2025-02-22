import java.util.regex.*;
public class RegixDemo {
    public static void main(String[] args) {
                //0123456789 
        String s="Thuppaarkkuth Thuppaaya Thuppaakkith Thuppaarkkuth Thuppaaya Thooum Mazhai";
        // Pattern p=new Pattern();//constructor is private
        Pattern p=Pattern.compile("Thuppa");
        Matcher m=p.matcher(s);
        // find(),group(),start(),end()
        while(m.find())
        {
// System.out.println(m.group()+" comes at "+m.start()+" ends at "+m.end());
           System.out.print(m.group());
        }


        
    }
}
