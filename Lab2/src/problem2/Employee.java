package problem2;

import java.util.Objects;

public class Employee extends Person {
    private String employeeId;

    public Employee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), employeeId);
    }

    public String toString() {
        return "Employee{name='" + this.getName() + "', age=" + this.getAge() + ", employeeId='" + employeeId + "'}";
    }
	
}
