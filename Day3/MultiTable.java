package Day3;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Table you want:");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
        sc.close();
    }
}
