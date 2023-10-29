package practice_2;

public class Student {
    private String name;
    private int id;
    private int yearOfStudy;

    // Constructor with two parameters
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1; // Initializing the year of study to 1 by default
    }

    // Method to access the name
    public String getName() {
        return name;
    }

    // Method to access the id
    public int getId() {
        return id;
    }

    // Method to increment the year of study
    public void incrementYearOfStudy() {
        yearOfStudy++;
    }

    // Method to get the current year of study
    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public static void main(String[] args) {
        // Create a new Student object
        Student student1 = new Student("Dirk Gently", 12345);

        // Access student's name and id
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student ID: " + student1.getId());

        // Access and increment the year of study
        System.out.println("Year of Study: " + student1.getYearOfStudy());
        student1.incrementYearOfStudy();
        System.out.println("Year of Study after increment: " + student1.getYearOfStudy());
    }
}