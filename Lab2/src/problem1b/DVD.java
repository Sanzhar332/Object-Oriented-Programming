package problem1b;

import java.util.Objects;

public class DVD extends LibraryItem {
    private String director;
    private int duration;
    
    public DVD() {
    	
    }

    public DVD(String title, String author, int publicationYear, String director, int duration) {
        super(title, author, publicationYear);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DVD dvd = (DVD) o;
        return duration == dvd.duration &&
                Objects.equals(director, dvd.director);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), director, duration);
    }
    
    void printInfo() {
        System.out.println("DVD Information:");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publication Year: " + getPublicationYear());
        System.out.println("Director: " + director);
        System.out.println("Duration: " + duration + " minutes");
    }
}
