package Day3;

public class WhileLoop {
    public static void main(String[] args) {

        /* ---SYNTAX---

        --------------------------------
         initialization                
         While(condition)
         {
         increment++ [it is optional] - but it leads to infinite Looooop
         }
         --------------------------------
         */
        

         int i=2;
         while (i<10) {
            if(i%2==0){
                System.out.println(i);
            }
            i++;
         }
    }


}
