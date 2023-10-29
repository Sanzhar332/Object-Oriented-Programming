package Practice3;


class Student extends Person{
	String program;
	int year;
	double fee;
	int cnt = 0;
	{	
		cnt++;
	}
	Student(String name, String adress) {
		super(name, adress);
	}

	Student(String name, String adress, String program, int year, double fee){
		this(name, adress);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	void setProgram(String program) {
		this.program = program;
	}
	String getProgram() {
		return this.program;
	}
	void setYear(int year) {
		this.year = year;
	}
	int getYear() {
		return this.year;
	}
	void setFee(double fee) {
		this.fee = fee;
	}
	double getFee() {
		return this.fee;
	}
	public String toString() {
		return super.name + " " + super.adress + " " + this.program + " " + this.year + " " + this.fee;
	}
	
	
}
