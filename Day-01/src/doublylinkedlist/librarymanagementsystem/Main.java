package doublylinkedlist.librarymanagementsystem;

public class Main {
    public static void main(String[] args)
    {
        LibraryManagement library = new LibraryManagement();

        // Add books to the library
        library.addBookAtBeginning("The White Tiger", "Aravind Adiga", "Classis", 2, true);
        library.addBookAtEnd("The macbook Story", "DK Bharat", "Mystery", 2, true);
        library.addBookAtPosition("The Great wall of china", "D.S. Shukla", "Classic", 3, true, 2);
        library.addBookAtPosition("Killing the love", "BK Sahu", "Romance", 4, true, 1);


        // Display the books in the library
        library.displayBooksForward();
        System.out.println("Total books: " + library.countBooks());

        // Search for a book by Book id
        library.removeBookByID(3);

        // Display the books in the library
        library.displayBooksForward();

        // Search for a book by author
        System.out.println("Total books: " + library.countBooks());

        // Update the availability of a book
        library.updateBookAvailability(2, false);

        // Display the books in the library
        library.displayBooksForward();

        // Display the books in the library in reverse order
        System.out.println("Total books: " + library.countBooks());
    }
}
