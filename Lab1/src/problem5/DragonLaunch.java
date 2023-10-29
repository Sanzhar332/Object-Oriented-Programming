package problem5;
import java.util.Vector;

public class DragonLaunch {
	private Vector<Person> people = new Vector<Person>();
	public DragonLaunch() {
		
	}
	public DragonLaunch(Person p) {
		people.add(p);
	}
	public void kidnap(Person p) {
		people.add(p);
	}
	public boolean willDragonEatOrNot() {
		int last=-1;
		for(int i=0;i<people.size();i++) {
			if(last==-1) {
				last++;
			}else {
				if(people.get(i).getGender()==Gender.FEMALE && people.get(last).getGender()==Gender.MALE){
					last-=1;
				}else {
					last++;
				}
			}
		}
		if(last==-1) {
			return true;
		}else {
			return false;
		}
	}
}
