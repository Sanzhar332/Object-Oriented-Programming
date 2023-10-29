package Practice2;

import problem4.Course;
import java.util.Vector;

public class Student {
	private int grade;
	private int id;
	private String name;
	private int yearOfStuds;
	private Vector<Course> courses= new Vector<Course>();
	public Student() {
		
	}
	public Student(int id) {
		this.id = id;
	}
	public Student(int id, String name) {
		this(id);
		this.name = name;
	}
	public Student(int id, String name, int grade) {
		this(id);
		this.name = name;
		this.grade = grade;
	}
	public Student(int id, String name,int grade, Course course) {
		this(id,name,grade);
		this.courses.add(course);
	}
	public void addCourse(Course course) {
		this.courses.add(course);
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return this.grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void incrementYear() {
		this.yearOfStuds++;
	}
	public String toString() {
		String s=this.id+": "+this.name+", "+"Study year: "+yearOfStuds+"\n";
		for(int i=0;i<this.courses.size();i++) {
			s+=this.courses.get(i).toString();
		}
		return s;
	}
}
