package HelloWorld;

import java.util.Scanner;

public class AmstrongNumber {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int rem,sum =0,num;
		System.out.print("Enter a number : ");
		num = input.nextInt();
		int temp = num;
		while(temp>0)
		{
			rem = temp%10;
			sum = sum +  rem * rem * rem;
			temp = temp/10;
			
		}
		if(sum==num) {
			System.out.println("This is a Amstrong Number");
		}
		else
		{
			System.out.println("Not a Amsrong number");
		}
	}
	

}
