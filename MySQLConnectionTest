/****************************************SC**********************************
 *****************
 * Name: Suresh Chitkara *
 * Course: Software Development I CEN-3024C-24667 *
 * Date: 4/7/2024 *
 * Description: MySQLConnectionTest checks the connectivity to a MySQL database and to verify if the necessary configurations for establishing a connection are correctly set up.
 *****************************************SC**********************************
 ******************/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/* SC These classes are typically used when writing Java code to interact with databases, allowing the programmer to establish connections, execute SQL queries, and handle database-related errors. */

public class MySQLConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/library"; /* SC String url for database. */
        String username = "root"; /* SC Username for localhost. */
        String password = "Incorrect7#"; /* SC Password for localhost. */

        try {
            /* SC Establishing a connection to the MySQL database. */
            Connection conn = DriverManager.getConnection(url, username, password);

            if (conn != null) { /* SC If an SQLException occurs during the connection process (e.g., if there's an error establishing the connection),
            it catches the exception and prints an error message indicating the reason for the failure. */
                System.out.println("Connected to the MySQL database.");
                conn.close(); /* SC Close the connection */
            }
        } catch (SQLException e) {
            System.out.println("Error connecting to the MySQL database: " + e.getMessage());
        }
    }
}
