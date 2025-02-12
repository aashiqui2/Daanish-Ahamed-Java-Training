package tamilnadu.chennai;
public class college {
    static String clgname="DACE";
    int fees=20000;
    public static void main(String[] args) {
        display();
        college clg=new college();
        clg.studying();
        clg.recruit();


    }
    static void display()
    {
        System.out.println("Welcome to college"+clgname);

    }
    void studying()
    {
        System.out.println("studemts are studying");
    }
    void recruit()
    {
        System.out.println("company is recruiting");
    }
    void write()
    {
        System.out.println("exams are going on");
    }
    
}
