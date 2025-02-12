public class Pattern10 {
    public static void main(String[] args) {
        int count=1;
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
