import java.util.Scanner;
/*  
 * A Payroll program for an hourly worker that
 * includes an income tax deduction
 */
public class Payroll  {
    public static void main(String[] args) {
        double hours, rate;
        double grossPay, netPay, tax;

        // Get the input
        hours = getHours();
        rate = getRate();
        // Calculate gross pay, income tax
        // and net pay
        grossPay = findGross(hours, rate);
        tax = findTax(grossPay);
        netPay = grossPay - tax;
        // Print a pay stub
        printPayStub(hours, rate, grossPay,
                          tax, netPay);
    }

    // getHours() - prompt the user and input
    //              the hours worked
    public static double getHours() {
        Scanner keyb = new Scanner(System.in);
        System.out.println
          ("How many hours did the employee work?");
        double hours = keyb.nextDouble();
        return hours;
    }

    // getRate() - prompt the user and input
    //             the hourly rate
    public static double getRate() {
        Scanner keyb = new Scanner(System.in);
        System.out.println
              ("What is the hourly rate of pay?");
        double rate = keyb.nextDouble();
        return rate;
    }

    // findGross() - calculate the gross pay,
    //               including overtime if any
    public static double findGross
                (double hours, double rate) {
        double pay;
        if (hours <= 40)
           pay = rate*hours;
        else
           pay = 1.5*rate*(hours - 40.0) + 40*rate;        
        return pay;
    }

    //  findTax() - Calculate the income tax
    public static double findTax(double grossPay) {
        double taxRate, tax;
        
        if (grossPay < 500)
           taxRate = 0.0;
        else if (grossPay < 750)
           taxRate = 0.05;
        else if (grossPay < 1050)
           taxRate = 0.08;
        else if (grossPay < 1250)   
           taxRate = 0.10;
        else
           taxRate = 0.15;
  
        tax = taxRate*grossPay;
        return tax;
    }

    // printPayStub() - print the pay stub 
    //                  information    
    public static void printPayStub(double hours,
                      double rate, double grossPay,
                      double tax, double netPay) {
       System.out.printf
            ("Hours worked: %4.1f\tHourly rate: $%5.2f\n",
                           hours, rate);
       System.out.printf
             ("Gross pay: $%6.2f\tTax: $%5.2f\tNet pay: $%6.2f\n",
                           grossPay, tax, netPay);
    }
}
