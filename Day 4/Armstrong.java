public class Armstrong {
    public static void main(String[] args) {
        int n=153;
        int count=0;
        for(int i=n;i>0;i=i/10)
        {
            count++;
        }
        System.out.println(count);
    }

}
