package Day5;

public class Pattern10 {
    public static void main(String[] args) {
        int n=5;
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                String chumma= i%2==0?"0":"1";
            System.out.print(chumma);
            count++;
            }
            System.out.println();
        }
        
    }
}
