import java.util.Scanner;

public class Power  {
    // A program to calculate 4-cubed using a
    // function called power
    public static void main(String[] args)  {
        double x = 4.0, y = 1.0;
        int n = 3;
        
        power(y, x, n);
        System.out.println("The answer is " + y);
    }
    
    // power() -  Calculates y = x to the nth power
    public static void power(double y, double x, int n)  {
        y = 1.0;
        while (n > 0) {
            y = y * x;
            n = n - 1;          
        }
        System.out.println("Our result is " + y);        
  }
}
