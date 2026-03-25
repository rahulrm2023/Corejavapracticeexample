package Parameter.com;

public class Fibonacciseric {
	public  void Display( int a ,int b) {
		int c;
		for (int i = 0; i <= 10; i++) {
			System.out.print(a + ",");
			c = a + b;
			a = b;
			b = c;

		}
	}

}
