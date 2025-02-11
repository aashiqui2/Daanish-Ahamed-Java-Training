import java.util.Scanner;

public class IsTeenager {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age=sc.nextInt();
        if(age>12 && age<20){
            System.out.println("Congrats!, you're Teenager");
        }
        else{
            System.out.println("you're not teenager");
        }
        sc.close();
    }
}
