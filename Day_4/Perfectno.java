public class Perfectno {
    public static void main(String[] args) {
       int n=28;
       int temp=n,sum =0;
       for(int i=1;i<=temp/2;i++){
            if(temp%i==0){
                sum =sum+i;
            }
       }
        System.out.println((n==sum)?"yes":"no");
    }   
}
