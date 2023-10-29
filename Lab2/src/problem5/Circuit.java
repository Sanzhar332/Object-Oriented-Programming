package problem5;

public abstract class Circuit {
	
	public Circuit() {}
	
	public abstract double getResistance();
	public abstract double getPotential();
	public abstract void applyPotential(double v);
	public double getPower() {
		return this.getPotential()*this.getCurrent();
	}
	public double getCurrent() {
		return this.getPotential()/this.getResistance();
	}
}