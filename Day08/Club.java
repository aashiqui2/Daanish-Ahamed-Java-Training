package clubhead;
public class Club {
        int members = 2000;                                
        public Club(){
            System.out.println("Welcome to the =>CLUB<=");

        }
        public static void main(String[] args) {
            Club cb = new Club();
            cb.cars();
            cb.location();
        }
        void cars(){
            System.out.println("cars are allowed");
        }
        void location(){
            System.out.println(" GOA ");
        }
}
