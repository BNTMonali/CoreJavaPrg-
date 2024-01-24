package genericsPrg;

public class CustomGenericPrg2 {

	public static void main(String[] args) {
		Gen<String> g1 = new Gen<>("BNT");
		g1.show();
		System.out.println(g1.getOb());
		
		Gen<Integer> g2 = new Gen<>(100);
		g2.show();
		System.out.println(g2.getOb());
	}

}

class Gen<T> {
	T ob;

	Gen(T ob) {
		this.ob = ob;
	}

	public void show() {
		System.out.println("The type of ob " + ob.getClass().getName());
	}

	public T getOb() {
		return ob;
	}
}
