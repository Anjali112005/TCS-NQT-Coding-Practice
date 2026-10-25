
/*Write a Java program to read an integer N and calculate the sum of the first N natural numbers, from 1 to N. */
import java.util.*;

public class Q35_SumOfNaturalNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum : " + sum);
        sc.close();
    }
}
