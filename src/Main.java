import checked.ClassNotFoundExceptionDemo;
import checked.FileNotFoundExceptionDemo;
import checked.SQLExceptionDemo;
import custom.PeopleATM;
import unchecked.ArithmeticExceptionDemo;
import unchecked.ArrayIndexOutOfBoundsExceptionDemo;
import unchecked.ClassCastExceptionDemo;
import unchecked.NullPointerExceptionDemo;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("\n --------------------------------");
            System.out.println("|   Exception Handling Example  |");
            System.out.println("|-------------------------------|");
            System.out.println("| 1. Airthmetic Exception");
            System.out.println("| 2. Array Index Out Of Bound");
            System.out.println("| 3. Class Cast Exception");
            System.out.println("| 4. Class not found Exception");
            System.out.println("| 5. File not found Exception");
            System.out.println("| 6. Null Pointer Exception");
            System.out.println("| 7. SQL Exception");
            System.out.println("| 8. Custom Exception");
            System.out.println("| 9. EXIT");
            System.out.println("|--------------------------------");

            System.out.print("| Enter Your choice : ");
            int choice = scanner.nextInt();
            System.out.println("--------------------------------");

            switch (choice){

                case 1:
                    ArithmeticExceptionDemo.run();
                    break;

                case 2:
                    ArrayIndexOutOfBoundsExceptionDemo.run();
                    break;

                case 3:
                    ClassCastExceptionDemo.run();
                    break;

                case 4:
                    ClassNotFoundExceptionDemo.run();
                    break;

                case 5:
                    try{
                        FileNotFoundExceptionDemo.run();
                    }catch(IOException e){

                        System.out.println("Occur FileNotFoundException or IOExxception");
                    }
                    break;

                case 6:
                    NullPointerExceptionDemo.run();
                    break;

                case 7:
                    SQLExceptionDemo.run();
                    break;

                case 8:
                    PeopleATM.execute();
                    break;

                case 9:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong choice.....");
            }
        }
    }
}
