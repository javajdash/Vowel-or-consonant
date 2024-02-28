// *4.13 (Vowel or consonant?) Write a program that prompts the user to enter a letter and check whether the letter is a vowel or consonant.
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a letter and assigns letter to string variable
    System.out.print("Enter a letter: ");
    String letter = input.next();

    // Determine whether the letter is a vowel, consonant, or an invalid input
    String message = (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")) ? letter + " is a vowel" : ((letter.equalsIgnoreCase("b") || letter.equalsIgnoreCase("c") || letter.equalsIgnoreCase("d") || letter.equalsIgnoreCase("f") || letter.equalsIgnoreCase("g") || letter.equalsIgnoreCase("h") || letter.equalsIgnoreCase("j") || letter.equalsIgnoreCase("k") || letter.equalsIgnoreCase("l") || letter.equalsIgnoreCase("m") || letter.equalsIgnoreCase("n") || letter.equalsIgnoreCase("p") || letter.equalsIgnoreCase("q") || letter.equalsIgnoreCase("r") || letter.equalsIgnoreCase("s") || letter.equalsIgnoreCase("t") || letter.equalsIgnoreCase("v") || letter.equalsIgnoreCase("w") || letter.equalsIgnoreCase("x") || letter.equalsIgnoreCase("y") || letter.equalsIgnoreCase("z")) ? letter + " is a consonant" : letter + " is an invalid input");
    System.out.println(message);
  }
}
  

