package problem4;

public class Course {
	private String name;
	private String description;
	private int numberOfCredits;
	private String prerequisite;
	public Course() {
		this.name = "default";
		this.description = "";
		this.numberOfCredits= 0;
		this.prerequisite = "no prerequisite";
	}
	public Course(String name, int numberOfCredits) {
		this();
		this.name = name;
		this.numberOfCredits = numberOfCredits;
	}
	public Course(String name, String description, int numberOfCredits, String prerequisite) {
		this(name, numberOfCredits);
		this.description = description;
		this.prerequisite = prerequisite;
	}
	public String toString() {
		return name+", "+description+", "+"credits: "+this.numberOfCredits+", prerequisites: "+this.prerequisite+"\n";
	}

}
