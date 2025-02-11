public class ArrayDuplicate {
    public static void main(String[] args) {
        int[] a={2,3,1,2,3};
       // int a[] = { 1, 2, 3, 4, 5, 2, 5, 4 };
        int freq[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            int num = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (num == a[j]) {
                    count++;
                    freq[j] = -1;
                }
                if (freq[i] != -1) {
                    freq[i] = count;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            if(freq[i]>1){
                System.out.println(a[i]);
            }
        }
    }
}
