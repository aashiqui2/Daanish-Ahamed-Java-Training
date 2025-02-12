import java.util.Scanner;
public class Len_last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value:");
        String s= sc.nextLine();
        s = s.trim(); 
        int lastIndex = s.lastIndexOf(" ");
        System.out.println(s.length() - lastIndex-1);
    }
}
