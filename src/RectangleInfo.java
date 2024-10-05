import java.util.Scanner;
import java.lang.Math;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double rectHeight = 0;
        double rectWidth = 0;
        double rectPerimeter;
        double rectArea;
        double rectDiag;
        boolean firstDone = false;
        boolean secondDone = false;
        String trash;
                // First Do While Loop starts here.
            do {
                System.out.println("Enter the height of a rectangle: ");
                if (in.hasNextDouble())
                {
                    rectWidth = in.nextDouble();
                    in.nextLine();
                    firstDone = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("The input you provided, " + trash + ", is invalid. Please enter a valid number.");
                }
                } while (!firstDone);
                // Second Do While Loop starts here
            do {
                System.out.println("Enter the width of a rectangle: ");
                if (in.hasNextDouble()) {
                    rectHeight = in.nextDouble();
                    in.nextLine();
                    secondDone = true;
                } else {
                    trash = in.nextLine();
                    System.out.println("The input you provided, " + trash + ", is invalid. Please enter a valid number.");
                }
                } while (!secondDone);
            rectPerimeter = (rectHeight * 2) + (rectWidth * 2);
            rectArea = rectHeight * rectWidth;
            rectDiag = Math.sqrt(Math.pow(rectHeight, 2) + Math.pow(rectWidth, 2));
            System.out.println("The perimeter of your rectangle is " + rectPerimeter + ", while the area of your rectangle is " + rectArea + ".");
            System.out.println("The diagonal of your rectangle is " + rectDiag + ".");
            }
    }

