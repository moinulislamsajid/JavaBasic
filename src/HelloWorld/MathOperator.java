package HelloWorld;

public class MathOperator {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Math class are different method
		
		
		int x = 20;
		int y = 10;
		int result;
		
		// Maximum Value
		
		System.out.println(Math.max(20,10)); // this is math class work also this Math max for intiger type
			// Math.  (ar modda onak class aca jai somay jai tah use korar sei somay seitah use kora jaba no problem)
	
		result = Math.min(20,10);
		System.out.print("Minimum Number is : "+result);
	
		int d = -10;
		result = Math.abs(d);
		System.out.println("\nAbsolute Value is : "+result);
		
		double power = Math.pow(5,2);
		System.out.print("Power id : "+power);
	}

}
