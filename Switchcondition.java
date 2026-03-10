// Accept a category type (Domestic, Commercial, Industrial) and print the electricity rate per unit using a switch case.
package Switch.txt;

public class LightBill {

	public static void main(String[] args) {
		int unit=56;
		int rate ;
		float bill;
		String use ="Commerical";
		switch(use) {
		case "Domestic":
			rate =7;
		bill=unit*rate;
		System.out.println("Bill is = "+bill);
		break;
		case "Commerical":
			rate =10;
		bill=unit*rate;
		System.out.println("Bill is = "+bill);
		break;
		case "Industrial":
			rate =12;
		bill=unit*rate;
		System.out.println("Bill is = "+bill);
		break;
		default:
			System.out.println("Enter valid input ");
			
		}

	}

}
//   Accept a number (1–12) from the user and print the name of the month using a switch case.
package Switch.txt;

public class Checkmon {

	public static void main(String[] args) {

		int num = 1;
		switch (num) {
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("feb");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("Jun");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sep");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec ");
			break;
		default:
			System.out.println("Enter valid input ");
		}

	}

}
// Write a Java program that takes an integer (1–7) and prints the corresponding day name (e.g., 1 → Monday)


package Switch.txt;

public class DayCheck {

	public static void main(String[] args) {
		int day = 1;
		switch (day) {

		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("Enter valid input");

		}

	}

}
package Switch.txt;

public class EvenOdd {

	public static void main(String[] args) {
		int number = 13;
		switch (number % 2 ) {
		case 0:
			System.out.println("Even number");
			break;
		case 1 :
			System.out.println("Odd number");
			break;
		
		}

	}

}
//Take a grade character (A, B, C, D, F) as input and print a message:

//A → Excellent
//B → Good
//C → Average
//D → Poor
//F → Fail
package Switch.txt;

public class GradeCheck {

	public static void main(String[] args) {
		char grade = 'A';
		switch (grade) {
		case 'A':
			System.out.println("excellent");
			break;

		case 'B':
			System.out.println("good");
			break;

		case 'C':
			System.out.println("average");
			break;

		case 'D':
			System.out.println("poor");
			break;
		case 'F':
			System.out.println("fail");
			break;
		default:
			System.out.println("Enter valid input ");
		}

	}

}
//  Accept two numbers and an operator (+, -, *, /) from the user and perform the operation using a switch case.

package Switch.txt;

public class Operation {

	public static void main(String[] args) {
		int num1 = 10, num2 = 44;
		char operator = '+';
		switch (operator) {
		case '+':
			int c;
			c = num1 + num2;
			System.out.println("Addition = " + c);
			break;
		case '-':
			int f;
			f = num1 - num2;
			System.out.println("Addition = " + f);
			break;
		case '*':
			int e;
			e = num1 * num2;
			System.out.println("Multiply = " + e);
			break;
		case '/':
			int d;
			d = num1 / num2;
			System.out.println("Divide = " + d);
			break;
		default:
			System.out.println("Enter valid input ");

		}

	}

}


//  Take month number (1–12) and print the corresponding season:

//Dec–Feb → Winter
//Mar–May → Summer
//Jun–Aug → Monsoon
//Sep–Nov → Autumn


package Switch.txt;

public class SeasonCheck {

	public static void main(String[] args) {
		int num = 1;
		switch (num) {
		case 1:
			System.out.println("Jan ");
			System.out.println("season is Winter ");
			
			break;
		case 2:
			System.out.println("feb");
			System.out.println("season is Winter ");
			break;
		case 3:
			System.out.println("March");
			System.out.println("season is Summer ");
			break;
		case 4:
			System.out.println("April");
			System.out.println("season is Summer ");
			break;
		case 5:
			System.out.println("May");
			System.out.println("season is Summer ");
			break;
		case 6:
			System.out.println("Jun");
			System.out.println("season is Monsoon ");
			break;
		case 7:
			System.out.println("July");
			System.out.println("season is Monsoon ");
			break;
		case 8:
			System.out.println("Aug");
			System.out.println("season is Monsoon ");
			break;
		case 9:
			System.out.println("Sep");
			System.out.println("season is Autumn ");
			break;
		case 10:
			System.out.println("Oct");
			System.out.println("season is Autumn  ");
			break;
		case 11:
			System.out.println("Nov");
			System.out.println("season is Autumn  ");
			break;
		case 12:
			System.out.println("Dec ");
			System.out.println("season is Winter ");
			break;
		default:
			System.out.println("Enter valid input ");

	}
	}

}
//Input color name (Red, Yellow, or Green) and print the appropriate action:

//Red → Stop
//Yellow → Ready
//Green → Go

package Switch.txt;

public class Traffic {

	public static void main(String[] args) {
		String clr = "Red";
		switch (clr) {
		case "Red":
			System.out.println("Stop");
			break;
		case "Yellow":
			System.out.println("Ready to go ");
			break;
		case "Green":
			System.out.println("go ");
			break;
			default:
				System.out.println("Enter valid input ");
		}
		
	}

}
// Take a single character input and check whether it is a vowel or consonant using a switch statement.

package Switch.txt;

public class VowelCheck{
	public static void main(String[] args) {
		       char input ='a';
				switch(input) {
				case 'a' ,'e','i','o','u':
					System.out.println("it is vowel"+input);
				break;
				case 'A' ,'E','I','O','U':
					System.out.println("it is vowel"+input);
				break;
				
				default:
					System.out.println("Consonant"+input);
				
				}
				
			}

				
				}
	


