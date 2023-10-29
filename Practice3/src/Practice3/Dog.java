package Practice3;

public class Dog extends Animal {
	
    private String breed;

    public Dog(String name, String breed) {
        super(name); // Calls the constructor of the base class with a parameter
        this.breed = breed;
    }

    // Method overriding: Override the speak method from the base class
    public void speak() {
        super.speak(); // Calls the speak method of the base class
        System.out.println(getName() + " (a " + breed + " dog) barks loudly.");
    }

    // Method overloading: Create an overloaded method with different parameters
    public void speak(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(getName() + " (a " + breed + " dog) barks!");
        }
    }
}
