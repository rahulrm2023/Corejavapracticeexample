// Check Number Range

//Write a Java program using switch case.

//Example:
//Input: number / 10

//0â€“3 â†’ Low
//4â€“7 â†’ Medium
//8â€“10 â†’ High

package SwitchExample;

public class NumberRange {

	public static void main(String[] args) {
		int input=10;
		switch (input) {
		case 0 ,1,2,3:
			System.out.println("low");
			break;
		case 4,5,6,7:
			System.out.println("medium");
			break;
		case 8,9,10:
			System.out.println("high");
			break;
			default:
				System.out.println("enter the valid input");
			
		}

	}

}
// Season Based on Month

//Write a Java program using switch case to print season.

//Example:
//Decâ€“Feb â†’ Winter
//Marâ€“May â†’ Summer
//Junâ€“Sep â†’ Monsoon
//Octâ€“Nov â†’ Autumn
//package SwitchExample;

public class SeasonCheck {

	public static void main(String[] args) {
	
				int check = 1;
				switch (check) {
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
//1. Check Character Case

//Write a Java program using switch case to check whether a character is:

//Uppercase

//Lowercase

	package SwitchExample;

public class UppreLowerCase {

	public static void main(String[] args) {
		char input = 'a';
		switch (input) {
		case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
				'v', 'w', 'x', 'y', 'z':
			System.out.println("Lower case");
			break;
		case 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
				'V', 'W', 'X', 'Y', 'Z':
			System.out.println("Upper case ");
			break;
			default:
				System.out.println("Enter the valid input  ");
		}

	}

}
// Vehicle Type

//Write a Java program using switch case.

//1 â†’ Bike
//2 â†’ Car
//3 â†’ Bus
//4 â†’ Truck

//Print vehicle type.

package SwitchExample;

public class VehicleName {

	public static void main(String[] args) {
		
				int num = 1;
				switch (num) {
				case 1:
					System.out.println("Bike ");
					break;
				case 2:
					System.out.println("Car");
					break;
				case 3:
					System.out.println("Bus");
					break;
				case 4:
					System.out.println("Truck");
					break;
					default:
						System.out.println("Enter the valid input ");
				}

			}

		}
// Check Password Strength Level

//Write a Java program using switch case.

//Input level number:

//1 â†’ Weak Password
//2 â†’ Medium Password
//3 â†’ Strong Password


package SwitchExample;

public class LevelCheck {

	public static void main(String[] args) {
				int num = 1;
				switch (num) {
				case 1:
					System.out.println("weak password ");
					break;
				case 2:
					System.out.println("medium password ");
					break;
				case 3:
					System.out.println("Strong password");
					break;
				
					default:
						System.out.println("Enter the valid input ");
				}

			}

		}
// Student Result Status

//Write a Java program using switch case.

//Input: Grade letter
//A â†’ Distinction
//B â†’ First Class
//C â†’ Second Class
//D â†’ Pass
//F â†’ Fail


package SwitchExample;

public class Gradesys {

	public static void main(String[] args) {
		char grade ='A';
		switch (grade) {
		case 'A':
			System.out.println("distriction");
			break;
		case 'B':
			System.out.println("first class");
			break;
		case 'C':
			System.out.println("Second class");
			break;
		case 'D':
			System.out.println("Pass");
			break;
		case 'F':
			System.out.println("Fail");
			break;
			default:
				System.out.println("Enter the valid input ");
			
		}
	}

} 
// Fruit Price Menu

//Write a Java program using switch case to display price of fruits.

//Example:
//1 â†’ Apple â‚¹100
//2 â†’ Mango â‚¹80
//3 â†’ Banana â‚¹40
//4 â†’ Orange â‚¹60

package SwitchExample;

public class FruitPrice {

	public static void main(String[] args) {
		String input = "Apple ";
		switch (input) {
		case "Apple ":
			System.out.println("Apple Price is 100");
			break;
		case "Mango ":
			System.out.println("Apple Price is 80");
			break;
		case "Banana":
			System.out.println("Banana Price is 40");
			break;
			case "Orange  ":
				System.out.println(" Orange Price is 60");
				break;
				default:
					System.out.println("Enter the valid input ");
			
		}

	}

}
// Simple Food Menu

//Write a Java program using switch case.

//1 â†’ Pizza
//2 â†’ Burger
//3 â†’ Sandwich
//4 â†’ Pasta

package SwitchExample;

public class FoodMenu {

	public static void main(String[] args) {
		int num = 1 ;
		switch (num) {
		case 1:
			System.out.println("Pizza");
			break;
		case 2:
			System.out.println("Burger");
			break;
		case 3:
			System.out.println("Sandwitch");
			break;
		case 4:
			System.out.println("Pasta");
			break;
			default:
				System.out.println("Enter the valid input ");
		}

	}

}
// Language Selection

//Write a Java program using switch case to display greeting message.

//Example:
//1 â†’ English â†’ Hello
//2 â†’ Hindi â†’ Namaste
//3 â†’ Marathi â†’ Namaskar

package SwitchExample;

public class Display {

	public static void main(String[] args) {
		String input = "English ";
		switch (input ) {
		case "English":
			System.out.println("Hello");
			break ;
		case "Hindi":
			System.out.println("Namaste");
			break ;
		case "Marathi":
			System.out.println("Namaskar");
			break ;
			default:
				System.out.println(" Enter the valid input ");
		}

	}

}
// Check Digit Name

//Write a Java program using switch case to display digit name.

//Example:
//0 â†’ Zero
//1 â†’ One
//2 â†’ Two
//â€¦
//9 â†’ Nine
package SwitchExample;

public class Digitname {

	public static void main(String[] args) {
		int digit= 1;
		switch (digit) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		case 8:
			System.out.println("eight");
			break;
		case 9:
			System.out.println("nine");
			break;
			default:
				System.out.println("Enter valid input ");
		}

	}

}
// Company Department

//Write a Java program using switch case.

//1 â†’ HR
//2 â†’ Finance
//3 â†’ IT
//4 â†’ Marketing

Print department name.

package SwitchExample;

public class Department {

	public static void main(String[] args) {
		int num = 1;
		switch (num) {
		case 1:
			System.out.println("HR");
			break;
		case 2:
			System.out.println("Finance");
			break;
		case 3:
			System.out.println("IT");
			break;
		case 4:
			System.out.println("Marketing");
			break;
			default:
				System.out.println("Enter the valid input ");
		}

	}

}
// Check Weekday or Weekend

//Write a Java program using switch case to check whether the day number represents:

//Weekday

//Weekend
package SwitchExample;
public class DayCheck {

	public static void main(String[] args) {
		int day = 1;
		switch (day) {

		case 1:
			System.out.println("Monday");
			System.out.println("weekday");
			break;
		case 2:
			System.out.println("Tuesday");
			System.out.println("weekday");
			break;
		case 3:
			System.out.println("wednesday");
			System.out.println("weekday");
			break;
		case 4:
			System.out.println("thursday");
			System.out.println("weekday");
			break;
		case 5:
			System.out.println("friday");
			System.out.println("weekday");
			break;
		case 6:
			System.out.println("saturday");
			System.out.println("weekend");
			break;
		case 7:
			System.out.println("sunday");
			System.out.println("weekend");
			break;
		default:
			System.out.println("Enter valid input");

		}

	}

}
// ATM Menu

//Write a Java program using switch case.

//1 â†’ Check Balance
//2 â†’ Withdraw Money
//3 â†’ Deposit Money
//4 â†’ Exit


package SwitchExample;

public class AtmSystem {

	public static void main(String[] args) {
		int amount = 1000;
		int check=1;
		switch(check) {
		case 1:
			System.out.println("balance ="+amount );
			break ;
			case 2:
				int withdraw= 1000;
				int newamount;
				newamount= amount - withdraw;
				System.out.println("amount is withdraw" );
				break ;
			case 3:
				System.out.println("Amount is deposite " );
				break ;
			case 4:
				System.out.println("exit the system " );
				break ;
				default:
					System.out.println(" Enter the valid input ");
		}
		
	}

}
// Check Arithmetic Operation Name

//Write a Java program using switch case to print operation name.

//Example:
//1 â†’ Addition
//2 â†’ Subtraction
//3 â†’ Multiplication
//4 â†’ Division

package SwitchExample;

public class ArithamaticOperator {

	public static void main(String[] args) {
	    int check = 1;
	    switch (check) {
	    case 1:
	    	System.out.println("Addition");
	    	break ;
	    case 2:
	    	System.out.println("Substraction");
	    	break ;
	    case 3:
	    	System.out.println("Multipliction");
	    	break ;
	    case 4:
	    	System.out.println("Division");
	    	break ;
	    	default:
	    		System.out.println("Enter the valid input ");
	    	
	    }

	}

}
// Area of Shapes

//Write a Java program using switch case.

//1 â†’ Square
//2 â†’ Circle
//3 â†’ Rectangle

Calculate area based on choice.
package SwitchExample;

public class AreaCheck {

	public static void main(String[] args) {
		float side=3.2f ,pi=3.14f, area , side1=2.1f;
		int num = 1;
		
		switch (num) {
		case 1:
			area=side * side;
			System.out.println("Area of square "+area);
			break;
		case 2:
			area=pi*side * side;
			System.out.println("Area of cirle "+area);
			break;
		case 3:
			area=side * side1;
			System.out.println("Area of rectangle "+area);
			break;
			default:
				System.out.println("Enter the valid input ");
		}

	}

}

	





