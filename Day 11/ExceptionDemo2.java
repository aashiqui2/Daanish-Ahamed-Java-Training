public class ExceptionDemo2 extends  ChildDemo {
    public static void main(String[] args) {

        ExceptionDemo2 e= new ExceptionDemo2();

        try{
            e.divide(2,0);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("check second no");
        }
    }
    public void work()
    {
        System.out.println("IT");
    }
}
