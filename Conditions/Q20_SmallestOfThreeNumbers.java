/*Write a Java program to read three numbers from the user and find the smallest number. */

import java.util.Scanner;

public class Q20_SmallestOfThreeNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("All are equal!");
        } else if (a <= b && a <= c) {
            System.out.println(" a is smallest : " + a);
        } else if (b <= a && b <= c) {
            System.out.println("b is smallest : " + b);
        } else {
            System.out.println("c is smallest : " + c);
        }
        sc.close();
    }
}
