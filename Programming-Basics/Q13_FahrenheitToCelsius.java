
/* Formula : C = ((F-32)*5/9) */
import java.util.*;

public class Q13_FahrenheitToCelsius {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println("Celsius : " + c);
        sc.close();
    }
}
