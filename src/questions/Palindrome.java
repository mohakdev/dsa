package questions;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean r1 = iteration(input.toCharArray());
        boolean r2 = recursion(input.toCharArray(), 0);
        boolean r3 = reversal(input.toCharArray());
        System.out.println("Iterative : " + r1 + "\nRecursive : " + r2 + "\nArray Reversal : " + r3);
    }

    static boolean iteration(char[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] != input[input.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    static boolean recursion(char[] input, int i) {
        if (i == input.length - 1) {
            return true;
        }
        //recursive case
        if (input[i] != input[input.length - 1 - i]) {
            return false;
        }
        return recursion(input, i + 1);
    }

    static boolean reversal(char[] input) {
        char[] rev = new char[input.length];
        for (int i = 0; i < input.length; i++) {
            rev[input.length - 1 - i] = input[i];
        }
        //Now comparing
        for (int i = 0; i < input.length; i++) {
            if (rev[i] != input[i]) {
                return false;
            }
        }
        return true;
    }
}
