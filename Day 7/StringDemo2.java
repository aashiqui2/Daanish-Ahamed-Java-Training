import javax.swing.event.SwingPropertyChangeSupport;

public class StringDemo2 {
    public static void main(String[] args) {
//         String s1 = "abc";
//         String s2 = "abc";
//         System.out.println(s1==s2);
//     }
//     String s1 = "abc";
//     String s2 = s1;
//     System.out.println(s1==s2)
// }
    String s1 = "ab";
    String s2 = "abc";
    String s1+="c";
    System.out.println(s1==s2);