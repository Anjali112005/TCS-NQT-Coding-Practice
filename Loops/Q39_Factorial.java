
/*Write a Java program to read a non-negative integer N and calculate its factorial using a loop.

The factorial of a number is the product of all positive integers from 1 to that number. By definition, (0! = 1). */
import java.util.*;

public class Q39_Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
    }
}
