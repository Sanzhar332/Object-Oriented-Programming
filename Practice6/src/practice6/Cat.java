package practice6;

public class Cat implements CanHavePizza {
    private String name;

    public Cat(String name) {
        this.name = name;
    }


    public void eatPizza() {
        System.out.println("The cat " + name + " is enjoying the pizza.");
    }


	@Override
	public void payForPizza() {
		// TODO Auto-generated method stub
		
	}
}
