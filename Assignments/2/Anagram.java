// package Assignments.2;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "Tab";
        String s2 = "Bat";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        boolean isAnagram=false;

        if (s1.length() != s2.length()) {
            isAnagram=false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            isAnagram=true;
        }
        System.out.println(isAnagram?"Anagram":"Not an Anagram");

    }
}
