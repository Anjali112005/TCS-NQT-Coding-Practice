
/*Write a Java program to calculate the sum of cubes of all numbers from 1 to N. */
import java.util.*;

public class Q45_SumOfCubes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (long) i * i * i;
        }
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
