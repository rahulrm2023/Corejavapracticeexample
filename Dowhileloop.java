
//Print numbers from 1 to 10 using a loop.

package Loop;

public class Table3 {
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);

	}

}

//Print numbers from 10 to 1.

package Loop;

public class Table4 {
	public static void main(String[] args) {
		int i = 10;
		do {
			System.out.println(i);
			i--;
		} while (i >= 1);
	}

}

//Print all even numbers between 1 and 50.

package Loop;

public class Evennumber {
	public static void main(String[] args) {
		int i = 1;
		do {
			if (i % 2 == 0) {
				System.out.println("Even number " + i);
				i++;
			}
		} while (i <= 50);

	}

}

//Print all odd numbers between 1 and 50.

package Loop;

public class Oddnumber {
	public static void main(String[] args) {
		int i = 1;
		do {
			if (i % 2 != 0) {
				System.out.println("Odd number " + i);
				i++;
			}
		} while (i <= 50);

	}

}

//Print the table of 5 using a loop.

package Loop;

public class TableShow {
	public static void main(String[] args) {
		int i = 5, n = 1;
		do {
			System.out.println(i * n);
			n++;
		} while (n <= 10);

	}

}

//Print the table of any number (e.g., n = 7).

package Loop;

public class Tableprint {
	public static void main(String[] args) {
		int i = 7, n = 1;
		do {
			System.out.println(i * n);
			n++;
		} while (n <= 10);

	}

}

//Print Hello 10 times.

package Loop;

public class Hello {
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println("Hello");
			i++;
		} while (i <= 10);

	}

}

//Print the sum of first 10 natural numbers.

package Loop;

public class Natural {
	public static void main(String[] args) {
int i = 1;
do {
System.out.println(i);
i++;
}while(i<=10);
System.out.println("Natural no ="i)
}
}
//Print the sum of even numbers from 1 to 100.

package Loop;

public class EvenNumber {
	public static void main(String[] args) {
		int sum = 0, i = 2;
		do {
			sum += i;
			i += 2;
			System.out.println(sum);
			i++;
		} while (i <= 100);

		System.out.println("sum =" + sum);

	}

}

//Print the sum of odd numbers from 1 to 100.

package Loop;

public class Number {
	public static void main(String[] args) {
		int sum = 0, i = 2;
		do {
			sum += i;
			i += 1;
			System.out.println(sum);
			i++;
		} while (i <= 100);

		System.out.println("sum =" + sum);

	}

}
