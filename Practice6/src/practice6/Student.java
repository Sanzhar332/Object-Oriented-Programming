package practice6;

public class Student extends Person implements CanHavePizza, CanHaveRetake, CanHaveParty, Movable {
    
	public Student() {
    	
    }
    
    public Student(String name, int age) {
        super(name, age);
    }
    
    public void eatPizza() {
        System.out.println("The student " + getName() + " is enjoying the pizza.");
    }

    public void retakeExam() {
        System.out.println("The student " + getName() + " is taking a retake exam.");
    }

    public void move() {
        System.out.println("The student " + getName() + " is moving.");
    }

    public void dance() {
        System.out.println("The student " + getName() + " is dancing.");
    }
}
