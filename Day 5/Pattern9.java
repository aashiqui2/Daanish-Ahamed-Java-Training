public class Pattern9 {

    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<n*2;row++){
            int totalcolsinRows=row>n?2*n-row:row;
            int space=n-totalcolsinRows;
            for(int col=1;col<=space;col++){
                System.out.print(" ");
            }
            for(int k=totalcolsinRows;k>0;k--){
                System.out.print(k);
            }
            for(int l=2;l<=totalcolsinRows;l++){
            System.out.print(l);
        }
        
        System.out.println();


    }
}
}
