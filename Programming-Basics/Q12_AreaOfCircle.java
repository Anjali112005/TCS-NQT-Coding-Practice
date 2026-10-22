/*Write a Java program that accepts the radius of a circle from the user and calculates and prints its area.
Formula : (A = pi r^2) 
Math.PI provides the value of (pi), approximately 3.14159 */

import java.util.*;

public class Q12_AreaOfCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double a = Math.PI * r * r;
        System.out.println("Area : " + a);
        System.out.printf("Area : %.2f%n", a);
        sc.close();
    }
}
