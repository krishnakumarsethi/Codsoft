package task1;
// import java.util.Scanner;
// import java.util.Random;

// public class task1 {
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//             Random random = new Random();
//             int minRange = 1;
//             int maxRange = 100;
//             int maxAttempts = 5;
//             int score = 0;

//             boolean playAgain = true;

//             while (playAgain) {
//                 int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
//                 System.out.println("Welcome to the Number Guessing Game!");
//                 System.out.println(
//                         "The computer guessed the number between" + minRange + "and " + maxRange + " can you guess!");

//                 // int guess = 0; wrong
//                 int attempts = 0;
//                 // boolean guessedNumber = false; wrong
//                 boolean guessedCorrectly = false;

//                 while (attempts < maxAttempts) {
//                     System.out.print("Enter your guess: ");
//                     int userGuess = scanner.nextInt();
//                     attempts++;
//                     if (userGuess < targetNumber) {
//                         System.out.println("Too Low! Try Again");
//                     } else if (userGuess > targetNumber) {
//                         System.out.println("Too High! Try Again");
//                     } else {
//                         System.out.println(
//                                 "Congrats! You guessed the number " + targetNumber + "in " + attempts + " attempts");
//                         score += maxAttempts - attempts + 1;
//                         guessedCorrectly = true;
//                         break;
//                     }
//                 }
//                 if (!guessedCorrectly) {
//                     System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
//                     System.out.println("Your current score " + score + " point. Do you want play again?(yes/no): ");
//                     String playAgainResponse = scanner.next().toLowerCase();
//                     playAgain = playAgainResponse.equals("yes");
//                 }
//                 System.out.println("Thanks for playing the Number Guessing Game!");
//             }
//         }
//     }
// }

// import java.util.Random;
// import java.util.Scanner;
// public class task1{
//     public static void main(String[]args){
//         try (Scanner scanner = new Scanner(System.in)) {
//             Random random = new Random();
//             int minRange = 1;
//             int maxRange = 100;
//             int maxAttempts = 5;
//             int score = 0;

//             boolean playAgain = true;
//             while(playAgain){
//                 int targetNumber = random.nextInt(maxRange-minRange+1)+minRange;
//                 System.out.println("Welcome to the Number Guessing Game!");
//                 System.out.println("The computer choose a number between " + minRange + " and " + maxRange + " can you guess it?");

//                 int attempts = 0;
//                 boolean guessedCorrectly = false;
//                 while(attempts<maxAttempts){
//                     System.out.println("Can you guess!");
//                     int userGuess = scanner.nextInt();
//                     attempts++;
//                     if(userGuess<targetNumber){
//                         System.out.println("Too Low! Try Again");
//                     }else if(userGuess>targetNumber){
//                         System.out.println("Too High! Try Again");
//                     }else{
//                         System.out.println("Congrats! You guessed the number " + targetNumber + "correctly. in " + attempts + " attempts.");
//                         score+=maxAttempts-attempts+1;
//                         guessedCorrectly = true;
//                         break;
//                     }
//                 }
//                 if(!guessedCorrectly){
//                     System.out.println("Soory! You've run out of attempts the correct number is " + targetNumber);
//                     System.out.println("Your current score is " + score + " points. Do you want to play again?:(yes/no)");
//                     String playAgainResponse = scanner.next().toLowerCase();
//                     playAgain = playAgainResponse.equals("yes");
//                 }
//                 System.out.println("Thanks for playing the Number Guessing Game!");
//             }
//         }
//     }
// }

// import java.util.Scanner;
// import java.util.Random;
// public class task1{
//     public static void main(String[]args){
//         try (Scanner scanner = new Scanner(System.in)) {
//             Random random = new Random();
//             int minRange = 1;
//             int maxRange = 100;
//             int maxAttempts = 10;
//             int score = 0;
//             boolean playAgain = true;
//             while(playAgain){
//                 int targetNumber = random.nextInt(maxRange-minRange+1)+minRange;
//                 System.out.println("Welcome to NGG");
//                 System.out.println("The computer choose a number between " + minRange + " and " + maxRange + " Can you guess it?");

//                 int attempts = 0;
//                 boolean guessedCorrectly = false;
//                 while(attempts<maxAttempts){
//                     System.out.println("Can you guess!");
//                     int userGuess = scanner.nextInt();
//                     attempts++;
//                     if(userGuess<targetNumber){
//                         System.out.println("Too Low! Try again");
//                     }else if(userGuess>targetNumber){
//                         System.out.println("Too High! Try again");
//                     }else{
//                         System.out.println("Congrats! You gussed the number " + targetNumber + " Correctly. in " + attempts + " attempts.");
//                         score += maxAttempts - attempts + 1;
//                         guessedCorrectly = true;
//                         break;
//                     }
//                 }
//                 if(!guessedCorrectly){
//                     System.out.println("sorry you've run out of attempts the correct number is " + targetNumber);
//                     System.out.println("Your current score is " + score + " points. Do you want to play again?:(yes/no)");
//                     String playAgainResponse = scanner.next().toLowerCase();
//                     playAgain = playAgainResponse.equals("yes");
//                 }
//                 System.out.println("Thank u for playing the ngg");
//             }
//         }
//     }
// }

// import java.util.Scanner;
// import java.util.Random;

// public class task1 {
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
//             Random random = new Random();
//             int minRange = 1;
//             int maxRange = 100;
//             int maxAttempts = 5;
//             int score = 0;

//             boolean playAgain = true;
//             while (playAgain) {
//                 int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
//                 System.out.println("Welcome to NGG!");
//                 System.out.println("the comp choose a num between " + minRange + " to " + maxRange + " Guess it!");
//                 int attempts = 0;
//                 boolean guessedCorrectly = false;
//                 while (attempts < maxAttempts) {
//                     System.out.println("Enter your guess: ");
//                     int userGuess = scanner.nextInt();
//                     attempts++;
//                     if (userGuess < targetNumber) {
//                         System.out.println("Too Low! Try again: ");
//                     } else if (userGuess > targetNumber) {
//                         System.out.println("Too High! Try again: ");
//                     } else {
//                         System.out.println("Congrats! You guessed it in " + attempts + "attempts.");
//                         score += maxAttempts - attempts + 1;
//                         guessedCorrectly = true;
//                         break;
//                     }
//                 }
//                 if (!guessedCorrectly) {
//                     System.out.println("Sorry! You've run out of attempts the correct number is " + targetNumber);
//                     System.out.println("Your Current Score is " + score + " points. Do you want to play again?:(yes/no)");
//                     String playAgainResponse = scanner.next().toLowerCase();
//                     playAgain = playAgainResponse.equals("yes");
//                 }
//                 System.out.println("Thank you for playing the Game.");
//             }
//         }
//     }
// }

import java.util.Random;
import java.util.Scanner;

public class task1{
    public static void main(String[]args){
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            int minRange = 1;
            int maxRange = 100;
            int maxAttempts = 5;
            int score = 0;

            boolean playAgain = true;
            while(playAgain){
                int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
                System.out.println("Welcome to NGG!");
                System.out.println("The comp choose a num between" + minRange + " to " + maxRange + " Guess it.");
                int attempts = 0;
                boolean guessedCorrectly = false;
                while(attempts<maxAttempts){
                    System.out.println("Enter your guess: ");
                    int userGuess = scanner.nextInt();
                    attempts++;
                    if(userGuess<targetNumber){
                        System.out.println("Too Low! Try again.");
                    }else if(userGuess>targetNumber){
                        System.out.println("Too high! Try again.");
                    }else{
                        System.out.println("Congrats you guessed it in " + attempts + " attempts.");
                        score += maxAttempts - attempts + 1;
                        guessedCorrectly = true;
                        break;
                    }
                }
                if(!guessedCorrectly){
                    System.out.println("Sorry! you have run out of attempts the correct number is " + targetNumber);
                    System.out.println("Your current score is " + score + " points. Do you want to play again?:(yes/no)");
                    String playAgainResponse = scanner.next().toLowerCase();
                    playAgain = playAgainResponse.equals("yes");
                }
                System.out.println("Thank u for playing the game.");

            }
        }
    }
}