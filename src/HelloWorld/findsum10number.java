package HelloWorld;

import java.util.Scanner;

public class findsum10number {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number,sum =0,r;
		System.out.print("Enter 10 number : ");
		number = input.nextInt();
		for(int i =0; i<=number; i++) {
			r = number%10;
			sum = sum+r;
			number = number/10;
		}
		System.out.println("Sum is = "+sum);
	}

}
