
public class Sum {
    public static void main(String[] args) {
        int a =7;//15,9,14,1o
        int count = 0;//1,2,3
        for(int i = a-1;i>0;i--){//7,6,5,4
            if(count%2==0){
                a+=i;
            }
            else{
                a-=i;
            }
            count+=1;
         }
     System.out.println(a);    
    }
}
