// package Day06;

import java.util.Arrays;

public class Twosum {
    public static void main(String[]args) {
        int a[]={2,7,11,15};
        int tar=18;
        int ot[] = new int[2];
        for(int i=0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i]+a[j]==tar){
                    ot[i]=a[i];
                    ot[j]=a[j];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(ot));
    }
}
