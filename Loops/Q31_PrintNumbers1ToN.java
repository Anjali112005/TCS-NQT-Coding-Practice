
/*Write a Java program to read an integer N and print all numbers from 1 to N in ascending order.

Example: If N = 5, print 1 2 3 4 5. */
import java.util.*;

public class Q31_PrintNumbers1ToN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Ascending Order : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
