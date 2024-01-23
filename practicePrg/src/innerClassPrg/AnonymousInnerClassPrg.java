package innerClassPrg;

public class AnonymousInnerClassPrg {
	public void anonymousMethod() {
		System.out.println("Anonymous Method");
	}

}

class Test extends AnonymousInnerClassPrg {
	public void anonymousMethod() {
		System.out.println("Test class Method");
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.anonymousMethod();
	}

}