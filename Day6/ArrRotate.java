// package Day6;

import java.util.Arrays;

public class ArrRotate {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int first=a[0];
        for(int i=0;i<=a.length-2;i++){
            a[i]=a[i+1];
        }
        a[a.length-1]=first;
        

        // for(int val:a){
        //     System.out.println(val);
        // }

        System.out.println(Arrays.toString(a));
        
    }
}
