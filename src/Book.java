import java.util.Scanner;

public class Book {
    private String bookName;
    private int yrofJoining;
    private long isbn;
    private Author[] arrayOfAuthor;
    private int numofAuthor;


    public Book(String bookName, int yrofJoining, long isbn, Author[] arrayOfAuthor, int numofAuthor) {
        this.bookName = bookName;
        this.yrofJoining = yrofJoining;
        this.isbn = isbn;
        this.arrayOfAuthor = arrayOfAuthor;
        this.numofAuthor = numofAuthor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter book name: ");
        String bookName = scanner.nextLine();
        System.out.println("enter yr of publishing: ");
        int yrofJoining = Integer.parseInt(scanner.next());
        System.out.println("enter the isbn: ");
        long isbn = Long.parseLong(scanner.next());
        Author[] authors = new Author[5];
        for (int i = 0; i < authors.length; i++) {
            String authorName = scanner.nextLine();
            String genre = scanner.nextLine();
            int numOfBook = Integer.parseInt(scanner.next());
            boolean expert = scanner.nextBoolean();
        }

        Book book = new Book();
    }

    public int getNumofAuthor() {
        return numofAuthor;
    }

    public void setNumofAuthor(int numofAuthor) {
        this.numofAuthor = numofAuthor;
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
