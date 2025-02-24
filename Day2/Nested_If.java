import java.util.Scanner;

public class Nested_If {
    public static void main(String[] args) {
        System.out.println("Do have halltic or not(true/false)");
        Scanner sc = new Scanner(System.in);
        boolean halltic = sc.nextBoolean();
        int a=60;
        // boolean halltic = true;FA
        if(a>=60){
            if(halltic=true){
                System.out.println("Eligible");
            }
           
            else{
            System.out.println("need halltic");
            }
        }
        else{
            System.out.println("Need addence");
        } 
    }
}
