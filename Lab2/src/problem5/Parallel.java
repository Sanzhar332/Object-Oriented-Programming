package problem5;



public class Parallel extends Circuit{
	private Circuit a;
	private Circuit b;
	public Parallel() {}
	public Parallel(Circuit a, Circuit b) {
		this.a=a;
		this.b=b;
	}
	public double getResistance() {
		// 1/R=1/R1+1/R2
		return (a.getResistance()*b.getResistance())/(a.getResistance()+b.getResistance());
	}
	public double getPotential() {
		// v=v1=v2
		return a.getPotential();
	}
	public void applyPotential(double v) {	
		// I=V/R  V=I*R
		// I=I1+I2 
		a.applyPotential(v);
		b.applyPotential(v);
	}

}
