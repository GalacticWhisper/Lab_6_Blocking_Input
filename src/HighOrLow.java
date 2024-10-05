import java.util.Scanner;
import java.util.Random;
public class HighOrLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int userGuess = 0;
        int val = generator.nextInt(10) + 1;
        boolean done = false;
        String trash;
        // Do While Loop begins here
        do {
            System.out.println("Welcome to the 1 - 10 Generator! I've generated a random number between 1 and 10. Enter your guess: ");
            if (in.hasNextInt())
            {
                userGuess = in.nextInt();
                in.nextLine();
                if (userGuess >= 1 && userGuess <= 10)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You guessed " + userGuess + ", which is outside the designated range. Please guess again.");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You guessed " + trash + ", which is not a valid input. Please guess a number.");
            }

            } while (!done);
        if (userGuess > val)
        {
            System.out.println("My random number was " + val + ". Your guess was too high.");
        }
        else if (userGuess < val)
        {
            System.out.println("My random number was " + val + ". Your guess was too low.");
        }
        else
        {
            System.out.println("My random number was " + val + ". Congratulations! You guessed correctly!");
        }
    }
}
