import java.lang.*;
import java.util.*;

class A4Q5 {
    public static void main(String args[]) {

        char ch;
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a character:");
        ch = obj.next().charAt(0);

        obj.close();

        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
            ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

            System.out.println("The entered character is a Vowel.");

        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println("The entered character is a Consonant.");

        } else {

            System.out.println("The entered input is not an alphabet.");
        }
    }
}