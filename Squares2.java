import java.util.Scanner;

public class Squares2 {
  // main() - A driver for the print_square
  //          function
  public static void main(String[] args)  {
    double value1 = 45, value2 = 25;
    
    printSquare(value1);
    printSquare(value2);
  }
 
  // printSquare() - Prints the square of whatever
  //                 value that it is given.
  public static void printSquare(double x)  {
    double  square;

    square = x*x;
    System.out.println("The square of " + x 
                         + " is " + square);
  }
}
