import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    /*
     * exception = an event that occurs during the execution of a program,
     * that disrupts the normal flow of instructions.
     * 
     * NOTES:
     * 1-) Code considered questionable can be place within a try-catch block.
     * 2-) ArithmeticException & InputMismatchException are just one of many
     * Exception types. They are used to identify the exception type. If you are not
     * sure,
     * what type is then you can use the global 'Exception' but is not recommended
     * because
     * is considered lazy.
     * 3-) 'finally' is good to use to close left open 'Scanners'.
     */

    Scanner scanner = new Scanner(System.in);

    try {
      System.out.println("Enter a whole number to divide");
      int x = scanner.nextInt();

      System.out.println("Enter a whole number to divide by");
      int y = scanner.nextInt();

      int z = x / y;
      System.out.println("Result: " + z);
    } catch (ArithmeticException e) {
      System.out.println("You can't divide by zero");
    } catch (InputMismatchException e) {
      System.out.println("You must enter a number");
    } catch (Exception e) {
      System.out.println("You must enter a number");
    } finally {
      scanner.close();
    }
  }
}
