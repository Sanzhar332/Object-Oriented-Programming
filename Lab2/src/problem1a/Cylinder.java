package problem1a;

import java.util.Objects;

public class Cylinder {
	
	double height ; 
	double radius ; 
	
	public Cylinder() {}
	
	public Cylinder(double height , double radius)
	{
		this.height = height; 
		this.radius = radius ; 
	}
	
	public double  volume()
	{	
		double result ; 
		result = ( Math.PI  * Math.pow(radius, 2)  * height ); 
		return result ; 
	}
	
	public double surfaceArea()
	{	
		double result ; 
		result = 2 * Math.PI * radius * ( height + radius) ; 
		return result ; 
	}
	
	public String toString()
	{
		return "height = " + height + "radius = " + radius ; 
	}
	
	public boolean equals (Object o )
	{
		if(this == o) return true  ;
		if(this == null || (!(o instanceof Cylinder))) return false;
		Cylinder other = (Cylinder) o ; 
		return height == other.height && radius == other.radius ; 
		
	}
	
	public int hashCode() {
		return Objects.hash(height,radius);
	}
}
