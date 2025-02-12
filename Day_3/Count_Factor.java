import java.util.Scanner;
public class Count_Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int i=1;
        int a=0;
        while(i<=n){
            if(n%i==0){
               a++;
            }
            i++;
        }
        System.out.println(a);
            
        



    }
    
}
