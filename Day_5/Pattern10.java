public class Pattern10 {
    public static void main(String[] args) {
        int n=5,count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                // for(int k=1;k<=j;k++)
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
