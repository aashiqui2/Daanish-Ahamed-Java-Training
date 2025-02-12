// package Day06;

public class Arraymax {
        public static void main(String[] args) {
            
        
    int a[]= {4,8,3,6,1};
    int first = Integer.MIN_VALUE; 
    int secong = Integer.MIN_VALUE;
    int third = Integer.MIN_VALUE;
    for(int i =0;i<a.length;i++){
        if(first<a[i]){
            secong=first;
            first=a[i];
        }
        else if(secong<a[i]){
            
            secong=a[i];
        }
        else if(third<a[i]&&secong>a[i]){
            third=a[i];
        }
    }
    System.out.println(first+" "+secong+" "+third);
        }
    }       
