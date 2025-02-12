import java.util.Scanner;
public class Teenage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age = sc.nextInt();
        if(age<=19 && age>=13){
            System.out.println("You are a teenager");
        }
        else{
            System.out.println("You are not a Teenager");
        }
    }
    
}
