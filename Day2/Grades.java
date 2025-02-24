import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Mark:");
        int mark = sc.nextInt();
        if(mark>=90){
            System.out.println(" you scored A grade");
        }
        else if(mark>=70&&mark<90){
            System.out.println(" you scored B grade");
        }
        else if(mark>=50&&mark<70){
            System.out.println(" you scored C grade");
        }
        else{
            System.out.println(" Congrutulation you FAILED");
        }
    }
}
