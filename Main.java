import java.util.*;
import java.text.NumberFormat;
import java.lang.Math;


public class Main {

  public static String annualCalc(int loan, float rate, int monthlyPayments) {
    double mortgage = (loan * rate) / (1 - Math.pow(1 + rate, -monthlyPayments));
    String result = NumberFormat.getCurrencyInstance().format(mortgage);
    return result;
  }

  public static void main(String[] args) {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;


    Scanner scanner = new Scanner(System.in);
    System.out.print("Loan amount: ");
    int loanAmount = scanner.nextInt();

    System.out.print("Annual interest rate: ");
    float annualRate = scanner.nextFloat();
    float monthlyRate = annualRate / PERCENT / MONTHS_IN_YEAR;
    System.out.print("Period (Years) (0 - 30): ");
    int years = scanner.nextByte();
    int numOfPayments = years * MONTHS_IN_YEAR;

    System.out.println("Monthly mortgage: " + annualCalc(loanAmount, monthlyRate, numOfPayments));

   }
}