import java.util.*;

public class Q04_SubtractTwoNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a - b);
        System.out.println("Subtract = " + c);
        sc.close();
    }
}
