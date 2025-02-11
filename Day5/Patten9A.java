package Day5;

public class Patten9A {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<n*2;i++){
            int totalColInRow=i>n?2*n-i:i;
            int spaces = n-totalColInRow;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=totalColInRow;k>0;k--){
                System.out.print(k);
            }
            for(int l=2;l<=totalColInRow;l++){
                System.out.print(l);
            }
            System.out.println();

        }
    }
}
