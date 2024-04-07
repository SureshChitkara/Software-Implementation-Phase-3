/****************************************SC**********************************
 *****************
 * Name: Suresh Chitkara *
 * Course: Software Development I CEN-3024C-24667 *
 * Date: 4/6/2024 *
 * Description: The Book class contains objects that would run through LibraryManagement class.
 *****************************************SC**********************************
 ******************/
import java.util.Date; /* SC The statement import java.util.Date; is used to import the Date class from the java.util
package. */

public class Book { /* SC Declaring a class named Book */
    private String title;
    private String author;
    private int barcode;
    private boolean checkedOut;
    private Date dueDate; /* SC Store dueDate as a Date object */

    public Book(String title, String author, int barcode) { /* SC Constructor method for book clas. */
        this.title = title; /* SC These lines initialize the title, author, and barcode fields of the Book object being
         created with the values passed as arguments to the constructor. */
        this.author = author;
        this.barcode = barcode;
        this.checkedOut = false; /* SC This line initializes the checkedOut field of the Book object being created to false,
         indicating that the book is not checked out by default. */
        this.dueDate = null; /* SC Initialize due date as null */
    }

    public String getTitle() { /* SC Retrieves the title of the book. */
        return title;
    }

    public String getAuthor() { /* SC It retrieves the author of the book. */
        return author;
    }

    public int getBarcode() { /* SC It retrieves the barcode of the book. */
        return barcode;
    }

    public boolean isCheckedOut() { /* SC It determines if book is checked out. */
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) { /* SC It determines if book is not checked out. */
        this.checkedOut = checkedOut;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) { /* SC  It retrieves the due date of the book. */
        this.dueDate = dueDate;
    }

    @Override
    public String toString() { /* SC By overriding the toString() method, you provide a customized way to represent a
    Book object as a string. */
        String dueDateString = (dueDate != null) ? dueDate.toString() : "null";
        return "Title: " + title + ", Author: " + author + ", Barcode: " + barcode + ", Checked Out: " + checkedOut + ", Due Date: " + dueDateString;
    }
}

