package questions;

import java.util.*;

public class RPS {

    static int wins = 0;
    static int loss = 0;
    static int tie = 0;

    public static void main(String[] args) {
        int round = 0;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Welcome to Rock, Paper, Scissors");
        while (round < 5) {
            System.out.println("Choose rock, paper, scissors ");
            String playerInput = sc.nextLine();
            int compInt = rand.nextInt(3);
            String compInput = (compInt == 0) ? "rock" : (compInt == 1) ? "paper" : "scissors";
            playRound(compInput, playerInput.toLowerCase());
            round++;
        }
        System.out.println("Game Summary");
        System.out.println("Wins : " + wins + "\nLoss: " + loss + "\nDraw : " + tie);
        float winRate = (float) (wins * 100f / 5);
        System.out.println("Win rate : " + winRate);

    }

    static void playRound(String compInput, String playerInput) {
        if (compInput.equals("rock")) {
            switch (playerInput) {
                case "rock" -> {
                    System.out.println("It's a tie.");
                    tie++;
                }
                case "paper" -> {
                    System.out.println("You won. Computer chose rock.");
                    wins++;
                }
                case "scissors" -> {
                    System.out.println("You lost. Computer chose rock.");
                    loss++;
                }
                default ->
                    System.out.println("Please choose a correct input.");
            }
        } else if (compInput.equals("paper")) {
            switch (playerInput) {
                case "rock" -> {
                    System.out.println("You lost. Computer chose paper.");
                    loss++;
                }
                case "paper" -> {
                    System.out.println("It's a tie.");
                    tie++;
                }
                case "scissors" -> {
                    System.out.println("You won. Computer chose paper.");
                    wins++;
                }
                default -> {
                    System.out.println("Please choose a correct input.");
                }
            }
        } else {
            switch (playerInput) {
                case "rock" -> {
                    System.out.println("You won. Computer chose scissors.");
                    wins++;
                }
                case "paper" -> {
                    System.out.println("You lost. Computer chose scissors.");
                    loss++;
                }
                case "scissors" -> {
                    System.out.println("It's a tie.");
                    tie++;
                }
                default -> {
                    System.out.println("Please choose a correct input.");
                }
            }
        }
    }

}
