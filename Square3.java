import java.util.Scanner;

public class Square3  {
    // This illustrates how to use methods to 
    // find the square of a value
    
    // main() - A driver for the findSquare method
    public static void main(String[] args)  {
        Scanner keyb = new Scanner(System.in);
        double  value, square;
        
        System.out.println("Enter a value ?");
        value = keyb.nextDouble();
        
        square = findSquare(value);
        System.out.println("The square of " + value + " is " +  square);
    }
    
    // findSquare() - Calculates the square of 
    //                whatever value it is given.
    public static double findSquare(double x)  {
        double square = x*x;
        return square;
    }
}
