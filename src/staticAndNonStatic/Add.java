package staticAndNonStatic;

public class Add {
	public static  int add(int a,int b) {
		//int a,b;
	/*	int a = 10;
		int b = 20;*/
		int add = a + b;
		System.out.println(add);
		Multiply.multiply();
		return add;
	}
}