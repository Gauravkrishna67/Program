package learningConstructor;

public class ParentConstrutorClass {
	public void plot() {
		System.out.println("I am in parrent plot");
	}

	public void car() {
		System.out.println("I am having parrent car");
	}

	public ParentConstrutorClass() {
		System.out.println("I am having both plot and car");
	}
	public ParentConstrutorClass(int i){
		
	}

	public static void main(String[] args) {
		ParentConstrutorClass p = new ParentConstrutorClass();
	}
}
