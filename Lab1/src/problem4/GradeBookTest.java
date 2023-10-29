package problem4;
import Practice2.Student;
public class GradeBookTest {

	public static void main(String[] args) {
		Student student = new Student(01,"Assylan",90);
		GradeBook oop = new GradeBook(student);
		Student a = new Student(02,"Student A",85);
		Student b = new Student(03,"Student B",95);
		Student c = new Student(04,"Student C",65);
		oop.addStudent(a);
		oop.addStudent(b);
		oop.addStudent(c);
		oop.displayMessage();
		oop.displayGradeReport();
	}

}
