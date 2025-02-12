// package Day06;
public class Arrayw {
    public static void main(String[] args) {
        int a[]= {4,8,3,6,1};
        int first = Integer.MAX_VALUE; 
        int secong = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;
        for(int i =0;i<a.length;i++){
            if(first>a[i]){
                third=secong;
                secong=first; 
                first=a[i];
            }
            else if(secong>a[i]){
                third=secong;
                secong=a[i];
                
            }
            else if(third>a[i]){
                third=a[i];
            }
        }
        System.out.println(first+" "+secong+" "+third);
    }
}
