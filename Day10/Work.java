// package Day10;

public class Work implements Citizen{    //for fonctional interface no need of iplements
    public static void main(String[] args) {
        // Work w = new Work();
        // Citizen w  = new Work();  //Dinamic binding
        // w.rule1();

 
        // Citizen c = new Citizen() {
        //     public void rule1(){
        //         System.out.println("silience");    //anaonyums class 
        //     }
        // };
        // c.rule1();

        Citizen c = ()->
        {
            System.out.println("silience");    // lamda expresion
        };
        c.rule1();


    }
    public void rule1(){
        System.out.println("hehe");
    }
}
