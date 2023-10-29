package Practice3;

public class Person {
	String name;
	String adress;
	public Person() {
		
	}
	Person(String name, String adress){
		this.name = name;
		this.adress = adress;
	}
	String getName() {
		return this.name;
	}
//	void setName(String name) {
//		this.name = name;
//	}
	String getAdress() {
		return this.adress;
	}
	void setAdress(String adress) {
		this.adress = adress;
	}
	public String toString() {
		return this.name + " " + this.adress;
	}
}
