package problem2;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    
    public Person() {
    	
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
    	return name;
    }
    
    public int getAge() {
    	return age;
    }

    public boolean equals(Object o) {
    	if(this == o) return true;
    	if(this == null || (!(o instanceof Person))) return false;
    	Person person = (Person) o ;
    	return name.equals(person.getName()) && age == person.age ;
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }
}
