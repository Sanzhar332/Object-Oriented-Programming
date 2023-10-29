package Practice3;


class Staff extends Person{
	String school;
	double pay;
	public Staff() {
		
	}
	Staff(String name, String adress, String school, double pay){
		super(name, adress);
		this.school = school;
		this.pay = pay;
	}
	void setSchool(String school) {
		this.school = school;
	}
	String getSchool() {
		return this.school;
	}
	void setPay(double pay) {
		this.pay = pay;
	}
	double getPay() {
		return this.pay;
	}
	public String toString() {
		return super.name + " " + super.adress + " " + this.school + " " + this.pay;
	}
}