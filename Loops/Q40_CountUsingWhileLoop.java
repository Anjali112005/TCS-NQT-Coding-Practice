
/*Write a Java program that reads an integer N and prints all numbers from 1 to N using a while loop. */
import java.util.*;

public class Q40_CountUsingWhileLoop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        sc.close();
    }
}
