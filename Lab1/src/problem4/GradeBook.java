package problem4;
import Practice2.Student;
import java.util.Scanner;
import java.util.Vector;
public class GradeBook {
	private  Vector<Student> students = new Vector<Student>();
	private Scanner input = new Scanner(System.in);
	public GradeBook() {
		
	}
	public GradeBook(int id, String name) {
		Student student = new Student(id, name);
		this.students.add(student);
	}
	public GradeBook(int id, String name, int grade) {
		Student student = new Student(id, name, grade);
		this.students.add(student);
	}
	public GradeBook(int id,String name,int grade, Course course) {
		Student student = new Student(id,name, grade, course);
		this.students.add(student);
	}
	public GradeBook(Student student) {
		this.students.add(student);
	}
	public void addStudent(Student student) {
		this.students.add(student);
	}
	public void displayMessage() {
		System.out.println("Welcome to the grade book!");
	}
	public void addGrade() {
		System.out.println("Please, input grades for students: ");
		for(int i=0;i<this.students.size();i++) {
			System.out.print(this.students.get(i).getName()+": ");
			int grade = input.nextInt();
			this.students.get(i).setGrade(grade);
		}
	}
	public void determineClassAverage() {
		int bestGrade=0;
		String bestGradeHolder="";
		int bestGradeHoldersId=0;
		int lowestGrade=100;
		String lowestGradeHolder="";
		int lowestGradeHoldersId=0;
		float average=0;
		for(int i=0;i<this.students.size();i++) {
			if(this.students.get(i).getGrade()>bestGrade) {
				bestGrade=this.students.get(i).getGrade();
				bestGradeHolder=this.students.get(i).getName();
				bestGradeHoldersId=this.students.get(i).getId();
			}
			else if(this.students.get(i).getGrade()<lowestGrade) {
				lowestGrade=this.students.get(i).getGrade();
				lowestGradeHolder=this.students.get(i).getName();
				lowestGradeHoldersId=this.students.get(i).getId();
			}
			average+=this.students.get(i).getGrade();
		}
		average=average/this.students.size();
		System.out.print("Class average is "+average+". ");
		System.out.print("Lowest grade is "+lowestGrade);
		System.out.println(" ("+lowestGradeHolder+","+" id: "+lowestGradeHoldersId+")");
		System.out.print("Best grade is "+bestGrade);
		System.out.println(" ("+bestGradeHolder+","+" id: "+bestGradeHoldersId+")");
	}
	public void outputBarChart() {
		System.out.println("Grades distribution");
		String s09="00-09: ";
		String s19="10-19: ";
		String s29="20-29: ";
		String s39="30-39: ";
		String s49="40-49: ";
		String s59="50-59: ";
		String s69="60-69: ";
		String s79="70-79: ";
		String s89="80-89: ";
		String s99="90-99: ";
		String s100="100: ";
		for(int i=0;i<this.students.size();i++) {
			if(this.students.get(i).getGrade()>=0 && this.students.get(i).getGrade()<=9) {
				s09+="*";
			}
			else if(this.students.get(i).getGrade()>=10 && this.students.get(i).getGrade()<=19) {
				s19+="*";
			}
			else if(this.students.get(i).getGrade()>=20 && this.students.get(i).getGrade()<=29) {
				s29+="*";
			}
			else if(this.students.get(i).getGrade()>=30 && this.students.get(i).getGrade()<=39) {
				s39+="*";
			}
			else if(this.students.get(i).getGrade()>=40 && this.students.get(i).getGrade()<=49) {
				s49+="*";
			}
			
			else if(this.students.get(i).getGrade()>=50 && this.students.get(i).getGrade()<=59) {
				s59+="*";
			}
			else if(this.students.get(i).getGrade()>=60 && this.students.get(i).getGrade()<=69) {
				s69+="*";
			}
			else if(this.students.get(i).getGrade()>=70 && this.students.get(i).getGrade()<=79) {
				s79+="*";
			}
			else if(this.students.get(i).getGrade()>=80 && this.students.get(i).getGrade()<=89) {
				s89+="*";
			}
			else if(this.students.get(i).getGrade()>=90 && this.students.get(i).getGrade()<=99) {
				s99+="*";
			}else{
				s100+="*";
			}
		}
		System.out.println(s09);
		System.out.println(s19);
		System.out.println(s29);
		System.out.println(s39);
		System.out.println(s49);
		System.out.println(s59);
		System.out.println(s69);
		System.out.println(s79);
		System.out.println(s89);
		System.out.println(s99);
		System.out.println(s100);
	}
	public void displayGradeReport() {
		determineClassAverage();
		System.out.println();
		outputBarChart();
	}
	public String getStudents() {
		String s="Students: "+this.students.size()+"\n";
		for(int i=0;i<this.students.size();i++) {
			s+=this.students.get(i).getName()+"\n";
		}
		return s;
	}
	public String allAboutStudent(int id) {
		for(int i=0;i<this.students.size();i++) {
			if(this.students.get(i).getId()==id){
				return this.students.get(i).toString();
			}
		}
		return "no such student";
	}
	public void addCourse(int id, Course course) {
		for(int i=0;i<this.students.size();i++) {
			if(this.students.get(i).getId()==id) {
				this.students.get(i).addCourse(course);
			}
		}
	}
	public String toString() {
		String s="";
		for(int i=0;i<this.students.size();i++) {
			s+=this.students.get(i).getName()+" "+this.students.get(i).getGrade()+"/n";
		}
		return s;
	}
}

