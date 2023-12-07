package unchecked;

import java.util.Arrays;

/**
 * ArrayIndexOutOfBoundsException : <br>
 * &emsp;&emsp;
 * Thrown when attempting to access an array element with an illegal index.
 * */

public class ArrayIndexOutOfBoundsExceptionDemo {

    public static void run() {

        int array[] = {5,10,15,20,25,35,30,18,42};

        System.out.println("Array is : "+ Arrays.toString(array));
        System.out.println("array[0] : "+array[0]);
        System.out.println("array[2] : "+array[2]);
        try{
            System.out.println("array[9] : " + array[9]); // Ganrate exception in this line
            System.out.println("array[4] : " + array[4]);
        }
        catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Ganrate exception so skip that line...");
        }
        System.out.println("array[5] : "+array[5]);
        System.out.println("array[7] : "+array[7]);
    }
}
