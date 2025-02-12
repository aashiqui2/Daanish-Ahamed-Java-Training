public class Pattern9 {
    public static void main(String[] args) {
        int  n=5;
        for (int i = 0; i <=0; i++) 
        {
            int totalColInRow=i>n?2*n-i:i;
            int spaces=n-totalColInRow;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=totalColInRow;k>0;k--){
                System.out.print(k);
            }
            System.out.println();
            

        }
    }
    
}
