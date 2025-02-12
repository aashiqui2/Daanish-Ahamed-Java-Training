package tamilnadu.chennai;
public class Office{
    public Office(){//parentclass
        System.out.println("welcome to office");
    }

    public static void main(String[] args) {
        Office off=new Office();
        off.work();
        off.do_planning();
        
    }void work(){//package private,non static
        System.out.println("working in office");
    }public void wfh(){
        System.out.println("working in home");
    }public void recruit(){
        System.out.println("recruitment");
    }void get_travel_allowance(){
        System.out.println("got money");
    }private void  do_planning(){
        System.out.println("planning for events");


    }
}