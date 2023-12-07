package unchecked;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * ArithmeticException : <br>
 * &emsp;&emsp;
 * Thrown when an arithmetic operation results in an overflow, underflow, or division by zero.<br><br>
 * InputMismatchException : <br>
 * &emsp;&emsp;
 * This unchecked exception is thrown by the Scanner for indicating that the retrieved token does
 * not match the pattern for the expected type or that the token is out of range for the expected type.
 * */
public class ArithmeticExceptionDemo {

    public static void run() {

        Scanner scanner = new Scanner(System.in);
        int val1 = 0;
        int val2 = 0;
        input :

        try {
            // get two value with user for divition.
            System.out.print("Enter first value : ");
            val1 = scanner.nextInt(); // Ouccre here InputMismatchException
            System.out.print("Enter second value : ");
            val2 = scanner.nextInt();

            // Handle Divide by zero exception
            System.out.print(val1+"/"+val2+" = ");
            double ans = val1/val2; // Ganrate exception in this line.
            System.out.println(ans);
        }
        catch (ArithmeticException e){

            System.out.println("\n"+val1+" is not divided by 0.");
        }
        catch (InputMismatchException e){

            System.out.println("Please enter only integer value...");
        }
        finally {
            System.out.println("In Finally block...");
        } // if exception is occure or not but finally block is execute everytime.

        System.out.println("End...");

    }
}
