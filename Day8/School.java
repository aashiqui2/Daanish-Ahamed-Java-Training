public class School {
    static String name="ABC School";
    int fees;


    public static void main(String[] args) {
        School adimission=new School();
        adimission.teaching();
        System.out.println(name);
        adimission.fees=12000;
        System.out.println(adimission.fees);
    }

    void teaching()
    {
        System.out.println("teacher is teaching");
    }


}