package Day4;

public class Pattern4 {
    public static void main(String[] args) {
        for(int row=1;row<=5;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col + "");
            }
            System.out.println();
        }
    
}

}