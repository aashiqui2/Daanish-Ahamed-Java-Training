
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        int a[] = {2,3,5,1,6};
        Predicate<Integer>p = (n) ->(n%5==0);
        Predicate<Integer>p1 = (n) ->(n<5);
        //test, or ,and ,negate
        // p.test(30);
        check(p.or(p1),a);
        check(p.and(p1),a);
        
    }
    public static void check(Predicate<Integer> p ,int a[]){
        for(int val:a){
            boolean result=p.test(val);
            if(result){
                System.out.println(val+"");
            }
        }
    }
}
