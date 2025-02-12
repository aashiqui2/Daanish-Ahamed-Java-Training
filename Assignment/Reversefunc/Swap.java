import java.util.Scanner;
public class Swap {

    public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }System.out.println("enter the first index:");
        int index1=sc.nextInt();
        System.out.println("enter the second index");
        int index2=sc.nextInt();
        
        System.out.println(printarray(a));
        

        

        
    }public void swap(int a[],int index1,int index2){
        int temp=a[index1];
        a[index1]=a[index2];
        a[index2]=temp;

    }public static void printarray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }System.out.println();
    }
    
}
