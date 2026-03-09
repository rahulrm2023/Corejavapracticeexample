Practise Questions :  

1. Write a program that checks if a person’s age is greater than 18, then print "Adult".
package test;

public class Check {

	public static void main(String[] args) {
           int age = 19;
         if (age>18){
            System.out.println("You are Adult");
}
		

	}

}
-------------------------------------------------------------------------------------------------
Write a program to check whether a number is divisible by 10.
package test;

public class CheckDivisible {

	public static void main(String[] args) {
         int num=11;
        if (num  % 10 == 0){
         System.out.println("Number is divisible by 10");
}
		

	}

}
--------------------------------------------------------------------------------------------
Write a program to check whether a temperature is above 30°C, then print "Hot Day".
package test;

public class Temperature {

	public static void main(String[] args) {
        float temperature = 38f;
      if (temperature > 30 ){
          System.out.println("Hot Day");
}

		

	}

}
-----------------------------------------------------------------------------------------------

Write a program to check whether a number is even or odd.
package test;

public class EvenOddNum {

	public static void main(String[] args) {
          int num = 11;
       if (num % 2 ==0){
           System.out.println("Even Number");
}
        else{
            System.out.println("Odd Number");
}

		

	}

}
---------------------------------------------------------------------------------------------------------------
Write a program to check whether a given year is leap year or not.
package test;

public class LeapYear {

	public static void main(String[] args) {
         int year = 2024 ;
      if ((year % 4 == 0 && year %100 != 0) || year % 400 ==0){
            System.out.println("This is leap year ");
}
	else{
           System.out.println("This is not leap year ");
}	

	}

}
---------------------------------------------------------------------------------------------------------------------
Write a program to check whether a number is positive or negative.
package test;

public class CheckNumber {

	public static void main(String[] args) {
       int num = 10 ;
           if (num > 0){
             System.out.println(" Positive Number");
}
        else{
         System.out.println("Negative Number ");
}
		

	}

}
------------------------------------------------------------------------------------------------------------------

Write a program to find grade of a student based  on marks:
90–100 → Grade A
75–89 → Grade B
50–74 → Grade C
35–49 → Grade D
Below 35 → Fail

package test;

public class Grade {

	public static void main(String[] args) {
        int mark = 50 ; 
          if (mark <= 100 && mark >=90)  {
              System.out.println("Grade A");
     } 
       else if (mark <=75 && mark >= 89){
      System.out.println("Grade B");
}
   else if (mark <= 74 && mark >= 50 ){
      System.out.println("Grade C") ; 
}  
    else if (mark <=49 && mark>= 35){
     System.out.println("Grade D "); 
    }
    else if (mark <=35 && mark > =0){
      System.out.println(" Fail ....!");
}
    else{
    System.out.println("Enter the valid input ");
}
		

	}

}
---------------------------------------------------------------------------------------------------------------------------
Write a program to print the day of the week based on day number (1–7).
package test;

public class DayCheck {

	public static void main(String[] args) {
       int day = 7;
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
-----------------------------------------------------------------------------------------------------------------------------
Write a program to check the type of triangle (Equilateral, Isosceles, or Scalene).
package test;

public class Triangle {

	public static void main(String[] args) {
     float side1 = 34 , side2 = 34 , side3 = 34 ;
     int angle1 = 60 , angle2 = 60 , angle3 = 60 ;
     total = angle1 + angle2 + angle3 ;
     if (side1==side2===side3 && angle1==angle2==angle3 && total==180 ){

         System.out.println(" Equilateral Triangle");
}  
     else if (side1==side2!=side3 || side2==side3!=side1 && angle1==angle2!=angle3 || angle1!=angle2==angle3 && total==180 ){

         System.out.println(" Isosceles Triangle");
}	
   else if (side1!=side2!=side3 && angle1!=angle2!=angle3 && total==180 ){

         System.out.println("   Scalene Triangle");
} 
    else {
     System.out.println("enter the valid inpur");} 
	

	}

}
-----------------------------------------------------------------------------------------------------------------------------

Write a program to print a message based on age group:

0–12 → Child
13–19 → Teenager
20–59 → Adult
60+ → Senior Citizen
package test;

public class AgeGroup {

	public static void main(String[] args) {
          int age = 6 ;
           if (age >=9 && age age <= 0 ){
              System.out.println("Child");
        }
         elseif (age >=19 && age age <= 13 ){
              System.out.println("Teenager");
        } else if (age >=59 && age age <= 20 ){
              System.out.println("Adult");
        } else if (age >=100 && age age <= 60){
              System.out.println("Senior Citizen");
        }  else{ 
              System.out.println(" Enter the valid input ");}



		

	}

}
-------------------------------------------------------------------------------------------------------------------------

Write a program to classify a temperature as Hot, Warm, Cool, or Cold.
package test;

public class Temperature {

	public static void main(String[] args) {
          float temp = 40 ;
        if (temp >=80 && temp <= 40){
            System.out.println("Hot Temperature"); 

}   else if (temp >=39 && temp <= 26){
            System.out.println("Warm Temperature"); 

}
    else  if (temp >=25 && temp <= 11){
            System.out.println("cool Temperature"); 

}
    else if (temp >=10 && temp <= -6){
            System.out.println("Cold Temperature"); 

}	

	}

}
---------------------------------------------------------------------------------------------------------------------
Write a program to check whether a number is positive, negative, or zero.
package test;

public class NumberCheck {

	public static void main(String[] args) {
         int num = 111 ;
		if (num >0){
                      System.out.println("Positive Number");
       } else if (num <0){
                      System.out.println("Negative  Number");
       } else if (num ==0){
                      System.out.println("Zero Number");
       }
         else {
            System.out.println("Enter valid input");}



	}

}
------------------------------------------------------------------------------------------------------------------------
Write a program to check if a person is eligible to vote, and if eligible, check if they can contest in elections (age ≥ 25).
package test;

public class Vote {

	public static void main(String[] args) {
                     int age = 33 ; 
       if (age >=18){
                      System.out.println("You Can vote  ");
   if (age >=25){
     System.out.println("Youy can contest in elections");}
       }
   else {
     System.out.println("You can not vote ")}

		

	}

}
-------------------------------------------------------------------------------------------------------------------------------
Write a program to check if a year is leap year, and if leap, check if it’s a century year.
package test;

public class LeapYear1 {

	public static void main(String[] args) {
         int year = 2000 ;
      if ((year % 4 == 0 && year %100 != 0) || year % 400 ==0){
            System.out.println("This is leap year ");
       if (){
         System.out.println();}
}
	else{
           System.out.println("This is not leap year ");
}	

	}

}
----------------------------------------------------------------------------------------------------------------------------------
Write a program to check whether a number is even, and if even, check whether it’s greater than 50.
package test;

public class Greaternum {

	public static void main(String[] args) {
                     int num1 = 30 ;
    if (num1 % 2 ==0){
                      System.out.println(" Even Number ");
      if (num1> 50){
                  System.out.println("Number is greater than 50");
}
       } else{
                         System.out.println("Odd Number ");
     
	
}	

	}

}

--------------------------------------------------------------------------------------------------------------------------------
