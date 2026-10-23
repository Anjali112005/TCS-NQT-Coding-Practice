
/*Write a Java program to read a person's age and check whether they are eligible to vote. */
import java.util.*;

public class Q23_VotingEligibility {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
        sc.close();
    }
}
