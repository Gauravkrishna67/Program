package learningInterfaceAndAbstract;

public class GovermentHospital implements Hospital,Hospital1 {

	public static void main(String[] args) {
		GovermentHospital GH = new GovermentHospital();
		GH.Scanning();
		GH.Scanning(100);
		GH.Medicien();
		GH.Consultant();
		GH.BloodTest();
		GH.Test1();
		GH.Test2();
		GH.Scanning1();
	}

	@Override
	public void Scanning() {
		System.out.println("Goverment Scanning");
	}

	@Override
	public void Scanning(int i) {
		System.out.println("Goverment Scanning");
	}

	@Override
	public void Medicien() {
		System.out.println("Goverment Medicien");
	}

	@Override
	public int Consultant() {
		System.out.println("Goverment Consultant");
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
