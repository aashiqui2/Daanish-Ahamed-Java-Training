import java.util.Scanner;

public class Tables {

    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int table = Scanner.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(i+"*" + table + "="+i*table);
        }

    }
}
