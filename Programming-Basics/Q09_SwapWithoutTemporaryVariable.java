
//Write a Java program that reads two integers and swaps their values without using a third or temporary variable. Print the values before and after swapping.
//Concept: Arithmetic operators (+ and -).
import java.util.*;

public class Q09_SwapWithoutTemporaryVariable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swapping a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping a = " + a + ", b = " + b);
        sc.close();
    }
}
