import java.util.Scanner;
public class Arraydemo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b[]=new int[5];
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        for(int value:b){
            //for each loop
            System.out.println(value+" ");
        }

    }
    
}
