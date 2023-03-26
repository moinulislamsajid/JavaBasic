 package HelloWorld;

import java.util.Scanner;

public class Conditional {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// syntax of conditional operator
		// expression ? expression : expression3
		// expression when true than the expression 2 is print or expression 3 print
		
		Scanner input = new Scanner(System.in);
		int num1,num2,x,y;
		System.out.print("Enter first number : ");
		num1 = input.nextInt();
		System.out.print("Enter second number : ");
		num2 = input.nextInt();
		x = (num1>num2)? num1 : num2;
		System.out.println("Maxium Number  is : "+x);
		y = (num2<num1) ? num2 : num1;
		System.out.println("Minium Number  is : "+y);
		
		
		
		
		
		
	}

}
