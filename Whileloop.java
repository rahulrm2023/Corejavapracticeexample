//while loop 
//Print numbers from 1 to 10 using a loop.
package Loop;

public class Number {

	public static void main(String[] args) {
int i = 1;
while( i<=10; ){
System.out.println(i);
i++;
}
		
	}

}

//Print numbers from 10 to 1.

package Loop;

public class Print {

	public static void main(String[] args) {
		int i = 10;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}

	}

}

//Print all even numbers between 1 and 50.

package Loop;

public class Even {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 50) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}

	}

}

//Print all odd numbers between 1 and 50.

package Loop;

public class Odd {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 50) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}

	}

}

//Print the table of 5 using a loop.

package Loop;

public class Table1 {

	public static void main(String[] args) {
		int n = 5, c, i = 1;
		;
		while (i <= 10) {
			c = n * i;
			System.out.println(c);
			i++;
		}

	}

}

//Print the table of any number (e.g., n = 7).

package Loop;

public class Number {

	public static void main(String[] args) {
		int i = 7, c, i = 1;
		while (i <= 10) {
			c = n * i;
			System.out.println(c);
			i++;
		}

	}

}

//Print Hello 10 times.

package Loop;

public class Hello {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println("Hello ");
			i++;
		}

	}

}

//Print the sum of first 10 natural numbers.

package Loop;

public class NaturalNumber {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

	}

}

//Print the sum of even numbers from 1 to 100.

package Loop;

public class SumEven {

	public static void main(String[] args) {
int sum =0 , i=1;
while( i<=100){
if (i % 2 == 0){
   sum += i
}
i++;

}
System.out.println(" sum of even number = "+ sum);

		
	}

}

//Print the sum of odd numbers from 1 to 100.

package Loop;

public class SumOdd {

	public static void main(String[] args) {
int add =0 , i = 1;
while( i<=100 ){
if (i % 2 != 0){
   add += i;
}
i++;

}
System.out.println(" sum of odd number = "+ add);


		
	}

}
