import java.util.Scanner;
//amd option using find odd or even//

public class And {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if((a&1)==0){
            System.out.println("its a even");
        }
        else{
            System.out.println("its a odd");
        }

    }
    
}
