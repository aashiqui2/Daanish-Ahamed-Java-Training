import java.util.Scanner;
public class ExpDemo {
    public static void main(String[] args) {
        
        divide();
    }
    static void divide(){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        try{
            System.out.println(a/b);
            int arr[]  = {4,5,6};
            for (int i = 0; i<5;i++){
                
                System.out.println(arr[i]);
            }
                
        }
        catch(Exception e){
            System.out.println("how");
        }
        finally{
            System.out.println("u always make mistake");
        }
    }
}
