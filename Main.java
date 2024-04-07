/****************************************SC**********************************
 *****************
 * Name: Suresh Chitkara *
 * Course: Software Development I CEN-3024C-24667 *
 * Date: 4/6/2024 *
 * Description: The Main class would display the gui that would help user add books, delete books, and check in and check out books.
 *****************************************SC**********************************
 ******************/
import javax.swing.SwingUtilities; /* SC The javax.swing.SwingUtilities class provides a set of utility methods for Swing applications */

public class Main { /* SC Start of main class. */
    public static void main(String[] args) { /* SC This is the main method declaration in Java,
    which serves as the entry point for the execution of a Java program. */
        SwingUtilities.invokeLater(new Runnable() { /* SC This line of code uses the invokeLater method from the SwingUtilities
         class to schedule a task to be executed asynchronously on the event dispatch thread (EDT) of the Swing application. */
            public void run() { /* SC This line of code defines the run method inside an anonymous Runnable object. */
                LibraryManagementSystemGUI gui = new LibraryManagementSystemGUI(); /* SC This line of code creates a new
                 instance of the LibraryManagementSystemGUI class. */
                gui.setVisible(true); /* SC  Making the GUI visible */
            }
        });
    }
}
