package problem5;

public class Time implements Comparable<Time> {
	int hour;
	int minute;
	int second;
	Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	void toUniversal() {
		System.out.print(hour+":");
		if(minute > 9) {
			System.out.print(minute+":");
		}
		if(minute <= 9) {
			System.out.print("0"+minute+":");
		}
		if(second > 9) {
			System.out.println(second);
		}
		if(second <= 9) {
			System.out.println("0"+second);
		}
	}
	void toStandard() {
		boolean am = false;
		if(hour > 12) {
			System.out.print((hour-12)+":");
		}
		if(hour <= 12) {
			am = true;
			System.out.print(hour+":");
		}
		if(minute > 9) {
			System.out.print(minute+":");
		}
		if(minute <= 9) {
			System.out.print("0"+minute+":");
		}
		if(second > 9) {
			System.out.print(second);
		}
		if(second <= 9) {
			System.out.print("0"+second);
		}
		if(am) {
			System.out.println(" AM");
		}
		else {
			System.out.println(" PM");
		}
	}
	public int compareTo(Time t) {
		if(hour > t.hour) return 1;
		if(hour < t.hour) return -1;
		if(minute > t.minute) return 1;
		if(minute < t.minute) return -1;
		if(second > t.second) return 1;
		if(second < t.second) return -1;
		return 0;
	}
	public String toString() {
		String H = String.valueOf(hour);
		String M = String.valueOf(minute);
		String S = String.valueOf(second);
		if(hour < 10) H = '0'+H;
		if(minute<10) M = '0'+M;
		if(second<10) S = '0'+S;
		return String.format("%s:%s:%s", H, M, S);
	}
}
