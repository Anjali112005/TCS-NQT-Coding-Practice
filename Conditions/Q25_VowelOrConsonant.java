
/*Write a Java program to read a character from the user and check whether it is a vowel or consonant.
The vowels are a, e, i, o, u and their uppercase versions A, E, I, O, U.
If the entered character is not an alphabet, print Not an alphabet. */
import java.util.*;

public class Q25_VowelOrConsonant {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (!Character.isLetter(ch)) {
            System.out.println("Not an alphabet");
        } else if (ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
        sc.close();
    }
}
