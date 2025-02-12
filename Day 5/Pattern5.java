public class Pattern5 {

    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<n*2;row++){
            int totalcols=row>n?2*n-row:row;
            for(int col=1;col<=totalcols;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}