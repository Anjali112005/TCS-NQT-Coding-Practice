
/*Write a Java program that accepts a temperature in Celsius from the user, converts it to Fahrenheit, and prints the result rounded to two decimal places.
Formula: F=(9/5 X C + 32) 
Where:
- C = Temperature in Celsius
- F = Temperature in Fahrenheit*/
import java.util.*;

public class Q13_CelsiusToFahrenheit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f = (c * 9.0 / 5.0) + 32;
        System.out.println("Fahrenheit : " + f);
        sc.close();

    }
}
