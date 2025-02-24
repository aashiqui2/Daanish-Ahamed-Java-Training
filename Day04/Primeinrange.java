import java.util.Scanner;

public class Primeinrange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
            int div = 2;
            for(int i =2;i<n;i++){
                boolean isprime=true;
                for(;div<=i;div++){
                    if (i%div==0) {
                        isprime=false;
                        break;
                    }
                }
                System.out.println(isprime?i+" True":" False");
    
            }

    }
}
