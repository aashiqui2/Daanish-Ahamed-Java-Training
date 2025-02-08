
public class Swap {
    public static void main(String[] args) {
        int a=5,b=7;

        // int temp=a;//5
        // a=b;//7
        // b=temp;//5

        a=a+b;//12
        b=a-b;//5
        a=a-b;//7
        
        System.out.println(a+" "+b);
    }
}
