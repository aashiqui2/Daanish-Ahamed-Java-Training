package tamilnadu.chennai;

public class College {
    static String Clgname="DACE";
    int fees=20000;
    public static void main(String[] args) {
        display();
        College clg=new College();
        clg.studying();
    }
    static void display()
    {
        System.out.println("welcome to College "+Clgname);
    }
    void studying()
    {
        System.out.println("students are stydying");
    }
    void recruit()
    {
        System.out.println("company is recruiting");
    }
    void write()
    {
        System.out.println("exam are going on");
    }
}
