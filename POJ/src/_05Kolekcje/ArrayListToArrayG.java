package _05Kolekcje;

import java.util.ArrayList;

class ArrayListToArrayG {
	public static void main(String args[]) {

		ArrayList<Integer> a1 = new ArrayList<Integer>();

		a1.add(new Integer(1));
		a1.add(new Integer(2));
		a1.add(new Integer(3));
		a1.add(new Integer(4));
//		a1.add("AAAA");

		System.out.println("Zawartosc a1: " + a1);

		Integer ia[] = {new Integer(0), new Integer(0), new Integer(0),
				new Integer(0)};
		ia = a1.toArray(ia);

		int sum = 0;

		for (int i = 0; i < ia.length; i++)
			sum += ia[i].intValue();

		System.out.println("Suma = " + sum);
		a1.stream().forEach(e -> System.out.println(e));
	}
}
