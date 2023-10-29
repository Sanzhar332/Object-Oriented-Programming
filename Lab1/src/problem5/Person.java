package problem5;
public class Person {
	private Gender gender;
	private String name;
	public Person(Gender gender) {
		this.gender = gender;
	}
	public Person(Gender gender,String name) {
		this(gender);
		this.name=name;
	}
	public Gender getGender() {
		return this.gender;
	}
	public String toString() {
		return this.gender+" "+this.name+". ";
	}
}
