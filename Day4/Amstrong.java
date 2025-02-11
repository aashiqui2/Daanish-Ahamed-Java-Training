package Day4;
public class Amstrong{
    public static void main(String[] args) {
        int val=153;
        int num=val;
        int n=val;
        double rem=0;
        double result=0;
        int count=0;
        //find number of digit
        while (num!=0) {     
            rem=n%10;
            count++;
            num/=10;



        }       
        System.out.println(count);

        double remain=0;
        double resultss=0;
        while (n!=0) {
            remain=n%10;
            resultss=resultss+Math.pow(remain, count);
            n/=10;
        }

        System.out.println("sum is:"+resultss);
        if(val==resultss){
            System.out.println("It is amstrong number");
        }else{
            System.out.println("Not amstrong number");
        }
    }


}