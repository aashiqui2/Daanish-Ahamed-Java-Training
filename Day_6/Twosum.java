import java.util.Arrays;
public class Twosum {
    public static void main(String[] args) {
        int a[]={2,7,11,15};
        int target=13;
        int res[]=new int[2];
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    res[0]=a[i];
                    res[1]=a[j];
                    break;
                }
            }
            break;
        }
        System.out.println(Arrays.toString(res));
    }
}
