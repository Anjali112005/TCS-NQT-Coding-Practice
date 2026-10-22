
/*Write a Java program that reads an integer from the user and calculates its square and cube.
Square: The number multiplied by itself.
Cube: The number multiplied by itself three times. */
import java.util.*;

public class Q10_SquareAndCube {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = n * n;
        int c = n * n * n;
        System.out.println("Square = " + s);
        System.out.println("Cube = " + c);
        sc.close();
    }
}
