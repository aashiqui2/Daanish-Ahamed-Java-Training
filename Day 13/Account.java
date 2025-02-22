public class Account  extends Bank{
    public static void main(String[] args) {
        // Bank b= new Bank();
        // // System.out.println(b.balance);
        // b.balance=20000;
        // System.out.println(b.balance);

        Account ac= new Account();
        // ac.minbalance();

        System.out.println("min balance is "+ac.getMinbalance());
        ac.setAmount(50000);
        System.out.println(ac.getBalance());

    }
}
