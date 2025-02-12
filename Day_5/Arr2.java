import java.util.Scanner;
public class Arr2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 5 no:");
        int b[]=new int[5];
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        for(int value:b)
        {
            System.out.print(value+" ");

        }
    }
}
