package questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Unique {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Map<Character, Integer> frequency = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }
        char firstNonRepeating = '\0';
        for (char ch : input.toCharArray()) {
            if (frequency.get(ch) == 1) {
                firstNonRepeating = ch;
                break;
            }
        }

        if (firstNonRepeating == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + firstNonRepeating);
        }
    }
}
