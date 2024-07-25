import java.util.Scanner;
public class Squares {
  // main() - A driver for the print_square
  //          function
  public static void main(String[] args)  {
    Scanner keyb = new Scanner(System.in);
    double  value;
    // Get a value and print its square
    System.out.println("Enter a value ?");
    value = keyb.nextDouble();
    printSquare(value);
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
