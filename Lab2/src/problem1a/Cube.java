package problem1a;

import java.util.Objects;

public class Cube extends Shape {
	
	public double length; 
	
	public Cube()
	{
		
	}
	
	public Cube(double length)
	{
		this.length = length ; 
	}

	public double volume() 
	{
		double result ; 
		result = Math.pow(length, 3) ; 
		return result   ; 
	}



	public double surfaceArea() 
	{
		double result ; 
		result = 6 * length * length; 
		return  result ; 
		
	}
	
	public String toString(double length)
	{
		return "Cube length = " + length ; 
	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if (this == null || (!(o instanceof Cube))) return false;
		Cube cube = (Cube) o;
		return length == cube.length;
	}
	
	public int hashCode() {
		return Objects.hash(length);
	}
	
	
}
