import java.util.Scanner;   // Needed for the Scanner class.

/** This class creates a simple program to test
  * input into an int variable.
  * Also added an extra section to read String input
*/

public class InputTest
{
  /** The main method creates the int number variable
    * as well as the keyboard variable which references
    * the Scanner object.
    * It also prompts for an integer and String input.
  */
    
  public static void main(String[] args)
  {
    int number;
    String lineEntered;
    char charEntered;
    Scanner keyboard = new Scanner(System.in);
    
    // Requests an int number to be entered and displays prompt
    System.out.println("Enter an integer number: ");
    number = keyboard.nextInt();
    
    // Display int that was entered
    System.out.println("The number entered was: \"" + number + "\".");
    
    // Consume the remaining newline
    keyboard.nextLine();
    
    // The Scanner class does not have a method for reading a single character.
    // Prompt for a Yes or No answer and attempt to read
    // a single character entered.
    System.out.println("Would you like to quit this program now? (Y = yes  N = no)");
    lineEntered = keyboard.nextLine();  // Save the entered text to String lineEntered
    charEntered = lineEntered.charAt(0);  // Extract the first character to char charEntered
    
    // Display the first charactered entered
    System.out.println("The first character entered was: \"" + charEntered + "\".");
    
  }
}
