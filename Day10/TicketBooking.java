import java.util.function.Predicate;

public class TicketBooking {
    public static void main(String[] args) {
        // TicketBooking tic = new TicketBooking();
        // System.out.println(tic.tick(65));
        // Predicate<Integer> p = (amount) -> (amount>60);
        // System.out.println(p.test(40));
    
    
        int a[] = {2,4,5,6,7,2};
        Predicate<Integer> p1 = (n) -> (n%2!=0);
        Predicate<Integer> p2 = (n) -> (n%2==0);
        val(p1,a);
        val1(p2,a);
        val(p1.and(p2),a);
    }

    public static void  val(Predicate<Integer>p1 , int a[]){
        for(int i:a){
            boolean result = p1.test(i);
            if(result){
                System.out.println(i+"");
            }
        }
    }    

    public static void val1(Predicate<Integer>p2 , int a[]){
        for(int i:a){
            boolean result = p2.test(i);
            if(result){
                System.out.println(i+"");
            }
        }
    }    
    
   
   
   
   
   
   
   
    // public boolean tick(int amount){
    //     if(amount >60){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }        
    // }
}
