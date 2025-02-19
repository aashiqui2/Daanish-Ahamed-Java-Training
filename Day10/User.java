public class User {
    public static void main(String[] args) {
        // Calculator c = (int a,int b)->System.out.println(a+b);
        // c.add(4, 6);

        // Calculator c = new Calculator() {
        //     public void add(int a,int b){
        //         System.out.println(a+b);
        //     }  
        //   };

        // Calculator c = new Calculator(){
        //     public int add (int a ,int b){
        //         return a+b;
        //     }
        // };

        // Calculator c = (int a,int b) -> {return a+b;};
        Calculator c = (int a,int b) -> a+b;



        int result = c.add(4, 6);
        System.out.println(result);
    }
}
