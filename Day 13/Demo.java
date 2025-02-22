import java.util.*;

public class Demo {
    public static void main(String[] args) {
        // int a[]={1,2,3,4};
        Scanner sc = new Scanner(System.in);
        // int b[]= new int[5];
        // for(int i=0;i<b.length;i++)
        // {
        // b[i]=sc.nextInt();
        // }
        // System.out.println(Arrays.toString(b));
        // int a[][]={
        // {1,2,3},//0
        // {4,5,6},//1
        // {7,8,9}//2
        // };

        // for(int i=0;i<a.length;i++)
        // {
        // for(int j=0;j<a[i].length;j++)
        // {
        // System.out.print(a[i][j]+" ");
        // }
        // System.out.println();
        // }

        // int a[][] = new int[3][2];
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a[i].length; j++) {
        //         a[i][j] = sc.nextInt();
        //     }
        // }
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j <a[i].length; j++) {
        //         System.out.print(a[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        int a[][]=new int[3][];
        a[0]=new int[3];
        a[1]= new int[2];
        a[2]= new int[1];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        




    }

}