import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Odd or Even Checker \nEnter a Number:");
        int num = scan.nextInt();
        // System.out.println(num%2==0?"number is Even":"number is odd");'
        if(num%2==0){
            System.out.println(num+ "is even");
        }else{
            System.out.println(num+ "is odd");
        }
        scan.close();

    }
}
