import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("Grade Calculator\nEnter your Marks:");
        Scanner sc=new Scanner(System.in);
        
        int marks=sc.nextInt();
        String grade=null;
        if (marks>=90 && marks<=100) {
            grade="A";
        }else if (marks>=80 && marks<90) {
            grade="B";
        }else if (marks>=70 && marks<80) {
            grade="C";
        }else if (marks>=60 && marks<70) {
            grade="D";
        }else if (marks>=0 && marks<60) {
            grade="Fail";
        }else{
            grade="Invalid Input";
        }

        System.out.println("Grade:"+grade);
        sc.close();
    }
}
