package learningPollymorphism;

public class LearningOverLoad {

	public static void main(String[] args) {
		LearningOverLoad ovl = new LearningOverLoad();
		ovl.test("I am in test1");
		ovl.test("I am in test2", 10);
	}
	
	public void test(String s){
		System.out.println(s);
	}
	public void test(String s, int a){
		System.out.println(s+ " " +a);
	}

}
