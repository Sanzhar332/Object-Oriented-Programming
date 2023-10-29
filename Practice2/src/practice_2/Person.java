package practice_2;

public class Person {
    private String name;
    private int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public Person(String name) {
        this(name, 0); 
    }

    
    public String getName() {
        return this.name;
    }

    
    public int getAge() {
        return this.age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    
    public void introduce() {
        System.out.println("Hello, my name is " + this.name + ".");
    }

    public void introduce(int age) {
        this.introduce(); 
        System.out.println("I am " + age + " years old.");
    }

    public static void main(String[] args) {
        
        Person person1 = new Person("Sanzhar", 36);

        
        Person person2 = new Person("Leo");

        
        person2.setAge(29);

        // Call the introduce methods
        person1.introduce(); 
        person2.introduce(); 
        person2.introduce(29); 
    }
}
