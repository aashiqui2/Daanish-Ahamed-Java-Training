import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        System.out.print("Enter the year:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        /*if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("its a leap year");
                }
                else{
                    System.out.println("its not a leap year");
                    }
            else{
                System.out.println("its a leap year");
            }
            System.out.println("its a leap year");
        }
        else{
            System.out.println("its not a leap year");
        }
        }*/
        if(year%4==0 && year%100!=0 || year%400==0){//in here there are 3 condition if 2 condition are T no need for 3 condition//
            System.out.println("its a leap year");
        }
        else{
            System.out.println("its not a leap year");
        }
    }
}        