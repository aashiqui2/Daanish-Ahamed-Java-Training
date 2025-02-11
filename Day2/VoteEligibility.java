import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("you're Eligble for Vote");
        }else{
            System.out.println("You're not eligible to vote");
        }

        sc.close();
    }
}
