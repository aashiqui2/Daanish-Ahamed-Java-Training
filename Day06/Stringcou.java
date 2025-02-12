// package Day06;

public class Stringcou {
    public static void main(String[] args) {
        String w ="no we are not";
        int count=0;
        for(int i=0;i<w.length();i++){
            if (w.equals(" ")) {
                count=0;
                break;
            }
            else if(w.charAt(i)==' '){
                count++;
            }
            else{
                continue;
            }
        }
    System.out.println(count);
    }
}
