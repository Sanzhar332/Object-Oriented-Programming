package Practice3;

public class test {

	public static void main(String[] args) {
		
		Dog myDog = new Dog("Buddy", "Golden Retriever");

        // Call the overridden speak method
        myDog.speak();

        // Call the overloaded speak method
        myDog.speak(3);

	}

}
