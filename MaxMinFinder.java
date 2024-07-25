import java.util.Scanner; //We are employing the Scanner to ask the computer questions

public class MaxMinFinder { //We are naming the program MaxMinFinder
    public static void main(String[] args) { //The main part where our program starts
        Scanner keyb = new Scanner(System.in); //This line gets our program ready to start using the Scanner

        //Accepts two inputs
        System.out.println("Enter the first number:");
        double num1 = keyb.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = keyb.nextDouble();

        //Call the findMax and findMin functions in the program
        double max = findMax(num1, num2);
        double min = findMin(num1, num2);

        //Print the results
        System.out.println("Larger number is: " + max);
        System.out.println("Smaller number is: " + min);
    }

        //Find the larger of the two values
    public static double findMax(double x, double y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
        //Find the smaller of the two values
    public static double findMin(double x, double y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }
} //End of program
