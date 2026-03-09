Write a program to find the largest among three numbers.

package test;

public class LargeNum {

	public static void main(String[] args) {
                int largest;        
       int num 1 = 23, num2 =44, num3 =55 ;
         if (a >= b && a >= c) {
            largest = num 1;
        } else if (b >= a && b >= c) {
            largest = num 1;
        } else {
            largest = num 3;
        }

        System.out.println("Largest number is: " + largest);
    }
}


----------------------------------------------------------------------------------------------------------------
Write a program to display grade based on marks.
Example condition:
Marks ≥ 75 → Distinction
Marks ≥ 60 → First Class
Marks ≥ 50 → Second Class
Marks ≥ 35 → Pass
Otherwise → Fail


public class Grade {

	public static void main(String[] args) {
        int mark = 60 ; 
          if (mark <= 100 && mark >=75)  {
              System.out.println("Distinction");
     } 
       else if (mark <=74 && mark >= 60){
      System.out.println("First Class");
}
   else if (mark <= 59 && mark >= 50 ){
      System.out.println("Second Class") ; 
}  
        else if (mark <=49 && mark > =35){
      System.out.println(" pass ");
}
    else{
    System.out.println("fail  ...! ");
}
		

	}

}

-------------------------------------------------------------------------------------------------------------------------
Write a program to check whether a character is vowel, consonant, digit, or special character.

public class CharacterType {
    public static void main(String[] args) {

                char ch = 'A';

        if (ch >= '0' && ch <= '9') {
            System.out.println("The character '" + ch + "' is a Digit.");
        } 
        else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("The character '" + ch + "' is a Vowel.");
            } 
            else {
                System.out.println("The character '" + ch + "' is a Consonant.");
            }

        } 
        else {
            System.out.println("The character '" + ch + "' is a Special Character.");
        }
    }
}


-------------------------------------------------------------------------------------------------------------------------
Write a program to display day name based on day number (1–7).

public class DayCheck1 {

	public static void main(String[] args) {
       int day = 5;
     if (day == 1){
     System.out.println("sunday");
 }
   else if (day == 2){
     System.out.println("monday");
 }
    else if (day == 3){
     System.out.println("tuesday");
 }
    else if (day == 4){
     System.out.println("wednesday");
 }
     else if (day == 5){
     System.out.println("thursday");
 }
    else if (day == 6){
     System.out.println("friday");
 }
   else if (day == 7){
     System.out.println("saturday");
 }

   else {
   System.out.println(" Enter the valid input ") ;
}
      
		

	}

}

------------------------------------------------------------------------------------------------------------------------------
Write a program to calculate electricity bill based on units.
Example:
0–100 → ₹5 per unit
101–200 → ₹7 per unit
Above 200 → ₹10 per unit

public class ill {

	public static void main(String[] args) {
        int unit  = 60  ;
                   if (unit <= 100 && unit >=0)  {
               int rate=5 ;
       bill= unit * rate;
              System.out.println("Bill"+bill);
     } 
       else if (unit <= 200&& unit >= 101){
int rate=7;
       bill= unit * rate;
      System.out.println("bill"+bill);
}
   else if (unit> 200 ){
int rate=10 ;
       bill= unit * rate;
      System.out.println("bill"+bill) ; 
}  
        }
    else{
    System.out.println(" Enter valid input   ...! ");
}
		

	}

}



---------------------------------------------------------------------------------------------------------------------------
Write a program to check whether a number is positive and even.

package test;

public class EvenPositive  {

	public static void main(String[] args) {
                 int num = 10 
 if  (num >=0){
      System.out.println("Positive Number ");
   if(num % 2 ==0){
    System.out.println("Even Number ");}
else {
System.out.println ("odd number ");}
}
else if (num <0) {
   System.out.println ("negative number");}
else{
System.out.println("zero");}
		

	}

}

--------------------------------------------------------------------------------------------------------------------------
Write a program to check whether a person is eligible for a loan.
Conditions :
Age ≥ 21
Salary ≥ 25000



public class Loan {

	public static void main(String[] args) {
                  int age = 22;
                  float salary = 39000;
         if (age>=21){
             System.out.println("Frist step clear");
            if(salary>=25){
               System.out.println("Approve the loan ");
}
}
        else{
          System.out.println("Your age is less than 21 year ");}
		

	}

}


-------------------------------------------------------------------------------------------------------------------------------
Write a program to check whether a year is a leap year.

public class Leapyear {

	public static void main(String[] args) {
         int year = 2030 ;
      if ((year % 4 == 0 && year %100 != 0) || year % 400 ==0){
            System.out.println("This is leap year ");
}
	else{
           System.out.println("This is not leap year ");
}	

	}

}



-------------------------------------------------------------------------------------------------------------------------------
Write a program to check login authentication (username and password).
package test;

public class PracticeQuestion {

	public static void main(String[] args) {
                       int username= 1123;
         String password = "Ram@123";
            if (username == true && passward == true ){
               System.out.println("login successfully")}
else{
    System.out.println("enter valid detail");}
		

	}

}


------------------------------------------------------------------------------------------------------------------------------------
Write a program to check whether a number is divisible by both 3 and 5.
package test;

public class Divide3and5 {

	public static void main(String[] args) {
                        int num =20;
           if (num % 3==0 && num % 5 ==0){
               System.out.println("number are divisible  by 3 and 5 ");}
              else{
                System.out.println("number are not divisible by 3 and 5")}
		

	}

}


