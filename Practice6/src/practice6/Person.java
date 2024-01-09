package practice6;

public class Person {
    private String name;
    private int age;
    private boolean hasPaid;
    
    public Person() {
    	
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void payForPizza() {
        hasPaid = true;
        System.out.println("Payment received. You can enjoy the pizza now.");
    }
    
    public void eatPizza() {
        if (!hasPaid) {
            System.out.println("You need to pay for Pizza first.");
        } else {
            System.out.println("Enjoying the pizza.");
        }
    }
}

