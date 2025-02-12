import java.util.Scanner;
public class Twotable {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i=sc.nextInt();
        for(i=0;i<11;i++){ 
            System.out.println(i+"");
            System.out.println(i*2);
            i++;
        }
    }
}
