public class RevMethod{
    public static void main(String[] args) {
        int a = 1234;
        System.out.println(rev(a));
    }
    static int rev(int n){
        int reverse=0;
        while(n>0) {
            int rem = n%10;
            reverse = reverse*10 + rem;
            n /= 10;
        }
        return reverse;
    }

}