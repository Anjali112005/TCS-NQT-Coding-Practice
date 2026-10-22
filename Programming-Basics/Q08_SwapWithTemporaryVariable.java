
//Write a Java program that reads two integers and swaps their values using a temporary variable. Print the values before and after swapping.
import java.util.*;

public class Q08_SwapWithTemporaryVariable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swapping a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping a = " + a + ", b = " + b);
        sc.close();
    }
}
