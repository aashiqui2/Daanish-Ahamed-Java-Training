public class StringDemo3 {
   public static void main(String[] args) {
      String s1="silence please! don't talk";

      System.out.println(s1.startsWith("silence"));
      System.out.println(s1.startsWith("please"));

      System.out.println(s1.startsWith("please",8));

      System.out.println(s1.endsWith("t"));

   } 
}
