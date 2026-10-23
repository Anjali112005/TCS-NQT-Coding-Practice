
/*Write a Java program to read a number from the user and check whether it is positive, negative, or zero. */
import java.util.*;

public class Q17_PositiveNegativeZero {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("Positive Number");
        } else if (n < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }
        sc.close();
    }
}
