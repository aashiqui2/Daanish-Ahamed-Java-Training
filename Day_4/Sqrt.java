public class Sqrt {
    public static void main(String[] args) {
        int n=16;
        int div=2;
        while(div<=n/2){
            if(n/div==div){
                System.out.println(div);
                break;
            }
            div++;
        }
    }
}
