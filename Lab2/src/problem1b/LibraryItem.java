package problem1b;

import java.util.Objects;

abstract class LibraryItem {
    private String title;
    private String author;
    private int publicationYear;

    public LibraryItem() {
    	
    }
    public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

   
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryItem that = (LibraryItem) o;
        return publicationYear == that.publicationYear &&
                Objects.equals(title, that.title) &&
                Objects.equals(author, that.author);
    }

    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }

    
    abstract void printInfo();
}
