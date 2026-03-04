Test

1 int a = 10;
 a += 5;//15 
a -= 3;//12 
a *= 2;//24
 a /= 4;//6
 System.out.println(a);//6

2 int a = 5, b = 10, c = 15;
  System.out.println((a < b) && (b < c));//true && true = true 

System.out.println((a > b) || (b < c));//false ||true = true 
 System.out.println(!(a < c));//!(true )= false 

3 int x = 10, y = 20; 
  System.out.println(x++ + ++y);//(10+21)=31

4 int a = 5, b = 2;
 System.out.println(a % b);//5%2=1

5 int p = 7, q = 3;
  System.out.println(p * q + p / q);// (7*3+7/3) //21+2=23

6 int n = 5;
  System.out.println(++n + n++);//6+6=12

7 int x = 5, y = 10; 
    System.out.println(x > y ? x : y);// 10 because true condition is y 

8 int a = 10, b = 5 , c;
   c = a++ + --b + a * b;
  //11+ 4 +11*4=58
  System.out.println(c);//58

9 int a = 4, b = 2;
  System.out.println(a << b);//16
//1 0 0 is shift the to bit of the left and give 1 0 0 0 0 

10 int a = 8, b = 2;
  //1 0 0 0 this is right shift and give  1 0 
   System.out.println(a >> b);// 2 

11 int a = 10;
    System.out.println(~a);// -11

12  int a = 5, b = 7; 
  // binary number is 
  // 101
  // 111 
  // it is perform and operation give 5
  System.out.println(a & b);//5

13  int a = 5, b = 7;
     //binary is 
     //101
    //111
    // it is perform or operation and give 7
     System.out.println(a | b);//



14  int a = 5, b = 7;
     //101
//111
// it is perform  xor operation and give 2
 System.out.println(a ^ b);//2

15  int a = 10;
     System.out.println(a++ + ++a + a--);//34
    //10+12+12=34

16  int a = 1;
       a += a++ + ++a;
       //1+= 2++ + 3++=5
        System.out.println(a);//5

17   int a = 5, b = 10; boolean result = (a < b) ? true : false;
        System.out.println(result);//true

18  int a = 5, b = 10;
      System.out.println(a == b);// false

19  int a = 3, b = 2;
        System.out.println(a * b + a / b);//(6+1)= 7

20    int a = 5; 
       a = a++ + ++a; 
       //=5+7
       System.out.println(a);//12

21  int a = 10, b = 5; 
      System.out.println(a > b && a != b);// true 

22  int x = 2, y = 3;
       x *= y + 1;
     //2 *=4 
      System.out.println(x);//8

23  int a = 5; 
       a += a -= a *= a;
       System.out.println(a);// -15

24   int a = 4, b = 3; 
       System.out.println(a > b ? a++ : ++b);// 4

25   int a = 5; 
        System.out.println(a++ + a++ + ++a);//19
                                //5 +6+8

26      int a = 2, b = 3; 
          System.out.println(a + b * a / b);// 6

27      int a = 10, b = 20; 
          System.out.println(a < b && b > a);//true 

28       int a = 6, b = 2; 
           System.out.println((a / b) * (a % b));//0

29   int a = 5, b = 10, c = 15; 
       System.out.println((a < b && b > c) || !(b < c));// false
      //(true && false )||false 
   // false|| false 
