import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double userInputC = 0;
        double userInputF = 0;
        boolean done = false;
        String trash;

            do {
                System.out.println("Enter a temperature in degrees Celsius: ");
                if (in.hasNextDouble())
                {
                    userInputC = in.nextDouble();
                    userInputF = userInputC * 1.8 + 32;
                    done = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("The input you provided was " + trash + ", which is invalid. Please enter a number.");
                }
            } while (!done);
            System.out.println("The value you entered was " + userInputC + ". In degrees Fahrenheit, your value is now " + userInputF + ".");
        }
    }
