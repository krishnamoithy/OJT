import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true; 
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", available=" + available +
                '}';
    }
}

class Member {
    private String name;
    private String memberId;
    private List<Book> borrowedBooks;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

 
    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.setAvailable(false);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setAvailable(true);
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", memberId='" + memberId + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}

class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }


    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }


    public boolean borrowBook(String memberId, String isbn) {
        Member member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);

        if (member != null && book != null && book.isAvailable()) {
            member.borrowBook(book);
            return true;
        }

        return false;
    }

    public boolean returnBook(String memberId, String isbn) {
        Member member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);

        if (member != null && book != null && member.getBorrowedBooks().contains(book)) {
            member.returnBook(book);
            return true;
        }

        return false;
    }


    private Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    private Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void listMembers() {
        for (Member member : members) {
            System.out.println(member);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library();




        library.addMember(new Member("KD KRISHNA", "MEM001"));
        library.addMember(new Member("KD LIFE", "MEM002"));


        library.borrowBook("MEM001", "ISBN001");
        library.returnBook("MEM001", "ISBN001");

        library.listBooks();
        library.listMembers();
    }
}
