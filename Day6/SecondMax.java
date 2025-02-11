// package Day6;

public class SecondMax {
    public static void main(String[] args) {
        int[] a={4,8,3,6,1};
        int first=Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(first<a[i]){
                second=first;
            first=a[i];
        }else if(second<a[i]){
            second=a[i];
        }
    }
        System.out.println(second);
    }
}
