package HelloWorld;

import java.util.Scanner;

public class ifelse {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Enter any number : ");
		num = input.nextInt();
		if(num>0)
		{
			System.out.println("Positive Number");
			
		}
	
		else if(num<0) {
			System.out.println("Negative Number");
		}
		else
			System.out.println("Zero");
		
		
	    }

}
