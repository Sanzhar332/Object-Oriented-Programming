package problem5;

public class Resistor extends Circuit{
	private double resistance;
	private double potential;
	public Resistor() {}
	public Resistor(double resistance) {
		this.resistance = resistance;
	}
	public double getPotential() {
		return this.potential;
	}
	public double getResistance() {
		return this.resistance; 
	}
	public void applyPotential(double v) {
		this.potential=v;
	}
}
