/*Write a Java program to read an integer from the user and find its absolute value.

The absolute value of a number is its distance from zero, so it is never negative.

Examples:
- 10 → 10
- -25 → 25
- 0 → 0 */

import java.util.*;

public class Q28_AbsoluteValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            n = -n;
        }
        System.out.println("Absolute value: " + n);
        sc.close();
    }
}
