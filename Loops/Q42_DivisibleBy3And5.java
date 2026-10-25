
/*Write a Java program that reads an integer N and prints all numbers from 1 to N that are divisible by both 3 and 5. */
import java.util.*;

public class Q42_DivisibleBy3And5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
