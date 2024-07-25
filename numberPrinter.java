public class numberPrinter { //This names the program numberPrinter
    public static void main(String[] args) {
        printNumber(15); //This will print numbers from 1-15
        printNumber(5); // This will print numbers from 1-5
        printNumber(7); //This will print number 1-7
    }

    public static void printNumber(int maxNumber) { //This takes a maximum number as input
        for (int i = 1; i <= maxNumber; i++) { //This loops to go through each number from 1 to the maximum
            System.out.printf("[%d] ", i); //We print each number without moving to next line
        }
        System.out.println(); //We move to the next line
    }
} //End of program