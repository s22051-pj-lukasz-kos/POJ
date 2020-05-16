package _03Dziedziczenie;

class AA {
	int m() {
		return 1;
	}
	int test() {
		return m();
	}
	int testThis() {
		return this.test();
	}
}

class BB extends AA {
	int m() {
		return 2;
	}
	int testSuper() {
		return super.test();
	}
	//    int testSuper() { return this.test(); }
	//    int test() { return super.m();}
	int test() {
		return m();
	}
}

class CC extends BB {
	int m() {
		return 3;
	}
	int testSuper() {
		return super.m();
	}
//    int test() { return super.m();}

}

class DynWia {
	public static void main(String[] args) {
		AA a = new AA();
		BB b = new BB();
		CC c = new CC();
		System.out.println(a.test() + " " + a.testThis());
		System.out.println(b.test() + " " + b.testSuper() + " " + b.testThis());
		System.out.println(c.test() + " " + c.testSuper() + " " + c.testThis());
	}
}


// obj.methC() = C.methC(b)
// b.test() = B.test(b) => b.m() => B.m(b) = 2
// b.testThis() = B.testThis(b) => A.testThis(b) = b.test() = B.test(b) = b.m() = B.m(b) = 2
// c.testThis() => C.testThis(c)
//              => A.testThis(c)
//				=> c.test()
//				=> C.test(c)
//   			=> B.test(c)
//				=> c.m() = 3