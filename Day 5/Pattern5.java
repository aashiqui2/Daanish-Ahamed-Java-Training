public class Pattern5 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<n*2;i++)
        {
            int totalCols=i>n?2*n-i:i;
            for(int j=1;j<=totalCols;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}