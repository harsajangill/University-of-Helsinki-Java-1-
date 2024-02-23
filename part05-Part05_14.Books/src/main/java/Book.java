
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }


    public boolean equals(Object compared) {

        //check if they are in same location
        if (this == compared) {
            return true;
        }

        //check type
        if (!(compared instanceof Book)) {
            return false;
        }

        //convert
        Book bookCompared = (Book) compared;

        //check variables

        return (this.name.equals(bookCompared.name) && this.publicationYear == bookCompared.publicationYear);
    }



    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

}
