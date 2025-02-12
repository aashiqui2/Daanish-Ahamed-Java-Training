public class School{
    static String name="AB0C School";
    public static void main(String[] args) {
        School admission=new School();
        admission.teaching();
        System.out.println(name);
        admission.fees=12000;
        System.out.println(admission.fees);
    }
    void tracking(){
        System.out.println("Teacher is teaching");
    }
}