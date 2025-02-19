public class User {
    public static void main(String[] args) {
        // Calculator c=new Calculator(){
        // public void add(int a,int b)
        // {
        // System.out.println(a+b);
        // }
        // };
        // c.add(2, 3);

        // Calculator c = (int a, int b) -> {
        // System.out.println(a + b);
        // };

        // ? if we have single line then no need of {}
        // Calculator c = (int a, int b) -> System.out.println(a + b);
        // c.add(2, 3);


        // Calculator c= new Calculator() {
        //     public int add(int a,int b)
        //     {
        //         return a+b;
        //     }
        // };
        // int result=c.add(2, 3);
        // System.out.println(result);

        // Calculator c= (int a,int b)->{ return a+b;};
        // ? if we have single line statemnt with return keyword then we can remove return keyword and {}
        Calculator c= (int a,int b)->a+b;
    
        int result=c.add(2, 3);
        System.out.println(result);
    }
}
