
//Write a Java program that takes two numbers from the user and prints their sum.
import java.util.*;

public class Q03_AddTwoNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a + b);
        System.out.println("Sum=" + c);
        sc.close();
    }
}
