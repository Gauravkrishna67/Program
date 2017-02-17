package learningInterfaceAndAbstract;

public class FortisHospital  implements Hospital1{

	public static void main(String[] args) {
		FortisHospital FH = new FortisHospital();
		FH.Scanning();
		FH.Scanning(5000);
		FH.Medicien();
		FH.Consultant();
		FH.Medicien(50);
		FH.BloodTest();
		FH.Test1();
		FH.Test2();
		FH.Scanning1();
	}

	@Override
	public void Scanning() {
		System.out.println("Fortis Scanning");
	}

	@Override
	public void Scanning(int i) {
		System.out.println("Fortis Scanning");
	}

	@Override
	public void Medicien() {
		System.out.println("Fortis Medicien");
	}
	public void Medicien(int j) {
		System.out.println("Fortis Medicien");
	}

	@Override
	public int Consultant() {
		System.out.println("Fortis Consultant");
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
