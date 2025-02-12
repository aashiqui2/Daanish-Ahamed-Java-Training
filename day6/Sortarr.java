import java.util.Arrays;
public class Sortarr {
    public static void main(String[] args) {
        int a[]={0,0,1,1,2,2};
        int c0=0,c1=0,c2=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                c0++;

            }else if(a[i]==1){
                c1++;
            }else if(a[i]==2){
                c2++;
            }
        }
            for(int i=0;i<c0;i++){
                a[i]=0;
            }
            for(int i=c0;i<c0+c1;i++){
                a[i]=1;
            }for(int i=c0+c1;i<a.length;i++){
                a[i]=2;
            }
        System.out.println(Arrays.toString(a));

    }
    
}
