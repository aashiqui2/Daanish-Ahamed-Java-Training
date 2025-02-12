import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = sc.nextInt();
        if(a%3==0 && a%5==0){
            System.out.println(a+" is divisible by both 3 and 5");
        }
        else{
            System.out.println(a+" is not divisible by both 3 and 5");
        }

    }
}
