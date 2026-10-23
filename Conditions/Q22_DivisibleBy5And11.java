
/*Write a Java program to read an integer from the user and check whether it is divisible by both 5 and 11.
A number is divisible by another number when the remainder is zero. */
import java.util.*;

public class Q22_DivisibleBy5And11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 5 == 0 && n % 11 == 0) {
            System.out.println("Divisible by both 5 and 11");
        } else {
            System.out.println("Not divisible by both 5 and 11");
        }
        sc.close();
    }
}
