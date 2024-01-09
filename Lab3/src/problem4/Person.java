package problem4;

import java.util.Objects;

public abstract class Person  {
	public String name;
	public Person(String name){
		this.name = name;
	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(name);
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}
