public class Demo{
    public static void main(String[] args) {
        int a=5;
        int b=6;
        Demo d=new Demo();
        d.add(a,b);
        sub(a,b);
        int result=mul(a,b);
        float result=div(result);
        System.out.println(result);


    }
    void add(int c,int d)
    {
        System.out.println(c+d);
    }
    static void sub( int e, int f)
    {
        System.out.println(e-f);
    }
    
}