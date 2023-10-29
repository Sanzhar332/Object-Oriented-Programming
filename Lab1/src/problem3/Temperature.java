package problem3;

public class Temperature {
	private double temperature;
	private char scale;
	public Temperature() {
		this.scale = 'C';
		this.temperature = 0;
	}
	public Temperature(double temperature) {
		this();
		this.temperature = temperature;
	}
	public Temperature(char scale) {
		this();
		this.scale = scale;
	}
	public Temperature(double temperature ,char scale) {
		this.temperature = temperature;
		this.scale = scale;
	}
	
	public double getDegreeC() {
		if(this.scale=='C') {
			return temperature;
		}else {
			return 5*(getDegreeF()-32)/9;
		}
	}
	public double getDegreeF() {
		if(this.scale=='F') {
			return temperature;
		}else {
			return 9*(getDegreeC()/5)+32;
		}
	}
	
	public void setScale(char scale) {
		this.scale = scale;
	}
	public void setValue(double temperature) {
		this.temperature = temperature;
	}
	public void setBoth(double temperature, char scale) {
		setScale(scale);
		setValue(temperature);
	}
	
	public char getScale() {
		return this.scale;
	}
	public double getValue() {
		return this.temperature;
	}
	
	
}
