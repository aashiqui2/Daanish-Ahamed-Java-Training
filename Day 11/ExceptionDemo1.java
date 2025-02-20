import java.util.Scanner;;
public class ExceptionDemo1 {
    public static void main(String[] args){
        divide();
    }

    public static void divide()
    {
        Scanner sc= new Scanner(System.in);
        // exception possible areas
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            int result=a/b;

            int arr[]=new int[result];
            for(int i=0;i<10;i++)
            {
                System.out.println(arr[i]);
            }

            Class.forName("ExceptionDemo1");

        }
        catch(ClassNotFoundException ce)
        {
            System.out.println("class not found");
        }
        catch(NegativeArraySizeException na)
        {
            System.out.println("check the array size");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("check value of b");
        }
        catch(ArrayIndexOutOfBoundsException aio)
        {
            System.out.println("check the for loop");
        }
        // catch(Exception e)
        // {
        //     System.out.println("some went wrong");
        // }
        
        finally{
            System.out.println("i am done");
            // always get exected 
        }
        
    }
}
