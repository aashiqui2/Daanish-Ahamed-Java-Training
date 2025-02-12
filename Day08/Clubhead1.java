package clubhead;
// import clubhead.Club;
public class Clubhead1 extends Club {

    public Clubhead1(){
        System.out.println("From Head");
    }
    public static void main(String[] args) {
        Clubhead1 ch = new Clubhead1();
        ch.impotant();
        ch.attend();
        ch.cars();
        ch.location();

    }
    void attend(){
        System.out.println("all shoud attend");
    }
    void impotant(){
        System.out.println("Don,t do unnecessary work");
    }
}
