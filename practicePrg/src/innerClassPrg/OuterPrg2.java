package innerClassPrg;

class OuterPrg2 {
	class InnerPrg {
		public void method1() {
			System.out.println("Inner class method");
		}
	}

	public void method2() {
		new InnerPrg().method1();

	}

	public static void main(String[] args) {
		System.out.println("From Outer class");

		new OuterPrg2().method2();

	}

}
