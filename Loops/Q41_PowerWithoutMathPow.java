
/*Write a Java program to calculate \(a^b\) without using the built-in Math.pow() function.

Read two integers:
- a — the base
- b — the exponent (a non-negative integer)
Multiply the base by itself b times and print the result. */
import java.util.*;

public class Q41_PowerWithoutMathPow {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        System.out.println("Result :" + result);
        sc.close();
    }
}
