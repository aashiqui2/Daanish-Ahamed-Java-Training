import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Character");
        String s=scan.next();
        char c = s.toLowerCase().charAt(0);
        int charV=c;
        // System.out.println(charV);
        if(charV>=97 && charV<=122){
            if(c=='a' || c=='e' || c=='i' || c=='o'|| c=='u'){
                System.out.println(c+ "is vowel");
            }else{
                System.out.println(c+ "is consonant");
            }
        }else{
            System.out.println("Invalid Input");
        }

        scan.close();
        
    }
}
