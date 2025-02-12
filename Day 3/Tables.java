import java.util.Scanner;
public class Tables {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int table=sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(i+ "*"+ table + "=" + i *table);
        }
        
    }
}