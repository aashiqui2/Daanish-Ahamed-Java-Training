public class SoftwareEng extends Parent1 implements TrafficRules,EmployeeRules{
    public static void main(String[] args) {
        SoftwareEng se=new SoftwareEng();
        se.cooking();
        se.go_slow();
        se.wear_formals();
    }

    @Override
    public void wear_formals() {
        System.out.println("In formals");

    }

    @Override
    public void work_12_hrs() {
        System.out.println("Working 12 hrs");

    }

    @Override
    public void wear_id() {
        System.out.println("Wearing id card");
    }

    @Override
    public void go_slow() {
        System.out.println("going slow");

    }

    @Override
    public void fine() {
        System.out.println("Fine payed");
    }

    @Override
    public void wearhelmet() {
        System.out.println("Wearing helmet");
    }
    
}
