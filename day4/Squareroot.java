public class Squareroot {
    public static void main(String[] args) {
        int n=81;
        int div=2;
        while(div<=n/2)
        {
            if(n/div==div)
            {
                System.out.println(div);
                break;
            }
            div++;
        }
    }
}
