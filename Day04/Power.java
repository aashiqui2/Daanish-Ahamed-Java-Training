
public class Power {
 public static void main(String[] args) {
    int base= 2,power=3;
    int box =1;
    while ((power>0)) {
        box = box*base;
        power--;
    }
    System.out.println(box);
 }   
}
