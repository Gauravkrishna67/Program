package learningInterfaceAndAbstract;

public class AppaloHospital extends FortisHospital implements Hospital {

	public static void main(String[] args) {
		AppaloHospital AH = new AppaloHospital();
		AH.Scanning();
		AH.Scanning(1000);
		AH.Medicien();
		AH.Consultant();
	}

	@Override
	public void Scanning() {
		System.out.println("Appalo Scanning");
	}

	@Override
	public void Scanning(int i) {
		System.out.println("Appalo Scanning");
	}

	@Override
	public void Medicien() {
		System.out.println("Appalo Medicien");
	}

	@Override
	public int Consultant() {
		System.out.println("Appalo Consultant");
		return 0;
	}

	@Override
	public void BloodTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Scanning1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Test2() {
		// TODO Auto-generated method stub
		
	}

}
