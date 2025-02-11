// package Day6;

public class ThirdMin {
    public static void main(String[] args) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;
        int[] a = { 4, 8, 3, 6, 1 };
        for (int i = 0; i < a.length; i++) {

            if(first>a[i]){
                third=second;
                second=first;
                first=a[i];
            }else if(second>a[i]){
                third=second;
                second=a[i];
            }else if(third>a[i] && a[i]!=first && a[i]!=second){
                third=a[i];
            }
        }

        System.out.println(third);
    }
}
