package problem4;

import java.util.*;

public class Manager extends Employee implements Comparable<Employee>, Cloneable {
	public double bonusWallet;
	Vector <Employee> team;
	{
		team = new Vector <Employee>();
		bonusWallet = 0;
	}
	public Manager(String name, double salary, Date hireDate, String insuranceNumber) {
		
		super(name, salary, hireDate, insuranceNumber);
		// TODO Auto-generated constructor stub
	}
	public void addToTeam(Employee e) {
		team.add(e);
	}
	public void setBonus(double bonus) {
		bonusWallet += bonus;
	}
//	@Override
//	public String toString() {
//		return "Manager [name=" + name + ", bonusWallet=" + bonusWallet +", salary=" + salary + ", hireDate="
//				+ hireDate + ", insuranceNumber=" + insuranceNumber+"]";
//	}
	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		Manager other = (Manager) obj;
		return Double.doubleToLongBits(bonusWallet) == Double.doubleToLongBits(other.bonusWallet)
				&& Objects.equals(team, other.team);
	}
	public int compareTo(Employee e) {
		int p = super.compareTo(e);
		if(p != 0 || !(e instanceof Manager)) return p;
		Manager m = (Manager)e;
		if(bonusWallet > m.bonusWallet) return 1;
		if(bonusWallet < m.bonusWallet) return -1;
		return 0;
	}
	public Manager clone() throws CloneNotSupportedException {
		Manager m = (Manager)super.clone();
		m.team = new Vector<Employee>();
		for(Employee e: this.team) {
			Employee copy = (Employee)e.clone();
			m.team.add(copy);
		}
		return m;
	}
	@Override
	public String toString() {
		return "Manager [name=" + name + ", bonusWallet=" + bonusWallet + ", team=" + team + ", salary=" + salary + ", hireDate="
				+ hireDate + ", insuranceNumber=" + insuranceNumber+"]";
	}

}
