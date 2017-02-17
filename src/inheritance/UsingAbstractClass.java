package inheritance;

public class UsingAbstractClass extends LearningAbstractClass {

	public static void main(String[] args) {
		UsingAbstractClass ubc = new UsingAbstractClass();
		ubc.book();
		ubc.book1();
		ubc.car();
		ubc.mobile();
	}

	@Override
	public void book() {
		System.out.println("I am having book");
	}

	@Override
	public void book1() {
		System.out.println("I am having book1");
	}

}
