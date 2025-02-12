

public class SoftwareEngineer extends Parent1 implements TrafficRule,Emplyes {
    public static void main(String[] args) {
        SoftwareEngineer sf = new SoftwareEngineer();
        sf.id();
        sf.wear_formals();
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
    public void id() {
       System.out.println("i wearing id");
    }
 
    @Override
    public void gosloe() {
       System.out.println("going slow");
    }
 
    @Override
    public void wear_helment() {
       System.out.println("wear helmet");
    }
 
    @Override
    public void fine() {
       System.out.println("the fone amount is " + fine);
    }
}
