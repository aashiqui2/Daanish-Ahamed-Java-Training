package Day5;

public class Pattern7 {
    public static void main(String[] args) {
        int n=10;
        for (int i = 1; i <= n; i++) {
           for(int j=1;j<i;j++){
            System.out.print(" ");
           }
           for(int k=1;k<=n-i+1;k++){
            System.out.print("*");
           }
           System.out.println();
        }

    }

    }
