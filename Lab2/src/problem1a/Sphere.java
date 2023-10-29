package problem1a;

import java.util.Objects;

public class Sphere {
	
	double radius ; 
	
	public Sphere()
	{
		
	}
	
	public Sphere(double radius )
	{
		this.radius = radius ; 	
	}	
	
	public double volume()
	{
		double result;
		result = (3/4) * Math.PI * Math.pow(radius, 3) ; 
		return result ; 
		
	}
	
	
	public double surfaceArea()
	{	
		double result ; 
		result = Math.PI * 4 * radius * radius; 
		return result ; 
	}
	
	public String toString()
	{
		return "radius = " + radius; 
	}
	
	public boolean equals(Object o)
	{
		if(this == o) return true;
		if(o == null) return false; 
		if(getClass() != o.getClass()) return false ; 
		Sphere other = (Sphere) o ; 
		return radius == other.radius ; 
	}
	
	public int hashCode() {
		return Objects.hash(radius);
	}

}
