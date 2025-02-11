package Day5;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //1st Way
        int[] a= {1,2,3,4,5,6};
        System.out.println(a); //[I@3fee733d
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
            // System.out.println();
        //2nd Way
        System.out.println("Enter 5 values");
        int[] b=new int[5];
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        ///for each loop or Cursor for printing
        for(int value:a){   
            System.out.print(value+" ");
        }
    }
}
