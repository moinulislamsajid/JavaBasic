package HelloWorld;

import java.util.Scanner;

public class Leepyear {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int year;
		System.out.print("Enter any years to cheack leep year or not : ");
		year = input.nextInt();
		if(year%400==0)
		{
			System.out.println("This is Leep year");
		}
		else if(year%4==0 && year%100!=0) {
			System.out.println("This is Leep year");
		}
		else {
			System.out.print("Not a Leep year");
		}
	}

}
