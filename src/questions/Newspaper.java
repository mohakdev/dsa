package questions;

import java.util.Scanner;

public class Newspaper {

    public static void main(String[] args) {
        System.out.println("Enter word : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        int maxIndex = 0;
        int minIndex = 0;
        int minLength = words[0].length();
        int maxLength = words[0].length();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                maxIndex = i;
            } else if (words[i].length() < minLength) {
                minLength = words[i].length();
                minIndex = i;
            }
        }
        System.out.println("Longest word " + words[maxIndex]);
        System.out.println("Shortest word " + words[minIndex]);
    }
}
