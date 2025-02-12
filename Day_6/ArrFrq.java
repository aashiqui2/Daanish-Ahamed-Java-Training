import java.util.Arrays;
public class ArrFrq {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,2,5,4};
        int freq[]=new int[a.length];      
        for(int i=0;i<a.length;i++){
            int count=1;
            int no=a[i];
            for(int j=i+1;j<a.length;j++){
                if(no==a[j]){
                    count++;
                    freq[j]=-1;
                }
            }
            if(freq[i]!=-1){
                freq[i]=count;
            }
        }
        System.out.println(Arrays.toString(freq));
        

    }
}
