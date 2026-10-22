
//Write a Java program that reads two integers and finds the quotient and remainder when the first number is divided by the second number.
import java.util.*;

public class Q07_QuotientRemainder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            int q = a / b;
            int r = a % b;
            System.out.println("Quotient = " + q);
            System.out.println("Remainder = " + r);
        }
        sc.close();
    }
}
