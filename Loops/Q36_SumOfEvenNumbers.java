
/*Write a Java program to read an integer N and calculate the sum of all even numbers from 1 to N, inclusive. */
import java.util.*;

public class Q36_SumOfEvenNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
