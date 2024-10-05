import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double fuelEfficiency = 0; //MPG
        double perGallonPrice = 0;
        double tankCapacity = 0;
        double hundredMileCost = 0;
        double fullTankDistance = 0;
        boolean firstDone = false;
        boolean secondDone = false;
        boolean finalDone = false;
        String trash;
                //First Do While Loop starts here.
            do {
                System.out.println("Enter your gas tank's capacity: ");
                if (in.hasNextDouble())
                {
                    tankCapacity = in.nextDouble();
                    in.nextLine();
                    firstDone = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("The input you provided was " + trash + ", which is invalid. Please enter a valid number.");
                }
            } while (!firstDone);
                //Second Do While Loop starts here.
            do {
                System.out.println("Enter your fuel efficiency in miles per gallon: ");
                if (in.hasNextDouble())
                {
                    fuelEfficiency = in.nextDouble();
                    in.nextLine();
                    secondDone = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("The input you provided was " + trash + ", which is invalid. Please enter a valid number.");
                }
            } while (!secondDone);
                //Final Do While Loop starts here.
            do {
                System.out.println("Enter the price of gas per gallon: ");
                if (in.hasNextDouble())
                {
                    perGallonPrice = in.nextDouble();
                    in.nextLine();
                    finalDone = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("The input you provided was " + trash + ", which is invalid. Please enter a valid number.");
                }
            } while (!finalDone);
        hundredMileCost = 100 / fuelEfficiency * perGallonPrice;
        fullTankDistance = tankCapacity * fuelEfficiency;
        System.out.println("It will cost " + hundredMileCost + " dollars for your vehicle to travel 100 miles. When your vehicle's tank is full, it can travel " + fullTankDistance + " miles.");
    }
}