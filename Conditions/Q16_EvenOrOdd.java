/*Write a Java program to check whether a given integer is even or odd. */

import java.util.*;

public class Q16_EvenOrOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        sc.close();
    }
}
