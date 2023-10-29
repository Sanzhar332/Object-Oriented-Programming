package Practice3;

public class Animal {
    private String name;

    public Animal(String name) {
        this.setName(name);
    }

    public void speak() {
        System.out.println(getName() + " makes a generic animal sound.");
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}