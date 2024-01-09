package problem2;

public class Ship extends Transport implements sailable {

	public Ship() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.mileage += 5;
	}

	@Override
	public void sail() {
		// TODO Auto-generated method stub
		super.mileage += 5;
	}

}
