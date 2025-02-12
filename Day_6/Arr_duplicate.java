import java.util.Arrays;
public class Arr_duplicate {
    public static void main(String[] args) {
        int a[]={2,3,1,2,3};
        int res[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            int no=a[i];
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    res[i]=no;
                    break;

                }
            }
           
    }System.out.println(Arrays.toString(res));

        
       
        
        
    }
}
