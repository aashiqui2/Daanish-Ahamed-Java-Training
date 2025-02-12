import java.util.Scanner;
public class Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:");
        int a = sc.nextInt();
        if(a>=0){
            System.out.println(a+" is positive");
        }
        else{
            System.out.println(a+" is negative");
        }
        
    }
}
