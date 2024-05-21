import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        Library library = new Library();

        
        library.addBook("Life of KD");
        library.addBook("The King");
        library.addBook("Papu's Life");

   
        library.displayBooks();

 
        library.removeBook("The King");


        library.displayBooks();
    }
}

class Library {
    private List<String> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void removeBook(String book) {
        boolean removed = books.remove(book);
        if (removed) {
            System.out.println("Book removed: " + book);
        } else {
            System.out.println("Book not found: " + book);
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("Books in the library:");
            for (String book : books) {
                System.out.println(book);
            }
        }
    }
}
