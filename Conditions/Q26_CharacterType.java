/*Write a Java program to read a character from the user and determine whether it is an alphabet, digit, or special character.*/

import java.util.*;

public class Q26_CharacterType {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (Character.isLetter(ch)) {
            System.out.println("Alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }
        sc.close();
    }
}
