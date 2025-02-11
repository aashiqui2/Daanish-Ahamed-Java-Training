package Day5;

public class Swap {
    public static void main(String[] args) {
        int a=5,b=7;
        int temp=a;
        a=b;
        b=temp;

        System.out.println(a);

        int c=4,d=5;
        c=c+d; //9
        d=c-d;// 9-5=4
        c=c-d;// 9-4=5

        System.out.println(c +" "+d);
    }
}
