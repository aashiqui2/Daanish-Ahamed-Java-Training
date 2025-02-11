// package Assignments.2;

import java.util.Scanner;

public class ZeroCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rem = 0, count = 0;
        while (n != 0) {
            if (n % 10 == 0) {
                count++;
            }
            n /= 10;

        }
        System.out.println(count);
    }
}
