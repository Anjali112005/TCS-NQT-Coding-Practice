
/*Write a Java program that reads an integer N and prints a right-angled number triangle with N rows.

For each row, print numbers starting from 1 up to the current row number. */
import java.util.*;

public class Q49_NumberTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
