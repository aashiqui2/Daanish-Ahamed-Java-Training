public class Demo1 {
    {
        System.out.println("hello world from non-static block-1");
    }
    {
        System.out.println("hello world from non-static block-2");
    }
    static{
        System.out.println("hello world from static block");
    }
    public static void main(String[] args) {
        
        Demo1 d=new Demo1();
        Demo1 d1=new Demo1();
        
    }
    
}
