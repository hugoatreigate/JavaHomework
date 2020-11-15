package battleshipstypegame;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BattleShipsTypeGame {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int guess = 0;
        int totalNumberOfGuesses = 0;
        boolean gameInProgress = true;
        char trueLetterCoords = 'F';
        char trueNumberCoords = '5';
        char[][] easyGrid = {
            {'A', 'B', 'C', 'D', 'E', 'F'},
            {'1', '2', '3', '4', '5'}
        };
        char[][] mediumGrid = {
            {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'},
            {'1', '2', '3', '4', '5', '6', '7', '8'}
        };
        char[][] hardGrid = {
            {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N'},
            {'1', '2', '3', '4', '5', '6', '7'}
        };

        System.out.println("Choose a difficulty (Easy, Medium, Hard)");
        String difficulty = input.next();
        System.out.println("Ok then, the rules are simple.");
        System.out.println("");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("You have to find out how large a grid that i've created is");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("You may guess a single grid co-ordinate at a time and I shall tell you if it's inside the grid or not (For example, You may guess 'B6' and I will reply with 'Inside the grid')");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("When you have run out of guesses, I shall ask you to give me your final guess on how big the grid is (You may input 'J9')");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("If it's correct, you win, if it's wrong, you dont.");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Good Luck, this won't be easy");
        TimeUnit.SECONDS.sleep(2);

        if (difficulty.equalsIgnoreCase("Easy")) {
            System.out.println("Well, considering you selected easy, it will be, you scoundrel.");
            TimeUnit.SECONDS.sleep(2);

            for (int i = 0; i <= 6; i++) {
                System.out.println("Guess a co-ordinate (Enter capital letter then press enter and enter number from 1-9 (we're working on very limited resources here))");
                char Lettercoords = input.next().charAt(0);
                char Numbercoords = input.next().charAt(0);

                if (Lettercoords <= trueLetterCoords) {
                    if (Numbercoords <= trueNumberCoords) {
                        System.out.println("That is in the grid");
                    } else {
                        System.out.println("That is not in the grid");
                    }
                } else {
                    System.out.println("That is not in the grid");
                }

            }
        }
        if (difficulty.equalsIgnoreCase("Medium")) {
            trueLetterCoords = 'H';
            trueNumberCoords = '8';
            for (int i = 0; i <= 5; i++) {
                System.out.println("Guess a co-ordinate (Enter capital letter then press enter and enter number from 1-9 (we're working on very limited resources here))");
                char Lettercoords = input.next().charAt(0);
                char Numbercoords = input.next().charAt(0);

                if (Lettercoords <= trueLetterCoords) {
                    if (Numbercoords <= trueNumberCoords) {
                        System.out.println("That is in the grid");
                    } else {
                        System.out.println("That is not in the grid");
                    }
                } else {
                    System.out.println("That is not in the grid");
                }

            }
        }
        if (difficulty.equalsIgnoreCase("Hard")) {
            trueLetterCoords = 'N';
            trueNumberCoords = '7';
            for (int i = 0; i <= 3; i++) {
                System.out.println("Guess a co-ordinate (Enter capital letter then press enter and enter number from 1-9 (we're working on very limited resources here))");
                char Lettercoords = input.next().charAt(0);
                char Numbercoords = input.next().charAt(0);

                if (Lettercoords <= trueLetterCoords) {
                    if (Numbercoords <= trueNumberCoords) {
                        System.out.println("That is in the grid");
                    } else {
                        System.out.println("That is not in the grid");
                    }
                } else {
                    System.out.println("That is not in the grid");
                }

            }
        }

        System.out.println("You've ran out of guesses. What is your final guess?");
        char finalLet = input.next().charAt(0);
        char finalNum = input.next().charAt(0);

        if (finalNum == trueNumberCoords && finalLet == trueLetterCoords) {
            System.out.println("Correct! You win.");
        } else {
            System.out.println("You lost, How unfortunate.");
        }

    }

}
