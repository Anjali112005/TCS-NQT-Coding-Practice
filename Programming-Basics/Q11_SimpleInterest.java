
/*Write a Java program that accepts the principal amount, annual rate of interest, and time in years from the user, then calculates and prints the simple interest.
Formula: SI = [(P X R X T )/100]*/
import java.util.*;

public class Q11_SimpleInterest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
        double R = sc.nextDouble();
        double T = sc.nextDouble();

        double SI = ((P * R * T) / 100);
        System.out.println("Simple Interest : " + SI);
        sc.close();
    }
}
