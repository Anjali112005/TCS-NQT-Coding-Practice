/*Write a Java program that accepts a total number of days from the user and converts them into years, weeks, and remaining days. Assume 1 year = 365 days and 1 week = 7 days.
 */

import java.util.*;

public class Q15_ConvertDays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // total days

        int y = t / 365; // years
        int rd = t % 365; // remaining days
        int w = rd / 7; // weeks
        int d = rd % 7; // days

        System.out.println("Years : " + y);
        System.out.println("Weeks : " + w);
        System.out.println("Days : " + d);

        sc.close();
    }
}
