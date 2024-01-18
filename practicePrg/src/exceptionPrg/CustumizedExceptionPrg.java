package exceptionPrg;

@SuppressWarnings("serial")
class CustumizedExceptionPrg extends RuntimeException {

	CustumizedExceptionPrg(String msg) {
		super(msg);
	}

}

@SuppressWarnings("serial")
class CustumizedExceptionPrg1 extends RuntimeException {

	CustumizedExceptionPrg1(String msg) {
		super(msg);
	}

}

class CustumizedExceptionMain {

	public static void main(String[] args) {
		int age = 10;
		if (age > 60) {
			throw new CustumizedExceptionPrg("TooYoung to marry");
		} else if (age < 18) {
			throw new CustumizedExceptionPrg1("TooOld to marry");
		} else {
			System.out.println("Thanks");
		}

	}

}