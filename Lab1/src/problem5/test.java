package problem5;



public class test {

	public static void main(String[] args) {
		DragonLaunch dragon = new DragonLaunch();
		Person p1 = new Person(Gender.MALE);
		Person p2 = new Person(Gender.MALE);
		Person p3 = new Person(Gender.MALE);
		Person p4 = new Person(Gender.FEMALE);
		Person p5 = new Person(Gender.FEMALE);
		Person p6 = new Person(Gender.FEMALE);
		dragon.kidnap(p1);
		dragon.kidnap(p2);
		dragon.kidnap(p3);
		dragon.kidnap(p4);
		dragon.kidnap(p5);
		dragon.kidnap(p6);
		if(dragon.willDragonEatOrNot()) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
