
//Write a Java program that reads two integers from the user, calculates their product, and prints the result.
import java.util.*;

public class Q05_MultiplyTwoNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a * b);
        System.out.println("Product = " + c);
        sc.close();
    }
}
