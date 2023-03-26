package HelloWorld;

import java.util.Scanner;

public class LogicalOperator {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Logical Operator
		
		// && logical and
		// || logical or
		// !  logical not
		Scanner input = new Scanner(System.in);
		char ch;
		System.out.print("Enter any letter : ");
		ch = input.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'  ) {
			System.out.print("Here is Vowel");
		}
		else {
			System.out.println("Here is Consonant");
		}
		
	}

}
