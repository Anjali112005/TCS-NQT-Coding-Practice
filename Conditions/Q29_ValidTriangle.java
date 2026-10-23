/*A triangle is valid if the sum of any two sides is greater than the third side.

The three conditions are:
- a + b > c
- a + c > b
- b + c > a
All three sides must also be positive.

Examples:
- 3, 4, 5 → Valid triangle
- 1, 2, 3 → Not a valid triangle
- 5, 5, 8 → Valid triangle */

import java.util.*;

public class Q29_ValidTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0
                && a + b > c
                && a + c > b
                && b + c > a) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Not a valid triangle");
        }
        sc.close();
    }
}
