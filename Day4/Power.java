package Day4;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=2,power=8;
    int box=1;
    while(power>0){
        box*=base;
        power--;
    }

    System.out.println(box);
    String s=sc.next();
    System.out.println(s);

    sc.close();
    }
}
