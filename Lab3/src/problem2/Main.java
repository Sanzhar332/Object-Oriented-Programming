package problem2;

public class Main {

	public static void main(String[] args) {

		Ship ship = new Ship();
		Car car = new Car();
		car.move();
		ship.move();
		System.out.println(ship.mileage);
		System.out.println(car.mileage);
		car.move();
		ship.sail();
		System.out.println(ship.mileage);
		System.out.println(car.mileage);
	}

}
