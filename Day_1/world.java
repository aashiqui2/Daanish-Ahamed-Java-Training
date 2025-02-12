import java.util.Scanner;
public class world{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scan.nextInt();
        if((a&1)==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        
       
    }
    
}
