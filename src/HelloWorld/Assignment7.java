package HelloWorld;

import java.util.Scanner;

public class Assignment7 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char ch;
		System.out.print("Do you love java y or n : ");
		ch = input.next().charAt(0);
		if(ch == 'y' || ch == 'Y') {
			System.out.println("You are java Lover");
		}
		else if(ch == 'n' || ch == 'N') {
			System.out.println("You are  not a java Lover");
		}
		else {
			System.out.print("Your input is not correct");
		}
		
	}

}
