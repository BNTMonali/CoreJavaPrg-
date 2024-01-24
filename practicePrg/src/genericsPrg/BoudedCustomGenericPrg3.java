package genericsPrg;

public class BoudedCustomGenericPrg3 {
	public static void main(String[] args) {
		Gen<Integer> g1 = new Gen<>(100);
		Gen<Double> g2 = new Gen<>(100d);
		g1.show();
		System.out.println(g1.getOb());
		g2.show();
		System.out.println(g2.getOb());
	}

}

//x can be class or interface 
//if class can pass x or child classes 
//if interface can pass x or implementation classes
//class Generics<T extends Number & Runnable>--can passes in combination in order as class then interface
//<K,V>- can used any number of parameters ex. HashMap
class Generics<T extends Number> {

	T ob;

	Generics(T ob) {
		this.ob = ob;
	}

	public void show() {
		System.out.println("The type of ob " + ob.getClass().getName());
	}    

	public T getOb() {
		return ob;
	}
}