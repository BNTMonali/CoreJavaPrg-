package prgCoreJava;

class Animals {

	// field and method of the parent class
	String name;

	public void eat() {
		System.out.println("I can eat");
	}
}

// inherit from Animal
class InheritancePrg extends Animals {

	// new method in subclass
	public void display() {
		System.out.println("My name is " + name);
	}
}

class Main {
	public static void main(String[] args) {

		// create an object of the subclass
		InheritancePrg Animal1 = new InheritancePrg();

		// access field of superclass
		Animal1.name = "Tommy";
		Animal1.display();

		// call method of superclass
		// using object of subclass
		Animal1.eat();

	}
}
