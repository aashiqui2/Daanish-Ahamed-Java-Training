// Given an array arr of integers, find all the elements that occur more than once in the array. If no element repeats, return an empty array

public class Duplicate {
    public static void main(String[] args) {
        int[]a = {1,2,3,3,2,1,1};
        int co=0;
        int c1=0;
        int c2=0;
        int []out = {};
        for(int i =0;i<=a.length-1;i++){
            if(a[i]==1){
            // out = a[i];    
            co++;
            }
            else if(a[i]==2){
            c1++;
            }
            else if (a[i]==3) {
             c2++;
            }
        }
        for(int j=1;j<a.length-1;j++){
            if(co>=2){
                System.out.println(out[j]+"");
                break;
            }
        }
        
        }
        
    }

