package HelloWorld;

import java.util.Scanner;

public class EvenOdd {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Enter Any number to check evan or odd : ");
		num = input.nextInt();
		if(num%2==0) {
			System.out.println("Evan Number");
	}
		else {
			System.out.println("Odd number");
		}

}
}
