package Practice;

public class StaticExample {
	public static int mul(int a, int b) {
		int c = a * b;

		return c;
	}

	public static void main(String[] args) {
		int a = 156;
		int b = 890;
		int c = mul(a, b);
		System.out.println(c);
	}

	static {
		int x = 90;
		int y = 120;
		int z = x * y;
		System.out.println(z);
	}

}
