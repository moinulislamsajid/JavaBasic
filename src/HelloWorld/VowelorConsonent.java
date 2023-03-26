package HelloWorld;

import java.util.Scanner;

public class VowelorConsonent {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char ch;
		System.out.print("Enter Any letter : ");
		ch = input.next().charAt(0); // ch = input.next().charAt(0);
		 if(ch == 'a') {
			System.out.print("Vowel");
		}
		else if(ch == 'e') {
			System.out.print("Vowel");
		}
		else if(ch == 'i') {
			System.out.print("Vowel");
		}
		else if(ch == 'o') {
			System.out.print("Vowel");
		}
		else if(ch == 'u') {
			System.out.print("Vowel");
		}
		else if(ch == 'A') {
			System.out.print("Vowel");
		}
		else if(ch == 'E') {
			System.out.print("Vowel");
		}
		else if(ch == 'I') {
			System.out.print("Vowel");
		}
		else if(ch == 'O') {
			System.out.print("Vowel");
		}
		else if(ch == 'U') {
			System.out.print("Vowel");
		}
		else {
			System.out.println("Consonant");
		}
	}
	

}
