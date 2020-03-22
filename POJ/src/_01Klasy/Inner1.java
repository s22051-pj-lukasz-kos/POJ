package _01Klasy;

class Outer1 {
	int xInOuterClass = 100;
	Inner1 inner = new Inner1();

	void test() {
		Inner1 inner = new Inner1();
		inner.x = 2;
		inner.display();
		this.inner.x = 3;
		System.out.println("this.inner.x = " + this.inner.x + " inner.x = " + inner.x);
//		Inner1.x = 11;
	}
	void printInner() {
		System.out.println("x = " + inner.x);
		inner.display();
	}
	class Inner1 {
		int x = 10;
		//int outer_x = 101;
		void display() {
			System.out.println("\n display: outer_x = " + xInOuterClass + "inner x = " + x + "\n");
		}
	}
}

class Inner1 {
	public static void main(String args[]) {
		Outer1 outer = new Outer1();

		outer.test();
		outer.inner.display();
		Object o = outer.inner;

	}
}
// UWAGA: Klasy wewnetrzne nie byly dostepne w SDK 1.0
//        Zostaly dodane dopiero do SDK 1.1. Wrocimy jeszcze do klas 
//        wewnerznych podczas omawiania obslugo zdarzen.
