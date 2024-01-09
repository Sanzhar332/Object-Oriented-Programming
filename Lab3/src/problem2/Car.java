package problem2;

public class Car extends Transport implements moveable {

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.mileage += 5;
	}

}
