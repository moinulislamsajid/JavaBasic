package HelloWorld;

import java.util.Scanner;

public class AreaOfRectangular {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double length,weight;
		System.out.print("Enter Length : ");
		length = input.nextDouble();
		System.out.print("Enter Weight : ");
		weight = input.nextDouble();
		double area = length * weight;
		System.out.println("Area of Rectangular : "+area);
		
		
	}

}
