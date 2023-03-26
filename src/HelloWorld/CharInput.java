package HelloWorld;

import java.util.Scanner;

public class CharInput {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char hey;
		hey = input.next().charAt(0);
		System.out.println("Hey : "+hey);

	}

}
