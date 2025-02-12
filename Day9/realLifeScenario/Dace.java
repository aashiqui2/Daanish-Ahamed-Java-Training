package realLifeScenario;

public class Dace extends College{
    Dace(){
        System.out.println("Welcome to DACE");
    }
    public static void main(String[] args) {
        Dace dace=new Dace();
        dace.management();
        dace.accounts();
        dace.admission();
    }


}
