public class Work  {
    public static void main(String[] args) {
        // Work w=new Work();
        // w.rule5();
        
        // Citizen1 w=new Work();//dynamic binding
        // w.rule5();

        // Citizen1 c = new Citizen1() {//anonymous class
        // public void rule5() {
        // System.out.println("keep silence -1");
        // }
        // };
        // c.rule5();

        // with lambda expression
        Citizen1 c = () -> {
            System.out.println("keep silence -1");
        };
        c.rule5();
    }

    // !without lambda
    // public void rule5() {
    //     System.out.println("keep silence");
    // }
}
