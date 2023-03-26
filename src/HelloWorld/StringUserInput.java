package HelloWorld;

import java.util.Scanner;

public class StringUserInput {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner world = new Scanner(System.in);
		String name;
		System.out.print("Enter any name : ");
		name = world.nextLine();
		System.out.println("Welcome Mr. :*><>< ::* "+name);

}
}
