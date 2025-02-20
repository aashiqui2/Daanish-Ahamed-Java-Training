import java.util.function.Predicate;
public class PredicateDemo {
    public static void main(String[] args) {
        int a[]={2,3,4,5,6,7,8,11,12};
        Predicate<Integer> p=(n)->(n%2==0);
        Predicate<Integer> p1=(n)->(n<10);
        // test
        // or
        // and
        // negate
        // System.out.println( p.test(20));
        // check(p,a);
        // check(p.and(p1),a);
        // check(p.negate(),a);
        // check(p.or(p1),a);
 
    }
    public static void check( Predicate<Integer> p,int a[])
    {
        for(int val:a){
            boolean result=p.test(val);
            if(result)
            {
                System.out.print(val+" ");
            }
        }
    }
}