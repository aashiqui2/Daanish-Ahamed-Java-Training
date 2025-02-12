public class SoftwareEngineer extends Parent1 implements TrafficRules, EmployeeRules {
   public static void main(String[] args) {
      // SoftwareEngineer se=new SoftwareEngineer();
      // TrafficRules se = new SoftwareEngineer();
      EmployeeRules se = new SoftwareEngineer();
      // dynamic binding
      
      // se.cooking();
      // se.go_slow();
      // se.fine();
      se.wear_Id();
      // TrafficRules tf=new TrafficRules();//error

   }

   @Override
   public void wear_formals() {
      System.out.println("i am in formal");
   }

   @Override
   public void work_12_hours() {
      System.out.println("i'll worl 12 hours");
   }

   @Override
   public void wear_Id() {
      System.out.println("i wearing id");
   }

   @Override
   public void go_slow() {
      System.out.println("going slow");
   }

   @Override
   public void wear_helmet() {
      System.out.println("wear helmet");
   }

   @Override
   public void fine() {
      System.out.println("the fone amount is " + fine);
   }

}
