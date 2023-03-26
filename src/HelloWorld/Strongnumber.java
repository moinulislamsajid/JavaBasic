package HelloWorld;

import java.util.Scanner;

public class Strongnumber {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int temp,sum=0,num,rem;
		System.out.print("Enter Any number : ");
		num = input.nextInt();
		temp = num;
		while(temp>0) {
			
			rem = temp%10;
			int fact =1;
			for(int i =1; i<=rem; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			temp = temp/10;
		}
		if(sum==num)
		{
			System.out.print("This is Strong Number");
		}
		else
		{
		System.out.println("Not a Strong number");
	}

}
}
