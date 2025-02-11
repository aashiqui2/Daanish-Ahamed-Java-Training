// package Assignments.2;

public class ReversedString {
    public static void main(String[] args) {
        String s="hellof";
        String reversed="";
        for(int i=s.length()-1;i>=0;i--){
            reversed+=s.charAt(i);

        }
        System.out.println(reversed);
    }
}
