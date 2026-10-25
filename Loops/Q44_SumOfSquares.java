
/*Write a Java program that reads an integer N and calculates the sum of the squares of all numbers from 1 to N.

Formula: Sum = 1^2 + 2^2 + 3^2 + . . . . + N^2
*/
import java.util.*;

public class Q44_SumOfSquares {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (long) i * i;
        }
        System.out.println("Sum : " + sum);
        sc.close();

    }
}
