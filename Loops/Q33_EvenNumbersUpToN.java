
/*Write a Java program to read an integer N and print all even numbers from 1 to N, inclusive. */
import java.util.*;

public class Q33_EvenNumbersUpToN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}

/*
 * or
 * for (int i = 2; i <= n; i += 2) {
 * System.out.print(i + " ");
 * }
 */
