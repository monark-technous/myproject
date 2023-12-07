package checked;
/**
 * ClassNotFoundException <br>
 * &emsp;&emsp;
 * The ClassNotFound exception is raised when a Java Virtual Machine (JVM) tries to
 * load a specific class, and that class is not found in the specified classpath.
 * */
public class ClassNotFoundExceptionDemo {

    public static void run() {

        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){

            System.out.println("Class not found..please try again...");
        }
    }
}
