public class ExceptionDemo {

    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException abc)
        {
            System.out.println("check b value ");
        }
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at ExceptionDemo.main(ExceptionDemo.java:6)
        System.out.println("hi");
    }
}