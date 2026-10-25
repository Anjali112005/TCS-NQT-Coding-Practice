
/*Write a Java program that reads an integer N and prints a right-angled triangle made of stars (*), with N rows.

For example, if N = 4, the first row has one star, the second row has two stars, and so on. */
import java.util.*;

public class Q47_RightAngledTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
