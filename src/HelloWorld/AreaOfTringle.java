package HelloWorld;

import java.util.Scanner;

public class AreaOfTringle {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double base,height,area;
		System.out.print("Enter Base : ");
		base = input.nextDouble();
		System.out.print("Enter height : ");
		height = input.nextDouble();
		area = 0.5 * base * height;
		System.out.println("Area of Triangle : "+area);
		

		

				
		
	}

}
