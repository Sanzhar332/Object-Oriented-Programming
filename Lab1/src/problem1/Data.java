package problem1;

public class Data {
	private int size;
	private double max=Integer.MIN_VALUE;
	private double sum;
	public Data() {
		
	}
	public void add(double value) {
		sum+=value;
		if(max<value) {
			max=value;
		}
		size++;
	}
	public double getAverage() {
		System.out.print("Average = ");
		return sum/size;
	}
	public double getMax() {
		System.out.print("Maximum = ");
		return max;
	}
	
	
	
}
