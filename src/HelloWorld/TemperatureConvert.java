package HelloWorld;

import java.util.Scanner;

public class TemperatureConvert {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double f,c,result;
		System.out.print("Enter celsious : ");
		c = input.nextDouble();
		f = (c+1.8)+32;
		System.out.println("Fahrenheit : "+f);
		
		System.out.print("Enter Fahrenheit : ");
		c = input.nextDouble();
		c = (f-32)/1.8;
		System.out.println(" celsious: "+c);
		
	}

}
