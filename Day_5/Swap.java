public class Swap {
    public static void main(String[] args) {
        int a=5,b=7;
        // System.out.print("a = "+a+"b = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
