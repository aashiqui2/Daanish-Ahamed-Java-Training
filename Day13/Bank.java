// package Day13;

public class Bank {
    int balance = 10000;

    public Bank(){
        System.out.println("its bank ");
    }
    //getter
    public int get(){
        return this.balance;
    }
    //setter
    public void set(int amount){
        this.balance=this.balance+amount;
    }
}
