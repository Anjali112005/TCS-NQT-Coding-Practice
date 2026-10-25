
/*Write a Java program to read an integer N and print all odd numbers from 1 to N, inclusive. */
import java.util.*;

public class Q34_OddNumbersUpToN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}

/*
 * or
 * for (int i = 1; i <= n; i += 2) {
 * System.out.print(i + " ");
 * }
 */
