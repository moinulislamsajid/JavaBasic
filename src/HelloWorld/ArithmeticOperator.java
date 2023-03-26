package HelloWorld;

import java.util.Scanner;

public class ArithmeticOperator {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner addition = new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter First  Number : ");
		num1 = addition.nextInt();
		System.out.println("Enter Second  Number : ");
		num2 =  addition.nextInt();
		//int sum = num1 + num2;
		System.out.printf("Sum is  : %d\n",num1+num2);
		double local = (double)num1/num2;
		System.out.printf("Division is  : %f",local);
		
		
		
	}

}
