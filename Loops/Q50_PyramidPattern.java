
/*Write a Java program that reads an integer N and prints a pyramid pattern using stars (*).

For N = 4, the pyramid should contain four rows, with spaces before the stars to center the pattern. */
import java.util.*;

public class Q50_PyramidPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
