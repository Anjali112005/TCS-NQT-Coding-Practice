
/*Write a Java program that reads an integer N and prints an inverted right-angled triangle using stars (*), with N rows. */
import java.util.*;

public class Q48_InvertedTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
