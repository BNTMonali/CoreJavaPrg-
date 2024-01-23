package innerClassPrg;

public class OuterPrg {
	int x = 10;
	static int y = 20;

	class InnerPrg {
		public void method1() {
			System.out.println("Inner class method");
			System.out.println(x);
			System.out.println(y);
		}
	}

	public static void main(String[] args) {
		System.out.println("From Outer class");

		// OuterPrg o =new OuterPrg();
		// OuterPrg.InnerPrg i = o.new InnerPrg();
		// i.method1();

		new OuterPrg().new InnerPrg().method1();

	}

}
