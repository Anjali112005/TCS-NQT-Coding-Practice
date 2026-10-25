
/*Write a Java program to read an integer N and print all numbers from N down to 1 in descending order. */
import java.util.*;

public class Q32_PrintNumbersNTo1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
