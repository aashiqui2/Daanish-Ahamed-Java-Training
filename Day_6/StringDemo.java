public class StringDemo {
    public static void main(String[] args) {
        //First way of creating String
        String str ="hello World";
        //Second way of Creating String
        String str1 =new String("hello World");
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
