package Day3;

public class ForLoop {
    //for(initialization;condition;increment)
    public static void main(String[] args) {
        int i=0;
        for(i=0;i<10;i++){
            System.out.print(i +" ");
            // i++;  this will also work
        }
        System.out.println(i); 
        //i is not initialised as a global, It is local.
        int j=0;
        for(;j<5;){
            System.out.println("Value of j: "+j);
            j++;
        }
    }

    
}
