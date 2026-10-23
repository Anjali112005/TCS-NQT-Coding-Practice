
/*Write a Java program to read two numbers from the user and find which number is larger. */
import java.util.*;

public class Q18_LargerOfTwoNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("a is greater number : " + a);
        } else if (b > a) {
            System.out.println("b is greater number : " + b);
        } else {
            System.out.println("Both are equal");
        }
        sc.close();
    }
}
