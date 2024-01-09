package problem5;

public class Test {

	public static void main(String[] args) {
		//		Integer[] a = {10, 5, 3, 12, 2, 23};
		Time[] a = {new Time(12, 45, 22), new Time(9, 45, 22), new Time(12, 45, 23), new Time(19, 0, 22), new Time(0, 0, 0)};
		
		
		Sort.bubbleSort(a);

		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
