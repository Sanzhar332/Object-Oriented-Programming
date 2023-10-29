package problem2;



class Student {
	final static String studyPlace = "KBTU";
	private String name;
	private String city;
	Gender g;
	static int cnt;
	private int id;
	{
		cnt++;
	}
	public Student() {
		
	}
	public Student(int id) {
		this.id = id;
	}
	public Student(int id, String name) {
		this(id);
		this.name = name;
	}
	public Student(int id, String name, String city) {
		this(id,name);
		this.city = city;
	}
	public Student(int id, String name, String city, Gender g) {
		this(id,name, city);
		this.g = g;
	}
	public void setParameters(String name) {
		this.name = name;
	}	
	public void setParameters(String name, String city) {
		setParameters(name);
		this.city = city;
	}

	public String toString() {
		return this.name+ " " +this.city+" "+this.id+" "+studyPlace;
	}
}
