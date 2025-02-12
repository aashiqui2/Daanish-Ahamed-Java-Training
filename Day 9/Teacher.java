public abstract class Teacher {
    Teacher()
    {
        System.out.println("i am DACE Staff");
    }

    public static void main(String[] args) {
    //  Teacher t=new Teacher() ;
    //  t.quespaper();
    // ? we cannot able create object in abstract class
    }
    void teaching()
    {
        System.out.println("staff is teaching");
    }
    abstract void quespaper();
}