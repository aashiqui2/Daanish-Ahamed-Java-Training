public class SoftwareEngineer extends 
Parent1 implements EmployeeRules,TrafficRules{
    public static void main(String[] args) {
        // SoftwareEngineer se=new SoftwareEngineer();

        TrafficRules se= new SoftwareEngineer();
        SoftwareEngineer se1= new SoftwareEngineer();
        // se.work();
        se1.work();

        
        // se.wear_formals();
        // se.wear_id();
        // se.work();
        // se.cooking();
        System.out.println(noOfLeaves);
        // se.wearHelmet();
    }

    @Override
    public void wear_formals() {
        System.out.println("I will wear Formals");
    }

    @Override
    public void wear_id() {
        System.out.println("I will wear ID");
    }

    @Override
    public void go_slow() {
       System.out.println("I will go slow");
    }

    @Override
    public void wearHelmet() {
      System.out.println("I will wear Helmet");
    }
}
