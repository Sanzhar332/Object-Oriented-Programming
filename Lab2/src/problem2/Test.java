package problem2;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        Person person1 = new Person("John", 30);
        Person person2 = new Person("John", 30);
        people.add(person1);
        people.add(person2);

        System.out.println("HashSet size for Person: " + people.size()); 

        Employee employee = new Employee("Alice", 35, "12345");
        System.out.println(employee); 
    }
}