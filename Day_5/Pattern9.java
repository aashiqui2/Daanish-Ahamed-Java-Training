import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n= sc.nextInt();
        for(int i=1;i<=n*2;i++){
            int totalcolnrow=i>n?2*n-i:i;
            int space=n-totalcolnrow;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k=totalcolnrow;k>0;k--){
                System.out.print(k);
                
            }
            for(int l=2;l<=totalcolnrow;l++){
                System.out.print(l);
            }
            System.out.println();
}
       }
    }
            

