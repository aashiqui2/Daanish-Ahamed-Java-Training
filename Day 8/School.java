public class School{
    static String name="ABC School";
    int fees;
    public static void main(String[] args){
        School admission = new School();
        admission.teaching();
        System.out.println(name);
        admission.fees=12000;
        System.out.println(admission.fees);
    }
    void teaching()
    {
        System.out.println("teacher is teaching");
    }
}