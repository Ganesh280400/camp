
public class MethOveride2 extends MethOveride {
	public void getInfo(int aadhar) {
		System.out.println("name :: ganesh");
		System.out.println("name :: bujji");
		System.out.println("name :: chinna");
		System.out.println("name :: govind");
		System.out.println("name :: venu Gopal");
		System.out.println("name :: dhana");

	}

	public static void main(String[] args) {
		MethOveride mo = new MethOveride();
		mo.getInfo(52);

		MethOveride2 mo2 = new MethOveride2();
		mo2.getInfo(35);

	}

}
