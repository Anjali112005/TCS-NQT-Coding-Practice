
/*Write a Java program that reads two integers, N and K, and counts how many numbers from 1 to N are divisible by K. */
import java.util.*;

public class Q43_CountDivisibleByK {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                count++;
            }
        }
        System.out.println("Count : " + count);
        sc.close();
    }
}
