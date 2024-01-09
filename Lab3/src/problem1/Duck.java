package problem1;

public class Duck implements Swimmable,Flyable,Walkable {
	String duckName = "Utka" ;
	double age = 1.5 ; 
	public Duck() {
		
	}
	@Override
	public void walk() {
		System.out.println("Duck walks") ;
	}
	@Override
	public void fly() {
		System.out.println("Duck flies") ;
	}
	@Override
	public void swim() {
		System.out.println("Duck swims") ;
	}; 

	
	
}

