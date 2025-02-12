public class NestedIf {
    public static void main(String[] args) {
        int a = 60;
        boolean hallticket = true;
        if(hallticket == true){
            if(a>=60){
                System.out.println("Eligible for test");
            }
            else{
                System.out.println("Pay fine then ho to test");
            }
        }
        else{
            System.out.println("Not eligible for test");
        }
        
    }
}
