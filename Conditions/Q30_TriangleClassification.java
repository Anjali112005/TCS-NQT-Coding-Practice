/*Write a Java program to read three side lengths and classify the triangle as equilateral, isosceles, or scalene.
- Equilateral: All three sides are equal.
- Isosceles: Exactly two sides are equal.
- Scalene: All three sides are different.
First, check whether the three sides form a valid triangle. If they do not, print Not a valid triangle.

Examples:
- 5, 5, 5 → Equilateral triangle
- 5, 5, 8 → Isosceles triangle
- 3, 4, 5 → Scalene triangle */

import java.util.*;

public class Q30_TriangleClassification {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        if (a <= 0 || b <= 0 || c <= 0
                || a + b <= c
                || a + c <= b
                || b + c <= a) {
            System.out.println("Not a valid triangle");
        } else if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }
        sc.close();
    }
}
