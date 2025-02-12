public class Demo {
    static{
        System.out.println("Static block");
    }
    {
        System.out.println("non static block 1");
    }
    {
        System.out.println("non static block 2");
    }
    public static void main(String[] args) {
        Demo d=new Demo();
        Demo d1=new Demo();

        
    }
    
}
