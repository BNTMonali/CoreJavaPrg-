package prgCoreJava;

abstract class AbstractPrg {

	abstract void printInfo();
}

class employee extends AbstractPrg {
	void printInfo() {
		String name = "Monali";
		int age = 32;
		float salary = 25.2F;

		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
}

class base {
	public static void main(String args[]) {
		AbstractPrg s = new employee();
		s.printInfo();
	}
}
