//1 check number is even or odd
package controlstatement;

public class Day1 {

	public static void main(String[] args) {
		int num =10 ;
		if (num%2==0) {
			System.out.println("Number is even  " +num);
			

	}
		else {
			System.out.println("Number is odd"+num);
		}

}
}
//2 check a person can vote 
package controlstatement;

public class VoterId {

	public static void main(String[] args) {
		int age= 17;
		if (age >=18) {
			System.out.println("You can vote ");
		}
		else {
			System.out.println("You can not vote because your age is under 18");
		}
	}

}
//3 check number is positive or negative 
package controlstatement;

public class CheckNum {

	public static void main(String[] args) {
		int num=10;
		if (num >0) {
			System.out.println("Number is positive ");
		}
		else if (num < 0) {
			System.out.println("Number is negative ");
		}
		else {
			System.out.println("Number is zero");
		}

	}

}
//4 check number is positive or negative or zero
package controlstatement;

public class Numbercheck {

	public static void main(String[] args) {
		int num= 0;
		if (num >0) {
			System.out.println("Number is positive ");
		}
		else if (num < 0) {
			System.out.println("Number is negative ");
		}
		else {
			System.out.println("Number is zero");
		}

	}

}
//5 check year is leaf or not leaf year
package controlstatement;

public class CheckLeafYear {

	public static void main(String[] args) {
		int year = 2022; 
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("year is leaf year "+year );
		}
		else {
			System.out.println("year is not leaf year "+year);
		}
	}

}
//6 prin the greater one number in the two  number 
package controlstatement;

public class Greaternum {

	public static void main(String[] args) {
	 int number1=10	, number2=20;
	 if (number1 > number2) {
		 System.out.println("number 1 is greater than number 2");
	 }
	 else {
		 System.out.println("number 2 is greater than number 1");
	 }
	}

}
