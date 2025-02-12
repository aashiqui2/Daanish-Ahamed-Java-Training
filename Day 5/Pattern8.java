public class Pattern8 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int col=1;col<n-row;col++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*row-1);k++){
                System.err.print("*");
            }
            System.out.println();
        }
        
    }
}
