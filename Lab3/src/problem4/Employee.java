package problem4;

import java.util.Date;
import java.util.Objects;
public class Employee extends Person implements Comparable<Employee>, Cloneable{
	public double salary;
	public Date hireDate;
	public String insuranceNumber;
	public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}
	@Override
	public String toString() {
		return "Employee [name=" + super.name + ", salary=" +salary+", hireDate=" + hireDate + ", insuranceNumber=" + insuranceNumber + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(super.name, hireDate, insuranceNumber, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(hireDate, other.hireDate) && Objects.equals(insuranceNumber, other.insuranceNumber)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	public int compareTo(Employee e) {
		if(salary > e.salary) return 1;
		if(salary < e.salary) return -1;
		return 0;
	}
	public Employee clone() throws CloneNotSupportedException {
		Employee e = (Employee)super.clone();
		e.hireDate = (Date)hireDate.clone();
		return e;
	}
	
}
