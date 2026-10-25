
/*Write a Java program that reads an integer N and prints a square pattern containing N rows and N columns of stars (*).

For example, if N = 4, print a square with 4 rows and 4 stars in each row. */
import java.util.*;

public class Q46_SquareStarPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) { // the outer loop controls rows
            for (int j = 1; j <= n; j++) { // the inner loop controls stars in each row
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
 * Remember:
 * - Outer loop = rows.
 * - Inner loop = columns.
 */
