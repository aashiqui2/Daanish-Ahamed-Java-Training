// package Day11;

public class Inter {
public static void main(String[] args) {
    int a = 10;
    int b = 0;
    try{
    System.out.println(a/b);
    }
    catch(ArithmeticException e){
        System.out.println("check");

    }
    /*Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Inter.main(Inter.java:7)*/
    System.out.println("hi");
    }

}
