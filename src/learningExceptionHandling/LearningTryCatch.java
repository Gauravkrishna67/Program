package learningExceptionHandling;

public class LearningTryCatch {

	public static void main(String[] args) {
		try {
			int i = 5 / 0;
			System.out.println(i);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Hello");
	}

}
