package HelloWorld;

import java.util.Scanner;

public class AreaOfCircle {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double radeius,area;
		System.out.print("Enter Radeius : ");
		radeius = input.nextDouble();
		area = 3.1416 * radeius * radeius;
		System.out.println("Area of Circle :: "+area);
	}

}
