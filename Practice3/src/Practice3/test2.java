package Practice3;
import java.util.Scanner ;
import java.util.Vector; 


public class test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student s1 = new Student("Sanzhar", "Kamenka", "IS", 2021, 5000);
		Student s2 = new Student("Rauan", "Tole bi", "IS", 2021, 5000);

		
		Vector<Person> v = new Vector<Person>();
		v.add(s1);
		v.add(s2) ; 
		

		System.out.println(v) ; 
	}
}
