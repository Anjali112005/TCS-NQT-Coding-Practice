
/*Write a Java program that accepts a character from the user and prints its ASCII value.
Concept: Characters and type casting in Java. */
import java.util.*;

public class Q14_ASCIIValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;
        System.out.println(" ASCII value : " + ascii);
        sc.close();

    }
}
