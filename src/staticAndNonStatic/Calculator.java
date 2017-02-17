package staticAndNonStatic;

public class Calculator {
	public static void main(String args[]) {
		//Add add = new Add();
		Substract substract = new Substract();
		int i = Add.add(10,20)+12;
		substract.substract();
		
	}
}
