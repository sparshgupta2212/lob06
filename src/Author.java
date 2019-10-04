public class Author {
    private String authorName;
    private String genre;
    private int numOfBook;
    private boolean expert;

    public Author(String authorName, String genre, int numOfBook, boolean expert) {
        this.authorName = authorName;
        this.genre = genre;
        this.numOfBook = numOfBook;
        this.expert = expert;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumOfBook() {
        return numOfBook;
    }

    public void setNumOfBook(int numOfBook) {
        this.numOfBook = numOfBook;
    }

    public boolean isExpert() {
        return expert;
    }

    public void setExpert(boolean expert) {
        this.expert = expert;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(getAuthorName());
        if (isExpert()) {
            result.append("is an accomplished writer.");
        }
        result.append("of the" + getGenre() + "genre with over" + getNumOfBook() + "book published");
        return result.toString();
    }
}
