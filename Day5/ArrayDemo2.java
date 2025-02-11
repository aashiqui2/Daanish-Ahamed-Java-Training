package Day5;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] a={2,4,6,8,10};
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                System.out.print(a[i]+" ");
            }
        }

        // System.out.println(sum);
    }
}
