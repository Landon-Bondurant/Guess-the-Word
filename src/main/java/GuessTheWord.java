/**
 * This program is a simple password guessing game. It's missing
 * features and is buggy. The PRIMM activity will help you fix it.
 * It will also help you learn things about Strings.
 * @author
 * @version 1.0
 * @since 2024-11-
 */

import java.util.Scanner;

class GuessTheWord {
  public static void main(String[] args) {
    // Sets up the scanner
    Scanner console = new Scanner(System.in);

    // sets correct word
    String correct = getRandomWord();
    System.out.println(correct);
    String userGuess;
    
    // Takes the user's guess
    System.out.print("Guess the word I'm thinking of: ");
    userGuess = console.next();
    console.nextLine();  // get rid of new line

    // Prompts repetedly until guess is correct
    while (!userGuess.equals(correct)) {

        // reprompt and retry
      System.out.print("Sorry. That's not right. Guess again: ");
      userGuess = console.next();
      console.nextLine();
    }

    console.close();

    System.out.println("You guessed the answer correctly!");
    
  }

  /**
   * Retrieves a random word using the structures we know so far.
   * There are many far more elegant ways to do this, and you will
   * get to practice those.
   * @return String for the random word
   */
  public static String getRandomWord() {    
    String [] words = new String[] {
        "the", "quick", "red", "fox", "jumped", "over", "lazy", "brown", "dog"
    };

    int random = (int) (Math.random() * words.length);

    return words[random];
  }
}