public class Pattern9 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<2*n;i++){
            int totalcolInRow=i>n?2*n-i:i;
            int spaces=n-totalcolInRow;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");

            }for(int k=totalcolInRow;k>0;k--){
                System.out.print(k);
            }
            for(int l=2;l<=totalcolInRow;l++){
                System.out.print(l);
            } System.out.println();
        }
    
    }
    
}
