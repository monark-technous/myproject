package unchecked;
/**
 * NullPointerException : <br>
 * &emsp;&emsp;
 * If we have a null value in any variable, performing any operation on the variable throws a NullPointerException.
 * */

public class NullPointerExceptionDemo {

    public static void run() {

        try{
            NullPointerExceptionDemo nullPointerExceptionDemo = new NullPointerExceptionDemo();
            nullPointerExceptionDemo.printMessage("Hello..First message.");
            nullPointerExceptionDemo = null;
            // Occure exception in this line
            nullPointerExceptionDemo.printMessage("This is Second message.");
            System.out.println("End try block...");
        }
        catch (NullPointerException e){

            System.out.println("Object is null so create exception here.");
        }

        System.out.println("End...");
    }

    public void printMessage(String msg) {

        System.out.println(msg);
    }
}
