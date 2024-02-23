public class Book {

    private String title;
    private int pages;
    private int publicationYear;

    public Book(String bookTitle, int numOfPages, int pubYear) {
        this.title = bookTitle;
        this.pages = numOfPages;
        this.publicationYear = pubYear;
    }

    public String getName() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public int getYear(){
        return this.publicationYear;
    }

    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }

}
