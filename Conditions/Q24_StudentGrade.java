/*Write a Java program to read a student's marks out of 100 and calculate their grade using the following rules.
Marks	    Grade
90–100	    A
80–89	    B
70–79	    C
60–69	    D
40–59	    E
Below 40	Fail */

import java.util.*;

public class Q24_StudentGrade {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 90 && n <= 100) {
            System.out.println("A");
        } else if (n >= 80 && n <= 89) {
            System.out.println("B");
        } else if (n >= 70 && n <= 79) {
            System.out.println("C");
        } else if (n >= 60 && n <= 69) {
            System.out.println("D");
        } else if (n >= 50 && n <= 59) {
            System.out.println("E");
        } else {
            System.out.println("Fail!");
        }
        sc.close();
    }
}
