import java.util.Scanner;

public class Power2  {
  // A program to calculate 4-cubed using a
  // function called power
  public static void main(String[] args)  {
    double x = 4.0, y;
    int n = 3;   
    y = power(x, n);
    System.out.println("The answer is " + y);
  }

  // power() -  Calculates y = x to the nth
  //            power
  public static double power(double x, int n) {
    double prod;
    prod = 1.0;
    while (n > 0) {
      prod = prod * x;
      n = n - 1;          
    }
    System.out.println("Our result is " + prod);
    return prod;
  }
}
