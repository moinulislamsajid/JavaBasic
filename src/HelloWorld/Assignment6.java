package HelloWorld;

import java.util.Scanner;

public class Assignment6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int digit;
		System.out.print("Enter Any Digit between (0-9) : ");
		digit = input.nextInt();
		if(digit==0) {
			System.out.println("zero");
		}
		else if(digit==1) {
			System.out.println("one");
		}
		else if(digit==2) {
			System.out.println("two");
		}
		else if(digit==3) {
			System.out.println("three");
		}
		else if(digit==4) {
			System.out.println("four");
		}
		else if(digit==5) {
			System.out.println("five");
		}
		else if(digit==6) {
			System.out.println("six");
		}
		else if(digit==7) {
			System.out.println("seven");
		}
		else if(digit==8) {
			System.out.println("eight");
		}
		else if(digit==9) {
			System.out.println("nine");
		}
		else {
			System.out.println("Invalid digit");
		}
	}

}
