package Prameter;
public class Main {

	public static void main(String[] args) {
		Fibonacciseric obj = new Fibonacciseric();
		obj.Display(11 , 12);
		System.out.println("----------------");

		EvenNo e1 = new EvenNo();
		e1.show(22);
		System.out.println("----------------");

		ReverseNo rev = new ReverseNo();
		rev.display(22);
		System.out.println("---------------");

		palindrome obj1 = new palindrome();
		obj1.check(11);

		System.out.println("---------------");

		PrimeNo p1 = new PrimeNo();
		p1.checkPrime(12);

	}

}
