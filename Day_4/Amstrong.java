public class Amstrong {
    public static void main(String[] args) {
        int n = 8208;
        int count= 0;
        for(int i=n;i>0;i=i/10){ 
            count++;
        }
        // System.out.println(count);
        int rem=0,result = 0;
        int temp = n;
        while(temp!=0){
            rem = temp%10;
            result=result+(int)Math.pow(rem,count);
            temp = temp/10;

        }
        // if(n==result){
        //     System.out.println("It is an amstrong number");
        // }
        // else{
        //     System.out.println("Not an amstrong number");
        // }
        System.out.println(result==n?"Amstrong":"not Amstrong");

    }
}
