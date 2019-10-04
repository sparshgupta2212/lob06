import java.util.Scanner;

public class Book {
    private String bookName;
    private int yrofJoining;
    private long isbn;
    private Author[] arrayOfAuthor;


    public Book(String bookName, int yrofJoining, long isbn, Author[] arrayOfAuthor) {
        this.bookName = bookName;
        this.yrofJoining = yrofJoining;
        this.isbn = isbn;
        this.arrayOfAuthor = arrayOfAuthor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();
        int yrofJoining = Integer.parseInt(scanner.next());
        long isbn = Long.parseLong(scanner.next());
        Author[] authors = new Author[5];

        Book book = new Book();
    }

    public int getYrofJoining() {
        return yrofJoining;
    }

    public void setYrofJoining(int yrofJoining) {
        this.yrofJoining = yrofJoining;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public Author[] getArrayOfAuthor() {
        return arrayOfAuthor;
    }

    public void setArrayOfAuthor(Author[] arrayOfAuthor) {
        this.arrayOfAuthor = arrayOfAuthor;
    }

    public String getBookName() {
        return bookName = bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %d, %s", getBookName(), getYrofJoining(), getIsbn(), getArrayOfAuthor());
    }

}
