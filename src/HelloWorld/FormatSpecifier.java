package HelloWorld;
public class FormatSpecifier {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		float f = 10.345f;
		char c = 's';
		
		boolean b = true;
		String s = "Ayman Sajid";
		double d = 23.92;
		System.out.printf("Intiger Number is %d\n",num);
		System.out.printf("floting Number is %.2f\n",f);
		System.out.printf("boolean  is %b\n",b);
		System.out.printf(" Strings  is %s\n",s); // to print specifier in java data type in double use to %f format specifier
		System.out.printf("Double Number is %.3f\n",d);
		System.out.printf("char  is %c\n",c);

	}

}
