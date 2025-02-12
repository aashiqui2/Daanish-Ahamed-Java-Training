public class Demo {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        Demo d=new Demo();
        d.add(a,b);
        sub(a,b);
        int result=mul(a,b);
        float result1=div(result);
        System.out.println(result1);
    }
    void add(int c,int d)
    {
        System.out.println(c+d);
    }
    static void sub(int e,int f)
    {
        System.out.println(e-f);
    }
    static int mul(int q,int r)
    {
        System.out.println("Multiuplication");
        return q*r;
    }
    static float div(int r)
    {
        return r/5;
    }
}
