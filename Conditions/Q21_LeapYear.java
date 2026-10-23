
/*Write a Java program to read a year from the user and check whether it is a leap year. */
import java.util.*;

public class Q21_LeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("Not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not A Leap Year");
        }
        sc.close();
    }
}
