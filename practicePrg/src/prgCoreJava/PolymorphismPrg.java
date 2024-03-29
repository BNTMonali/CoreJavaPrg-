package prgCoreJava;

public class PolymorphismPrg {
	class multiFunction {

		// Method 1
		// Multiplication of 2 numbers
		static int Multiply(int a, int b) {

			// Return product
			return a * b;
		}

		// Method 2
		// // Multiplication of 3 numbers
		static int Multiply(int a, int b, int c) {

			// Return product
			return a * b * c;
		}
	}

	// Class 2
	// Main class
	class Main {

		// Main driver method
		public static void main(String[] args) {

			// Calling method by passing input as in arguments
			System.out.println(multiFunction.Multiply(2, 4));
			System.out.println(multiFunction.Multiply(2, 7, 3));
		}
	}

}
