package problem5;

public class Series extends Circuit{
	private Circuit a;
	private Circuit b;
	public Series() {}
	public Series(Circuit a,Circuit b) {
		this.a=a;
		this.b=b;
	}
	public double getResistance() {
		// R=R1+R2
		return a.getResistance()+b.getResistance();
	}
	public double getPotential() {
		// V=V1+V2
		return a.getPotential()+b.getPotential();
	}
	public void applyPotential(double v) {	
		// I = V/R   V2=R2*I
		double current = (a.getPotential()/a.getResistance());
		this.a.applyPotential(a.getResistance()*current);
		this.b.applyPotential(b.getResistance()*current);
	}
}

