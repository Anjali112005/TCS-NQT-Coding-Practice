
/*Write a Java program to read an integer N and print its multiplication table from 1 to 10. */
import java.util.*;

public class Q38_MultiplicationTable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            System.out.println(n + "X" + i + "=" + (n * i));
        }
        sc.close();
    }
}
