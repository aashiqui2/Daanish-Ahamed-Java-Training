public class StringDemo2 {
    public static void main(String[] args) {
        // String str="hello";

        String str=new String("hello");
        String str1=new String("hello");

        // if(str==str1)
        // {
        //     System.out.println("same");
        // }
        // else{
        //     System.out.println("not same");
        // }

        if(str.equals(str1))
        {
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
    }
}
