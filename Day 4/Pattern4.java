public class Pattern4 {
    public static void main(String[] args) {
        
        for(int i=0;i<5;i++)
        {
            for(int j=5-i;j>0;j--)
            {
                System.out.print(i,i+1);
            }
            System.out.println();
        }
    }
}
