/*Write a Java program to create a simple calculator that reads two numbers and an operator from the user.

The calculator should perform these operations:
- + — Addition
- - — Subtraction
- * — Multiplication
- / — Division
- % — Remainder */

import java.util.*;

public class Q27_SimpleCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        switch (operator) {
            case '+':
                System.out.println("Result : " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;

            case '*':
                System.out.println("Result: " + (a * b));
                break;

            case '/':
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            case '%':
                if (b != 0) {
                    System.out.println("Result: " + (a % b));
                } else {
                    System.out.println("Cannot find remainder with zero");
                }
                break;

            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }
}
