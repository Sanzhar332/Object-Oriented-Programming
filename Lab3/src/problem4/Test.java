package problem4;

import java.text.*;
public class Test {

	public static void main(String[] args) throws ParseException, CloneNotSupportedException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Employee e1 = new Employee("Employee 1", 120000, dateFormat.parse("18/05/2022"), "21B030771");
		Manager m1 = new Manager("Manager 1", 120000, dateFormat.parse("21/06/2019"), "21B030772");
		Manager m2 = new Manager("Manager 2", 120000, dateFormat.parse("04/01/2022"), "21B030773");
		Manager m3 = new Manager("Manager 3", 120000, dateFormat.parse("09/01/2022"), "21B030774");
		Employee e2 = new Employee("Employee 2", 90000, dateFormat.parse("29/05/2020"), "21B030769");
		m1.setBonus(12000);
		m2.setBonus(13000);
		m3.setBonus(80000);
		
		Employee e2Clone = (Employee) e2.clone();
		
		e2.name = "E2 changed";
		System.out.println(e2);
		System.out.println(e2Clone);
		
		Employee[] a = new Employee[5];
//
//		Vector <Employee> v = new Vector <Employee>();
//		v.add(e1);
//		v.add(e2);
//		v.add(m1);
//		v.add(m2);
//		v.add(m3);
		m3.addToTeam(e1);
		Manager m3Clone = (Manager)m3.clone();
		m3Clone.name = "Manager 3 Clone";
//		m3Clone.addToTeam(m1);
//		System.out.println(m3);
//		System.out.println(m3Clone);
//		Collections.sort(v);
		
		m3.team.elementAt(0).name = "Changed";
		
		System.out.println(m3.name);

		for(int i = 0; i < m3.team.size(); i++) {
			System.out.println(m3.team.elementAt(i));
		}
		
		System.out.println(m3Clone.name);
		
		for(int i = 0; i < m3Clone.team.size(); i++) {
			System.out.println(m3Clone.team.elementAt(i));
		}
	}

}
