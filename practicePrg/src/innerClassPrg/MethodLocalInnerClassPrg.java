package innerClassPrg;

public class MethodLocalInnerClassPrg {
	public void method1() {
		class Inner {
			public void insideClassMethod(String name) {
				System.out.println("welcome  " + name);
			}

		}
		new Inner().insideClassMethod("BNT");
		new Inner().insideClassMethod("Soft");

	}
	public static void main(String[] args) {
		MethodLocalInnerClassPrg m= new MethodLocalInnerClassPrg();
		m.method1();
	}
}
