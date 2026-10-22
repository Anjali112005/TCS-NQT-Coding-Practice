
//Write a Java program that reads two integers from the user, divides the first number by the second number, and prints the quotient as a decimal value.
import java.util.*;

public class Q06_DivideTwoNumbers {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (b == 0) {
            System.out.println("Cannot divide by zero!");
        } else {
            double r = a / b;
            System.out.println("Result =" + r);
        }
        sc.close();
    }
}
