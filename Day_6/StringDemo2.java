public class StringDemo2 {
    public static void main(String[] args) {
        String str="Hello";
        String str1=new String("Hello");
        if(str.equals(str1)){
            System.out.println("Same");
        }
        else{
            System.out.println("Not same");
        }
    }
}
