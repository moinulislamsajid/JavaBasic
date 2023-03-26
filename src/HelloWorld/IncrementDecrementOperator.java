package HelloWorld;

public class IncrementDecrementOperator {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 15;
		int y;
		y = x++; // post increment
		
		
		System.out.println("Post Increment y is : "+y);
		
		y = x;
		System.out.println("After post Increment : "+y);
		
        y = ++x; // post increment
		
		
		System.out.println("Post Increment y is : "+y);
		
		y = x;
		System.out.println("After post Increment : "+y);
		
		

	}

}
