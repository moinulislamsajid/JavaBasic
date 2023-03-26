package HelloWorld;

public class BitwiseOperator {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bitwise Operator
		
		// & Bitwise And
		// | Bitwise or
		// ^ Bitwise EXOR
		// >> Bitwise Shift Right
		// << Bitwise Shift Left
		// ~  Bitwise Not
		
		int a,b,c;
		a = 32;   // 22 which is value is binary
		b = 12;   // 12 which is value is binary
				  // than sum all of the binary value
		c = a&b;
		System.out.println("Bitwise And is : "+c);
		
		c = a | b;				// 22 which is value is binary
								// 12 which is value is binary
								// than perform the Bitwise or all of the binary value
		System.out.println("Bitwise Or is : "+c);
		
		
		c = a ^ b;
		System.out.println("Bitwise EXOR is : "+c);
		
		c = a >> 3;   		// 
		System.out.println("Bitwise Right shift : "+c);
		
		c = a << 3;
		System.out.println("Bitwise Left  shift : "+c);
		

	}

}
