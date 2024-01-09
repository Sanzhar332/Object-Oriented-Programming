package problem1;

public class Circle extends Shape implements drawable {
	public int R;
	public Circle(String color, int R) {
		super(color);
		this.R = R;
		// TODO Auto-generated constructor stub
	}
	public void draw() {
		System.out.println("Imagine there is drawed circle with radius "+ R + " and with color " + color);
	}
	
}
