package checked;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * SQLException <br>
 * &emsp;&emsp;
 * An exception that provides information on a database access error or other errors.
 * */
public class SQLExceptionDemo {

    public static void run() {

        try{
            String url = "";
            String user = "root";
            String password = "";

            Connection connection = DriverManager.getConnection(url, user, password);
        }
        catch(SQLException e){

            System.out.println("Database connection is failed...");
        }
    }
}