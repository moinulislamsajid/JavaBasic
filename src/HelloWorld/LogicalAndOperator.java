package HelloWorld;

import java.util.Scanner;

public class LogicalAndOperator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char ch;
		System.out.print("Enter any leter : ");
		ch = input.next().charAt(0);
		if(ch>='a' && ch<='z') {
			System.out.println("Small Leter");
		}
		else if(ch>='A' && ch<='Z') {
			System.out.println("Capital Leter");
		}
		else {
			System.out.println("Leter Input Error try again Thank You!");
		}
	}

}
