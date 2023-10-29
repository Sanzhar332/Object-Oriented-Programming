 package problem1;

import java.util.Scanner;
public class Analyzer {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//System.out.println("Enter number (Q to quit): ");
		Data data = new Data();
		while(true) {
			System.out.print("Enter number (Q to quit): ");
			String value = input.nextLine();
			if(value.equals( "Q" ) || value.equals("q") ) {
				System.out.println(data.getAverage());
				System.out.println(data.getMax());
				break;
			}
			//System.out.println();
			data.add(Integer.parseInt(value));
		}
		input.close();
	}

}
