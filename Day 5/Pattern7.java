public class Pattern7 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int col=1;col<row;col++){
                System.out.print(" ");
            }
            for(int k=1;k<=n-row+1;k++){
                System.out.print("*");
            }
            System.out.println();
            }                
        }
        
    }

