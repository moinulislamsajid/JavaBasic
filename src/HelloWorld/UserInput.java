package HelloWorld;

import java.util.Scanner;

public class UserInput {

	@SuppressWarnings({ "unused", "resource" })
	//@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Basic Syntax of java input 
		// Scanner VaribaleName = new Scanner(System.in);
		//Scanner Variable name = new Scanner(System.in);
		//Scanner Variable name = new Scanner (System.in);
		
		
		
		Scanner input = new Scanner(System.in);  
		//Scanner input = new Scanner(System.in);
		//Scanner input = new Scanner(System.in);
		
		// Than variable declared for retain information 
		int number;
		
		System.out.print("Enter any number : ");
		// This is retain information in user input
		number = input.nextInt();
		
		System.out.println("The Number is : "+number);
		int num;
		num = input.nextInt();
		System.out.println("The Number is : "+num);
		
}
}
