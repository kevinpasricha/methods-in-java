import java.util.Scanner;

public class Speed { //We are naming the program Speed
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in); //Needed for inputs
        double miles, hours, speed; //We store three variables

        printInstructions();

        System.out.println("How many miles did you drive?"); //Print
        miles = keyb.nextDouble(); //We put the number into the miles box.
        System.out.println("How many hours did you drive?"); //Print
        hours = keyb.nextDouble(); //We put the number into the hours box.

        speed = miles/hours; //Calculate the speed
        System.out.println("Your speed is " + speed + " miles per hour"); //We print the speed
        if (speed>55) {
            printWarning(); //If speed is over 55, we warn you by printing a message.
        }
    }

    public static void printInstructions() {
        System.out.println("This program determines the driver's speed from the miles");
        System.out.println("traveled and the hours spent driving. If driver exceeds");
        System.out.println("55 mph, then it will print a warning message.");
        //We print all of these lines at the beginning of the program.
    }

    public static void printWarning() {
        System.out.println("*** SLOW DOWN ***");
        System.out.println("You are driving too fast!");
        //We print these lines if the driver is driving over 55 mph.
    }
}
//End of program

    