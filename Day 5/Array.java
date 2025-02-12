import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        // 1st way
        int []a={1,2,3,4,5};
        System.out.println(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        // 2nd way;
        Scanner sc=new Scanner(System.in);
        int b[]=new int[5];
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        for(int value:b){
            System.out.println(value+" ");
        }
    }
}
