package realLifeScenario;

public class MuhammadPP
        implements HostellerRules, StudentRules, Friend {
    MuhammadPP() {
        System.out.println("I am Muhammad P P");
    }

    public static void main(String[] args) {
        MuhammadPP mpp = new MuhammadPP();
        mpp.attend_evening_class();

    }

    @Override
    public void learn() {
        System.out.println("ok.  i wll study");
    }

    @Override
    public void discipline() {
        System.out.println("i am dispinnn");
    }

    @Override
    public void attend_evening_class() {
        System.out.println("i will attend eveing class");
    }

    @Override
    public void payFees() {
        System.out.println("i will payFees");
    }

    @Override
    public void stayInHostel() {
        System.out.println("i will stay");
    }

    @Override
    public void eatMessFood() {
        System.out.println("i will adjust");
    }

    @Override
    public void maintainRoom() {
        System.out.println("i will maintain");
    }

    @Override
    public void hostelDiscipline() {

        System.out.println(" i will be goooood boooyyy");
    }

    @Override
    public void loyal() {
        System.out.println("good Friend");
    }

    @Override
    public void help() {
        System.out.println("Helping Friend");
    }

    @Override
    public void support() {
        System.out.println("Supportive Friend");
    }

}
