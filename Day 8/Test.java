public class Test  {
    static String a="hello";
    public static void main(String[] args) {
        Test t=new Test();
        t.display();
        Test t1=new Test();
        t1.display1();
    }
    void display()
    {
        a="boy";
    }
    void display1()
    {
        System.out.println(a);
    }
}


