package problem5;

public class Chocolate implements Comparable<Chocolate> {
	public double weight;
	public String name;
	public Chocolate(double weight, String name) {
		this.weight = weight;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Chocolate [weight=" + weight + ", name=" + name + "]";
	}
	public int compareTo(Chocolate c) {
		if(weight > c.weight) return 1;
		if(weight < c.weight) return -1;
		return 0;
	}
}
