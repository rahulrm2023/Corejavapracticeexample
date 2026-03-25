package method.com;

public class Method {

	public static void main(String[] args) {
		Fibonacciserice obj = new Fibonacciserice();
		obj.Display();
		System.out.println("----------------");

		EvenNo e1 = new EvenNo();
		e1.show();
		System.out.println("----------------");

		ReverseNo rev = new ReverseNo();
		rev.display();
		System.out.println("---------------");

		Palindrome obj1 = new Palindrome();
		obj1.check();

		System.out.println("---------------");

		PrimeNo p1 = new PrimeNo();
		p1.checkPrime();
		

	}

}
