// package Assignments.2;

public class SecondLargest {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int largest=Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(largest<a[i]){
                second=largest;
                largest=a[i];
            }else if(second<a[i]){
                second=a[i];
            }
        }

        System.out.println(second);
    }
}
