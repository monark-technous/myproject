package checked;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Checked Excepiton : <br>
 * &emsp;&emsp;
 * Checked exceptions are called compile-time exceptions because these exceptions are checked
 * at compile-time by the compiler.
 * */
public class FileNotFoundExceptionDemo {

    public static void run() throws IOException {

        File file = new File("test.txt");
        FileInputStream fileInputStream = new FileInputStream(file); // FileNotFoundException in this line.

        String fileData = "";
        int data;
        while((data=fileInputStream.read()) != -1){ // Occure IOException in this line.

            fileData += (char)data;
        }

        System.out.println("File data : \n"+fileData);
    }
}
