package _05Kolekcje;

import java.util.ArrayList;

class ArrayListDemoG {
	public static void main(String args[]) {

		ArrayList<String> a1 = new ArrayList<>();

		System.out.println("Poczatkowy rozmiar a1: " + a1.size() + " " + a1.isEmpty());

		a1.add("C");
		a1.add("A");
		a1.add("F");
		a1.add("E");
		a1.add("B");
		a1.add("D");
		a1.add("F");
		System.out.println("Zawartosc a1         : " + a1);
		a1.set(2, "X");
		System.out.println("Zawartosc a1         : " + a1);
		a1.add(2, "Q");
		// a1.add(3, new Integer(3));
		// System.out.println(a1.contains(new Integer(42)));
		//a1.add(10,"EE");
		System.out.println("Rozmiar po dodaniu   : " + a1.size());
		System.out.println("Zawartosc a1         : " + a1);

		a1.remove("F");
		System.out.println("Zawartosc a1(1F)     : " + a1);
		a1.remove("F");
		System.out.println("Zawartosc a1 (2F)    : " + a1);
		a1.remove(10);

		System.out.println("Po usunieciu         : " + a1.size());
		System.out.println("Zawartosc a1         : " + a1);
	}
}
