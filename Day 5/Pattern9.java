public class Pattern9 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<n*2;i++){
            int totalColinRow=i>n?2*n-i:i;
            int spaces=n-totalColinRow;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=totalColinRow;k>0;k--){
                System.out.print(k);
            }
            for(int l=2;l<=totalColinRow;l++){
                System.out.print(l);
            }
            System.out.println();

        }
    
    }
    
}
