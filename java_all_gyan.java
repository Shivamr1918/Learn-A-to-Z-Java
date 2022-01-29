// =4

// package com.company;

// public class CWH_04_literals {
//     public static void main(String[] args) {
//         byte age = 34;
//         int age2 = 56;
//         short age3 = 87;
//         long ageDino = 5666666666666L;
//         char ch = 'A';
//         float f1 = 5.6f;
//         double d1 = 4.66;

//         boolean a = true;
//         System.out.print(age);
//         String str = "Harry";
//         System.out.println(str);

//     }
// }


// =5

// package com.company;
// import java.util.Scanner;

// public class CWH_05_TakingInpu {
//     public static void main(String[] args) {
//         System.out.println("Taking Input From the User");
//         Scanner sc = new Scanner(System.in);
// //        System.out.println("Enter number 1");
// //        int a = sc.nextInt();
// //        float a = sc.nextFloat();
// //        System.out.println("Enter number 2");
// //        int b = sc.nextInt();
// //        float b = sc.nextFloat();

// //        int sum = a +b;
// //        float sum = a +b;
// //        System.out.println("The sum of these numbers is");
// //        System.out.println(sum);
// //        boolean b1 = sc.hasNextInt();
// //        System.out.println(b1);
// //        String str = sc.next();
//         String str = sc.nextLine();
//         System.out.println(str);

//     }
// }


// =6

// =7

// package com.company;

// import java.util.Scanner;

// public class CWH_Ch1_PS {
//     public static void main(String[] args) {
// //        Question1
// //        int a = 4;
// //        int b = 17;
// //        int c =6;
// //        int sum = a + b+c;
// //        System.out.println(sum);

// //        Question2
// //    float subject1 = 45;
// //    float subject2 = 95;
// //    float subject3 = 48;
// //    float cgpa = (subject1 + subject2 +subject3)/30;
// //    System.out.println(cgpa);

// //        Question 3
// //        System.out.println("What is your name");
// //        Scanner sc = new Scanner(System.in);
// //        String name = sc.next();
// //        System.out.println("Hello " + name + " have a good day!");

// //        Question 5
//         System.out.println("Enter your number");
//         Scanner sc = new Scanner(System.in);
//         System.out.println(sc.hasNextInt());
//     }

// }


// =8

// package com.company;

// public class CWH_Ch2_Operators {
//     public static void main(String[] args) {
//         // 1. Arithmetic Operators
//         int a = 4;
//         // int b = 6 % a; // Modulo Operator
//         // 4.8%1.1 --> Returns Decimal Remainder

//         // 2. Assignment Operators
//         int b = 9;
//         b *= 3;
//         System.out.println(b);

//         // 3. Comparison Operators
//         // System.out.println(64<6);

//         // 4. Logical Operators
//         // System.out.println(64>5 && 64>98);
//         System.out.println(64>5 || 64>98);

//         // 5. Bitwise Operators
//         System.out.println(2&3);
//         //        10
//         //        11
//         //        ----
//         //        10
//     }
// }


// =9

// package com.company;

// public class cwh_09_ch2_op_pre {
//     public static void main(String[] args) {
//         // Precedence & Associativity

//         //int a = 6*5-34/2;
//         /*
//         Highest precedence goes to * and /. They are then evaluated on the basis
//         of left to right associativity
//             =30-34/2
//             =30-17
//             =13
//          */
//         //int b = 60/5-34*2;
//         /*
//             = 12-34*2
//             =12-68
//             =-56
//          */

//         //System.out.println(a);
//         //System.out.println(b);

//         // Quick Quiz
//         int x =6;
//         int y = 1;
//         //  int k = x * y/2;

//         int b = 0;
//         int c = 0;
//         int a = 10;
//         int k = b*b - (4*a*c)/(2*a);
//         System.out.println(k);

//     }
// }


// =10

// package com.company;

// public class cwh_10_resulting_data_type {
//     public static void main(String[] args) {
//         /* byte x = 5;
//         int y = 6;
//         short z = 8;
//         int a = y + z;
//         float b = 6.54f + x;
//         System.out.println(b); */

//         // Increment and Decrement Operators
//         int i = 56;
//         // int b = i++; // first b is assigned i (56) then i is incremented
//         int j = 67;
//         int c = ++j; // first j is incremented then c is assigned j (68)
//         System.out.println(i++);
//         System.out.println(i);
//         System.out.println(++i);
//         System.out.println(i);
//         int y = 7;
//         System.out.println( ++y *8);
//         char ch = 'a';
//         System.out.println(++ch);
//     }
// }



// =11

// package com.company;
// import java.util.Scanner;

// public class cwh_11_ex1_sol {


//     public static void main(String[] args) {

//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter your Physics marks : ");
//         int physics = scan.nextInt();
//         System.out.println("Enter your English marks : ");
//         int English = scan.nextInt();
//         System.out.println("Enter your Chemistry marks : ");
//         int chemistry = scan.nextInt();
//         System.out.println("Enter your Mathematics marks : ");
//         int mathematics = scan.nextInt();
//         System.out.println("Enter your Computer Science marks : ");
//         int computer = scan.nextInt();

//         float percentage = ((physics + English + chemistry + mathematics + computer)/500.0f)*100;

//         System.out.println("percentage : ");
//         System.out.println(percentage);


//     }
// }

// =12

// float a = 7/4 * 9/2

// (v^2-u^2)/2as

// int x = 7
// int a = 7*49/7 + 35/7

// package com.company;

// public class cwh_12_ps2_pr01 {
//     public static void main(String[] args) {
//         float a = 7/4.0f * 9/2.0f;
//         System.out.println(a);
//     }
// }

// package com.company;

// public class cwh_12_ps2_pr02 {
//     public static void main(String[] args) {
//         char grade = 'B';
//         grade = (char)(grade + 8);
//         System.out.println(grade);
//         // Decrypting the grade
//         grade = (char)(grade - 8);
//         System.out.println(grade);
//     }
// }


// package com.company;
// import java.util.Scanner;

// public class cwh_12_ps2_pr_03 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         System.out.println(a>8);
//         System.out.println(7*49/7+35/7);
//     }
// }


// =13

// char[] str = {'H','A','R','R','Y'};
// String s = new String(str);

// String s = "Harry";

// String <String_name> = "<sequence_of_string>";

//  String str = "CodeWithHarry";

// String s1= "String literal"

// String s=new String("Harry");

// String str1 = "CodeWithHarry";
// String str2 = "CodeWithHarry"
// System.out.println(str1 == str2); 

// String str1 = new String("Keep coding"); 
// String str2 = new String("Keep coding""); 
// System.out.println(str1 == str2); 

// System.out.printf("%c",ch)

// package com.company;
// import java.util.Scanner;

// public class cwh_13_strings {
//     public static void main(String[] args) {
//         // String name = new String("Harry");
//         // String name = "Harry";
//         // System.out.print("The name is: ");
//         // System.out.print(name);
//         int a = 6;
//         float b = 5.6454f;
//         System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
//         //System.out.format("The value of a is %d and value of b is %f", a, b);
//         Scanner sc = new Scanner(System.in);
// //        String st = sc.next();
// //        String st = sc.nextLine();
// //        System.out.println(st);

//     }
// }


// =14

// package com.company;

// public class cwh_14_string_methods {
//     public static void main(String[] args) {
//         String name = "Harry";
//         // System.out.println(name);
//         int value = name.length();
//         //System.out.println(value);

//         //String lstring = name.toLowerCase();
//         //System.out.println(lstring);

//         //String ustring = name.toUpperCase();
//         //System.out.println(ustring);

//         //String nonTrimmedString = "     Harry     ";
//         //System.out.println(nonTrimmedString);

//         //String trimmedString = nonTrimmedString.trim();
//         //System.out.println(trimmedString);

//         //System.out.println(name.substring(1));
//         //System.out.println(name.substring(1,5));

//         //System.out.println(name.replace('r', 'p'));
//         //System.out.println(name.replace("r", "ier"));

//         //System.out.println(name.startsWith("Har"));
//         //System.out.println(name.endsWith("dd"));

//         //System.out.println(name.charAt(4));

//         //String modifiedName = "Harryrryrry";
//         //System.out.println(modifiedName.indexOf("rry"));
//         //System.out.println(modifiedName.indexOf("rry", 4));
//         //System.out.println(modifiedName.lastIndexOf("rry", 7));

//         //System.out.println(name.equals("Harry"));
//         System.out.println(name.equalsIgnoreCase("HarRY"));

//         System.out.println("I am escape sequence\tdouble quote");




//     }
// }


// =15

// package com.company;

// public class cwh_15_ps3 {
//     public static void main(String[] args) {
//         // Problem 1
//         //String name = "Jack Parker";
//         //name = name.toLowerCase();
//         //System.out.println(name);

//         // Problem 2
//         //String text = "To My     Friend";
//         //text = text.replace(" ", "_");
//         //System.out.println(text);

//         // Problem 3
//         String letter = "Dear <|name|>, Thanks a lot!";
//         letter = letter.replace("<|name|>", "Sachin");
//         System.out.println(letter);

//         // Problem 4
//         String myString = "This string contains double and  triple spaces";
//         System.out.println(myString.indexOf("  "));
//         System.out.println(myString.indexOf("   "));

//         // Problem 5
//         String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
//         System.out.println(myLetter);

//     }
// }


// =16

// int a = 29;
// if (a>18) {
// 	System.out.println(“You can drive”);
// }
// else{
//        System.out.println(“You are underage!");
// }


// /* if (condition1) {

//             //Statements;

// else if {

//             // Statements;

// }

// else {

//             //Statements

// } */

// =17

// package com.company;

// public class cwh_17_logical {
//     public static void main(String[] args) {
//         System.out.println("For Logical AND...");
//         boolean a = true;
//         boolean b = false;
// //        if (a && b){
// //            System.out.println("Y");
// //        }
// //        else{
// //            System.out.println("N");
// //        }

//         System.out.println("For Logical OR...");

// //        if (a || b){
// //            System.out.println("Y");
// //        }
// //        else{
// //            System.out.println("N");
// //        }

//         System.out.println("For Logical NOT");
//         System.out.print("Not(a) is ");
//         System.out.println(!a);
//         System.out.print("Not(b) is ");
//         System.out.println(!b);
//     }
// }


// =18

//  Switch(var) {
// 	Case C1:
// 		//Code;	
// 		break;
// 	Case C2:
// 		//Code;
// 		break;	
// 	Case C3:
// 		//Code
// 		break;
// 	default:
// 		//Code

 

// package com.company;
// import java.util.Scanner;

// public class cwh_18_elseif {
//     public static void main(String[] args) {
//         String var = "Saurabh";


//         switch (var) {
//             case "Shubham" -> {
//                 System.out.println("You are going to become an Adult!");
//                 System.out.println("You are going to become an Adult!");
//                 System.out.println("You are going to become an Adult!");
//             }
//             case "Saurabh" -> System.out.println("You are going to join a Job!");
//             case "Vishaka" -> System.out.println("You are going to get retired!");
//             default -> System.out.println("Enjoy Your life!");
//         }
//         System.out.println("Thanks for using my Java Code!");


//         /*
//         int age;
//         System.out.println("Enter Your Age");
//         Scanner sc = new Scanner(System.in);
//         age = sc.nextInt();
//         if (age>56){
//             System.out.println("You are experienced!");
//         }
//         else if(age>46){
//             System.out.println("You are semi-experienced!");
//         }
//         else if(age>36){
//             System.out.println("You are semi-semi-experienced!");
//         }
//         else{
//             System.out.println("You are not experienced");
//         }
//         if(age>2){
//             System.out.println("You are not a baby!");
//         }
//         */

//     }
// }


// =19

// int a = 10;
// if (a=11)
//         System.out.println(“I am 11”);
// else
//         System.out.println(“I am not 11”);

// package com.company;
// import java.util.Scanner;
// import java.util.Random;

// public class cwh_19_ch4_ps {
//     public static void main(String[] args) {
// //        Question 1:
// //        int a = 11;
// //        if(a=11){
// //
// //        }

//         // Question 2
// //        byte m1, m2, m3;
// //        Scanner sc = new Scanner(System.in);
// //        System.out.println("Enter your marks in Physics");
// //        m1 = sc.nextByte();
// //
// //        System.out.println("Enter your marks in Chemistry");
// //        m2= sc.nextByte();
// //
// //        System.out.println("Enter your marks in Mathematics");
// //        m3 = sc.nextByte();
// //        float avg = (m1+m2+m3)/3.0f;
// //        System.out.println("Your Overall percentage is: " + avg);
// //        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
// //            System.out.println("Congratulations, You have been promoted");
// //        }
// //        else{
// //            System.out.println("Sorry, You have not been promoted! Please try again.");
// //        }

//         // Question 3
// //        Scanner sc = new Scanner(System.in);
// //        System.out.println("Enter your income in Lakhs per annum");
// //        float tax = 0;
// //        float income = sc.nextFloat();
// //        if(income<=2.5){
// //            tax = tax + 0;
// //        }
// //        else if(income>2.5f && income <= 5f){
// //            tax = tax + 0.05f * (income - 2.5f);
// //        }
// //        else if(income>5f && income <= 10.0f){
// //            tax = tax + 0.05f * (5.0f - 2.5f);
// //            tax = tax + 0.2f * (income - 5f);
// //        }
// //        else if(income>10.0f){
// //            tax = tax + 0.05f * (5.0f - 2.5f);
// //            tax = tax + 0.2f * (10.0f - 5f);
// //            tax = tax + 0.3f * (income - 10.0f);
// //        }
// //
// //        System.out.println("The total tax paid by the employee is: " + tax);

// //        Question 4:

// //        Scanner sc = new Scanner(System.in);
// //        int day = sc.nextInt();
// //
// //        switch (day){
// //            case 1 -> System.out.println("Monday");
// //            case 2 -> System.out.println("Tuesday");
// //            case 3 -> System.out.println("Wednesday");
// //            case 4 -> System.out.println("Thursday");
// //            case 5 -> System.out.println("Friday");
// //            case 6 -> System.out.println("Saturday");
// //            case 7 -> System.out.println("Sunday");
// //        }

// //        Question 6
// //        Scanner sc = new Scanner(System.in);
// //        String website = sc.next();
// //        if(website.endsWith(".org")){
// //            System.out.println("This is an organizational website");
// //        }
// //        else if(website.endsWith(".com")){
// //            System.out.println("This is a Commercial website");
// //        }
// //        else if(website.endsWith(".in")){
// //            System.out.println("This is an Indian website");
// //        }
//     Random r = new Random();
//     int a = r.nextInt();
//         System.out.println(a);

//     }
// }


// =20

// =21

// int i=10;  
// while(i>0){  
// System.out.println(i);  
// i--;  
// }  

// /*
// while (Boolean condition)

// {

//             // Statements    -> This keeps executing as long as the condition is true.

// }
// */

// package com.company;

// public class cwh_21_ch5_loops {
//     public static void main(String[] args) {
//         System.out.println(1);
//         System.out.println(2);
//         System.out.println(3);

//         System.out.println("Using Loops:");
//         int i = 100;
//         while(i<=200){
//             System.out.println(i);
//             i++;
//         }
//         System.out.println("Finish Running While Loop!");

// //        while(true){
// //            System.out.println("I am an infinite while loop!");
// //        }
//     }
// }


// =22

// int i=1;  
// do{  
// System.out.println(i);  
// i++;  
// }while(i<=10); 

// /* do {

//             //code

// } while (condition);            //Note this semicolon */

// package com.company;

// public class cwh_22_ch4_do_while {
//     public static void main(String[] args) {
// //        int a = 0;
// //        while(a<5){
// //            System.out.println(a);
// //            a++;
// //        }
//         int b = 10;
//         do {
//             System.out.println(b);
//             b++;
//         }while(b<5);

//         int c = 1;
//         do{
//             System.out.println(c);
//             c++;
//         }while(c<=45);

//     }
// }


// =23

// /* for (initialize; check_bool_expression; update){

//             //code;

// } */

// for (i=7; i!=0; i--){

//             System.out.println(i);

// }

// package com.company;

// public class cwh_23_for_loop {
//     public static void main(String[] args) {
// //        for (int i=1; i<=10; i++){
// //            System.out.println(i);
// //        }
//         // 2i = Even Numbers = 0, 2, 4, 6, 8
//         // 2i+1 = Odd Numbers = 1, 3, 5, 7, 9
//         //int n = 3;
//         //for (int i =0; i<n; i++){
//         //    System.out.println(2*i+1);
//         //}

//         for(int i=5; i!=0; i--){
//             System.out.println(i);
//         }
//     }
// }


// =24

// public class CWH_break {  
// public static void main(String[] args) {  
//     //using for loop  
//     for(int i=10;i>0;i--){  
//         if(i==7){  
//             break;   //break the loop
//         }  
//         System.out.println(i);  
//     }  
// }  
// }  
// 10
// 9
// 8


// continue;

// public class CWH_continue {  
// public static void main(String[] args) {  
 
//     for(int i=7;i>0;i--){  
//         if(i==3){  
//             continue;//continue skips the rest statement
//         }  
//         System.out.println(i);  
//     }  
// }  
// }  
// 7
// 6
// 5
// 4
// 2
// 1


// package com.company;

// public class cwh_24_break_and_continue {
//     public static void main(String[] args) {
//         // Break and continue using loops!
// //        for (int i=0;i<50;i++){
// //            System.out.println(i);
// //            System.out.println("Java is great");
// //            if(i==2){
// //                System.out.println("Ending the loop");
// //                break;
// //            }
// //        }
// //        int i=0;
// //        do{
// //            System.out.println(i);
// //            System.out.println("Java is great");
// //            if(i==2){
// //                System.out.println("Ending the loop");
// //                break;
// //            }
// //            i++;
// //        }while(i<5);
// //        System.out.println("Loop ends here");


// //            for(int i=0;i<50;i++){
// //            if(i==2){
// //                System.out.println("Ending the loop");
// //                continue;
// //            }
// //                System.out.println(i);
// //                System.out.println("Java is great");
// //        }
//         int i=0;
//         do{
//             i++;
//             if(i==2){
//                 System.out.println("Ending the loop");
//                 continue;
//             }
//             System.out.println(i);
//             System.out.println("Java is great");

//         }while(i<5);
//         System.out.println("Loop ends here");
//     }
// }


// =25

// ****

// ***

// **

// *

// package com.company;

// public class cwh_25_practice_set_5 {
//     public static void main(String[] args) {
//         // Practice Problem 1
// //        int n = 4;
// //        for (int i=n; i>0; i--){
// //            for(int j=0;j<i;j++){
// //                System.out.print("*");
// //            }
// //            System.out.print("\n");
// //        }

//         // Practice Problem 2
// //        int sum=0;
// //        int n=4;
// //        for(int i=0;i<n;i++){
// //            sum = sum + (2*i);
// //        }
// //        System.out.print("Sum of even numbers is: ");
// //        System.out.println(sum);
//         // First 4 even numbers are - 0 2 4 6

//         // Practice Problem 3
// //        int n = 5;
// //        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
// //        for(int i=1;i<=10;i++){
// //            System.out.printf("%d X %d = %d\n", n, i, n*i);
// //        }

//         // Practice Problem 4
// //        int n = 10;
// //        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
// //        for(int i=10;i>=1;i--){
// //            System.out.printf("%d X %d = %d\n", n, i, n*i);
// //        }

//         // Practice Problem 6
// //        int n = 5;
// //        // What is factorial n = n * n-1 * n-2 ..... 1
// //        // 5! = 5*4*3*2*1 = 120
// //        int i = 1;
// //        int factorial = 1;
// //        while(i<=n){
// //            factorial *= i;
// //            i++;
// //        }
// //        System.out.println(factorial);

//         // Practice Problem 9
// //        int n = 8;
// //        int sum = 0;
// //        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
// //        for(int i=1;i<=10;i++){
// //            sum += n*i;
// //        }
// //        System.out.println(sum);

//     }
// }


// =26

// /* marks[0] = 100       //Note that index starts from 0
// marks[1] = 70
// .                                  
// .
// marks[4] = 98 */

// marks.length //Gives 5 if marks is a reference to an array with 5 elements

// package com.company;

// public class cwh_26_arrays {
//     public static void main(String[] args) {
//         /* Classroom of 500 students - You have to store marks of these 500 students
//         You have 2 options:
//         1. Create 500 variables
//         2. Use Arrays (recommended)
//         */
//         // There are three main ways to create an array in Java
//         // 1. Declaration and memory allocation
//         // int [] marks = new int[5];

//         // 2. Declaration and then memory allocation
//         // int [] marks;
//         // marks = new int[5];
//         // Initialization
//         // marks[0] = 100;
//         // marks[1] = 60;
//         // marks[2] = 70;
//         // marks[3] = 90;
//         // marks[4] = 86;

//         // 3. Declaration, memory allocation and initialization together
//         int [] marks = {98, 45, 79, 99, 80};

//         // marks[5] = 96; - throws an error
//         System.out.println(marks[4]);
//     }
// }


// =27

// /* for (int element:Arr) {
//             Sout(element);    //Prints all the elements
// } */

// class CWH_forEachLoop{  
//   public static void main(String args[]){  
//    //declaring an array  
//    int arr[]={1,2,3,3,4,5};  
//    //traversing the array with for-each loop  
//    for(int i:arr){  
//      System.out.println(i);  
//    }  
//  }   
// }  
// 1
// 2
// 3
// 4
// 5

// package com.company;

// public class cwh_27_arrays {
//     public static void main(String[] args) {

//         /*
//         float [] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
//         String [] students ={"Harry", "Rohan", "Shubham", "Lovish"};
//         System.out.println(students.length);
//         System.out.println(students[2]);
//         */

//         int [] marks = {98, 45, 79, 99, 80};
//         // System.out.println(marks.length);

//         // Displaying the Array (Naive way)
//         System.out.println("Printing using Naive way");
//         System.out.println(marks[0]);
//         System.out.println(marks[1]);
//         System.out.println(marks[2]);
//         System.out.println(marks[3]);
//         System.out.println(marks[4]);

//         // Displaying the Array (for loop)
//         System.out.println("Printing using for loop");
//         for(int i=0;i<marks.length;i++){
//             System.out.println(marks[i]);
//         }

//         // Quick Quiz: Displaying the Array in Reverse order (for loop)
//         System.out.println("Printing using for loop in reverse order");
//         for(int i=marks.length -1;i>=0;i--){
//             System.out.println(marks[i]);
//         }

//         // Quick Quiz: Displaying the Array (for-each loop)
//         System.out.println("Printing using for-each loop");
//         for(int element: marks){
//             System.out.println(element);
//         }

//     }
// }


// =28

// int [][] flats = new int[2][3]          //A 2-D array of 2 rows + 3 columns

// flats[0][0] = 100
// flats[0][1] = 101
// flats[0][2] = 102
// // … & so on!

// package com.company;

// public class cwh_28_multi_dim_arrays {
//     public static void main(String[] args) {
//         int [] marks; // A 1-D Array
//         int [][] flats; // A 2-D Array
//         flats = new int [2][3];
//         flats[0][0] = 101;
//         flats[0][1] = 102;
//         flats[0][2] = 103;
//         flats[1][0] = 201;
//         flats[1][1] = 202;
//         flats[1][2] = 203;

//         // Displaying the 2-D Array (for loop)
//         System.out.println("Printing a 2-D array using for loop");
//         for(int i=0;i<flats.length;i++){
//             for(int j=0;j<flats[i].length;j++) {
//                 System.out.print(flats[i][j]);
//                 System.out.print(" ");
//             }
//             System.out.println("");
//         }

//     }
// }


// =29

// package com.company;

// public class cwh_29_Practice_Set_6 {
//     public static void main(String[] args) {
//         // Practice Problem 1
//         /* float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//         float sum = 0;
//         for(float element:marks){
//             sum = sum + element;
//         }
//         System.out.println("The value of sum is " + sum);


//         // Practice Problem 2
//         float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//         float num = 45.57f;
//         boolean isInArray = false;
//         for(float element:marks){
//             if(num==element){
//                 isInArray = true;
//                 break;
//             }
//         }
//         if(isInArray){
//             System.out.println("The value is present in the array");
//         }
//         else{
//             System.out.println("The value is not present in the array");
//         }


//         // Practice Problem 3

//         float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//         float sum = 0;
//         for(float element:marks){
//             sum = sum + element;
//         }
//         System.out.println("The value of average marks is " + sum/marks.length);


//         // Practice Problem 4
//         int [][] mat1 = {{1, 2, 3},
//                          {4, 5, 6}};
//         int [][] mat2 = {{2, 6, 13},
//                          {3, 7, 1}};
//         int [][] result = {{0, 0, 0},
//                            {0, 0, 0}};

//         for (int i=0;i<mat1.length;i++){ // row number of times
//             for (int j=0;j<mat1[i].length;j++) { // column number of time
//                 System.out.format(" Setting value for i=%d and j=%d\n", i, j);
//                 result[i][j] = mat1[i][j] + mat2[i][j];
//             }
//         }

//         // Printing the elements of a 2-D Array
//         for (int i=0;i<mat1.length;i++){ // row number of times
//             for (int j=0;j<mat1[i].length;j++) { // column number of time
//                 System.out.print(result[i][j] + " ");
//                 result[i][j] = mat1[i][j] + mat2[i][j];
//             }
//             System.out.println(""); // Prints a new line
//         }

//         // Practice Problem 5
//         int [] arr = {1, 21, 3, 4, 5, 34, 67};
//         int l = arr.length;
//         int n = Math.floorDiv(l, 2);
//         int temp;

//         for(int i=0; i<n; i++){
//             // Swap a[i] and a[l-1-i]
//             // a   b   temp
//             // |4| |3| ||
//             temp = arr[i];
//             arr[i] = arr[l-i-1];
//             arr[l-i-1] = temp;
//         }

//         for(int element: arr){
//             System.out.print(element + " ");
//         }

//         // Practice Problem 6
//         int [] arr = {1, 2100, 3, 455, 5, 34, 67};
//         int max = Integer.MIN_VALUE;
//         for(int e: arr){
//             if(e>max){
//                 max = e;
//             }
//         }
//         System.out.println("the value of the maximum element in this array is: "+ max);

//         // Practice Problem 6
//         System.out.println(Integer.MIN_VALUE);
//         System.out.println(Integer.MAX_VALUE);
//         */
//         // Practice Problem 7
//         boolean isSorted = true;
//         int [] arr = {1, 12, 3, 4, 5, 34, 67};
//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i] > arr[i+1]){
//                 isSorted = false;
//                 break;
//             }
//         }
//         if(isSorted){
//             System.out.println("The Array is sorted");
//         }
//         else{
//             System.out.println("The Array is not sorted");
//         }


//     }
// }
// 31

// package com.company;

// public class cwh_31_methods {

//     static int logic(int x, int y){
//         int z;
//         if(x>y){
//             z = x+y;
//         }
//         else {
//             z = (x +y) * 5;
//         }
//         x = 566;
//         return z;
//     }


//     public static void main(String[] args) {
//         int a = 5;
//         int b = 7;
//         int c;
//         // Method invocation using Object creation
//         //cwh_31_methods obj = new cwh_31_methods();
//         //c = obj.logic(a, b);
//         c = logic(a, b);
//         System.out.println(a + " "+ b);
//         int a1 = 2;
//         int b1 = 1;
//         int c1;
//         c1 = logic(a1, b1);
//         System.out.println(c);
//         System.out.println(c1);
//     }
// }

// =32

// package com.company;

// public class cwh_32_method_overloading {
//     static void foo(){
//         System.out.println("Good Morning bro!");
//     }

//     static void foo(int a){
//         System.out.println("Good morning " + a + " bro!");
//     }

//     static void foo(int a, int b){
//         System.out.println("Good morning " + a + " bro!");
//         System.out.println("Good morning " + b + " bro!");
//     }

//     static void foo(int a, int b, int c){
//         System.out.println("Good morning " + a + " bro!");
//         System.out.println("Good morning " + b + " bro!"); 
//     }

//     static void change(int a){
//         a = 98;
//     }

//     static void change2(int [] arr){
//         arr[0] = 98;
//     }
//     static void tellJoke(){
//         System.out.println("I invented a new word!\n" +
//                 "Plagiarism!");
//     }

//     public static void main(String[] args) {
//         // tellJoke();

//         // Case 1: Changing the Integer
//         //int x = 45;
//         //change(x);
//         //System.out.println("The value of x after running change is: " + x);

//         // Case 1: Changing the Array
//         // int [] marks = {52, 73, 77, 89, 98, 94};
//         // change2(marks);
//         // System.out.println("The value of x after running change is: " + marks[0]);


//         // Method Overloading
//         foo();
//         foo(3000);
//         foo(3000, 4000);
//         // Arguments are actual!


//     }
// }

// =33

// lass calculate {

//     static int add(int ...arr){
//         int result = 0;
//         for (int a : arr){
//             result = result + a;
//         }
//         return result;
// }

// public static void main(String[] args){
//     System.out.println(add(1,2));
//     System.out.println(add(2,3,4));
//     System.out.println(add(4,5,6));
// }
// }

// =34

// class recursion {
//     static void fun1(int n){
//         if(n>0){
//             System.out.println(n);
//             fun1(n-1);
//         }
// }
// public static void main(String[] args){
//         int n = 3;
//         fun1(n);
// }
// }


// package com.company;

// public class cwh_34_recursion {
//     // factorial(0) = 1
//     // factorial(n) = n * n-1 *....1
//     // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
//     // factorial(n) = n * factorial(n-1)

//     static int factorial(int n){
//         if(n==0 || n==1){
//             return 1;
//         }
//         else{
//             return n * factorial(n-1);
//         }
//     }
//     static int factorial_iterative(int n){
//         if(n==0 || n==1){
//             return 1;
//         }
//         else{
//             int product = 1;
//             for (int i=1;i<=n;i++){ // 1 to n
//                 product *= i;
//             }
//             return product;
//         }
//     }
//     public static void main(String[] args) {
//         int x = 0;
//         System.out.println("The value of factorial x is: " + factorial(x));
//         System.out.println("The value of factorial x is: " + factorial_iterative(x));
//     }
// }


// =35

// package com.company;

// public class cwh_35_practice_set_on_methods {
//     static void multiplication(int n) {
//         for (int i = 1; i <= 10; i++) {
//             System.out.format("%d X %d = %d\n", n, i, n * i);
//         }
//     }

//     static void pattern1(int n) {
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < i + 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     static void pattern1_rec(int n) {
//         if (n > 0) {
//             pattern1_rec(n - 1);
//             for (int i = 0; i < n; i++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     // pattern1_rec(3)
//     // pattern1_rec(2) + 3 times star and new line
//     // pattern1_rec(1) + 2 times star and new line + 3 times star and new line
//     // pattern1_rec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line


//     // sum(n) = 1 + 2 + 3... + n
//     // sum(n) = 1 + 2 + 3... + n-1 + n
//     // sum(n) = sum(n-1) + n
//     // sum(3) = 3 + sum(2)
//     // sum(3) = 3 + 2 + sum(1)
//     // sum(3) = 3 + 2 + 1
//     static int sumRec(int n) {
//         // Base condition
//         if (n == 1) {
//             return 1;
//         }
//         return n + sumRec(n - 1);
//     }

//     static int fib(int n) {
//         /* if(n==1){
//             return 0;
//         }
//         else if(n==2){
//             return 1;
//         } */
//         if (n == 1 || n == 2) {
//             return n - 1;
//         } else {
//             return fib(n - 1) + fib(n - 2);
//         }
//     }

//     public static void main(String[] args) {
//         // Problem 1
//         // multiplication(7);

//         // Problem 2
//         // pattern1(9);

//         // Problem 3
//         // int c = sumRec(4);
//         // System.out.println(c);

//         // Problem 4
//         // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
//         // int result = fib(7);
//         // System.out.println(result);

//         // Problem 8
//         pattern1(9);

//     }
// }


// =36

// =37

// =38

// package com.company;

// class Employee{
//     int id;
//     int salary;
//     String name;
//     public void printDetails(){
//         System.out.println("My id is " + id);
//         System.out.println("and my name is "+ name);
//     }

//     public int getSalary(){
//         return salary;
//     }
// }

// public class cwh_38_custom_class {
//     public static void main(String[] args) {
//         System.out.println("This is our custom class");
//         Employee harry = new Employee(); // Instantiating a new Employee Object
//         Employee john = new Employee(); // Instantiating a new Employee Object

//         // Setting Attributes for Harry
//         harry.id = 12;
//         harry.salary = 34;
//         harry.name = "CodeWithHarry";

//         // Setting Attributes for John
//         john.id = 17;
//         john.salary = 12;
//         john.name = "John Khandelwal";

//         // Printing the Attributes
//         harry.printDetails();
//         john.printDetails();
//         int salary = john.getSalary();
//         System.out.println(salary);
//         // System.out.println(harry.id);
//         // System.out.println(harry.name);
//     }
// }


// =39

// package com.company;

// class Employee{
//     int salary;
//     String name;

//     public int getSalary(){
//         return salary;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setName(String n){
//         name = n;
//     }
// }

// class CellPhone{
//     public void ring(){
//         System.out.println("Ringing...");
//     }
//     public void vibrate(){
//         System.out.println("Vibrating...");
//     }
//     public void callFriend(){
//         System.out.println("Calling Mukul...");
//     }

// }

// class Square{
//     int side;
//     public int area(){
//         return side*side;
//     }
//     public int perimeter(){
//         return 4*side;
//     }
// }

// class Tommy{
//     public void hit(){
//         System.out.println("Hitting the enemy");
//     }
//     public void run(){
//         System.out.println("Running from the enemy");
//     }
//     public void fire(){
//         System.out.println("Firing on the enemy");
//     }
// }
// public class cwh_39_ch8ps {
//     public static void main(String[] args) {
//         /*
//         // Problem 1
//         Employee harry = new Employee();
//         harry.setName("CodeWithHarry");
//         harry.salary = 233;
//         System.out.println(harry.getSalary());
//         System.out.println(harry.getName());

//         // Problem 2
//         CellPhone asus = new CellPhone();
//         asus.callFriend();
//         asus.vibrate();
//         //asus.ring();


//         // Problem 3
//         Square sq = new Square();
//         sq.side = 3;
//         System.out.println(sq.area());
//         System.out.println(sq.perimeter());
//          */

//         // Problem 5
//         Tommy player1 = new Tommy();
//         player1.fire();
//         player1.run();
//         player1.hit();


//     }
// }

// =40

// class Employee {

//     private int id;
//     private  String name;

//     public String getName(){
//         return name;
//     }
//     public void setName(String n){
//         name = n;
//     }
//     public void setId(int i){
//         id = i;
//     }
//     public int getId(){
//         return id;
//     }
// }

// public  class CWH {
//     public static void main(String[] args) {
//         Employee emp1 = new Employee();

//         emp1.setName("Shubham");
//         System.out.println(emp1.getName());
//         emp1.setId(1);
//         System.out.println(emp1.getId());

//     }
// }


// =41

// package com.company;

// import java.util.Random;
// import java.util.Scanner;

// public class cwh_41_ex2sol {
//     public static void main(String[] args) {
//         // 0 for Rock
//         // 1 for Paper
//         // 2 for Scissor

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
//         int userInput = sc.nextInt();

//         Random random = new Random();
//         int computerInput = random.nextInt(3);

//         if (userInput == computerInput) {
//             System.out.println("Draw");
//         }
//         else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
//                 || userInput == 2 && computerInput == 1) {
//             System.out.println("You Win!");
//         } else {
//             System.out.println("Computer Win!");
//         }
//         // System.out.println("Computer choice: " + computerInput);
//         if(computerInput==0){
//             System.out.println("Computer choice: Rock");
//         }
//         else if(computerInput==1){
//             System.out.println("Computer choice: Paper");
//         }
//         else if(computerInput==2){
//             System.out.println("Computer choice: Scissors");
//         }
//     }
// }


// =42

// class Employee {
// // First constructor
//     Employee(String s, int i){
//         System.out.println("The name of the first employee is : " + s);
//         System.out.println("The id of the first employee is : " + i);
//     }
// //    Constructor overloaded
//     Employee(String s, int i, int salary){
//         System.out.println("The name of the second employee is : " + s);
//         System.out.println("The id of the second employee is : " + i);
//         System.out.println("The salary of second employee is : " + salary);
//     }

// }
// public class CWH_constructors {
//     public static void main(String[] args) {
//         Employee shubham = new Employee("Shubham",1);
//         Employee harry = new Employee("Harry",2,70000);



//     }
// }


// package com.company;

// class MyMainEmployee{
//     private int id;
//     private String name;

//     public MyMainEmployee(){
//         id = 0;
//         name = "Your-Name-Here";
//     }
//     public MyMainEmployee(String myName, int myId){
//         id = myId;
//         name = myName;
//     }
//     public MyMainEmployee(String myName){
//         id = 1;
//         name = myName;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setName(String n){
//         this.name = n;
//     }
//     public void setId(int i){
//         this.id = i;
//     }
//     public int getId(){
//         return id;
//     }
// }

// public class cwh_42_constructors {
//     public static void main(String[] args) {
//         //MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);
//         MyMainEmployee harry = new MyMainEmployee();
//         //harry.setName("CodeWithHarry");
//         //harry.setId(34);
//         System.out.println(harry.getId());
//         System.out.println(harry.getName());
//     }
// }


// =43

// guess the number

// =44

// package com.company;


// class Cylinder{
//     private int radius;
//     private int height;

//     public Cylinder(int radius, int height) {
//         this.radius = radius;
//         this.height = height;
//     }

//     public int getRadius() {
//         return radius;
//     }

//     public void setRadius(int radius) {
//         this.radius = radius;
//     }

//     public int getHeight() {
//         return height;
//     }

//     public void setHeight(int height) {
//         this.height = height;
//     }
//     public double surfaceArea(){
//         return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
//     }
//     public double volume(){
//         return Math.PI * radius * radius * height;
//     }


// }

// class Rectangle{
//     private int length;
//     private int breadth;

//     public Rectangle() {
//         this.length = 4;
//         this.breadth = 5;
//     }

//     public Rectangle(int length, int breadth) {
//         this.length = length;
//         this.breadth = breadth;
//     }

//     public int getLength() {
//         return length;
//     }

//     public int getBreadth() {
//         return breadth;
//     }
// }

// public class cwh_44_ps09 {

//     public static void main(String[] args) {
//         /*
//         // Problem 1
//         Cylinder myCylinder = new Cylinder(9, 12);
//         //myCylinder.setHeight(12);
//         System.out.println(myCylinder.getHeight());
//         //myCylinder.setRadius(9);
//         System.out.println(myCylinder.getRadius());
//         // Problem 2
//         System.out.println(myCylinder.surfaceArea());
//         System.out.println(myCylinder.volume());
//          */


//         // Problem 3
//         Rectangle r = new Rectangle(12, 56);
//         System.out.println(r.getLength());
//         System.out.println(r.getBreadth());







//     }
// }


// =45

// package com.company;

// class Base{
//     public int x;

//     public int getX() {
//         return x;
//     }

//     public void setX(int x) {
//         System.out.println("I am in base and setting x now");
//         this.x = x;
//     }

//     public void printMe(){
//         System.out.println("I am a constructor");
//     }
// }

// class Derived extends Base{
//     public int y;

//     public int getY() {
//         return y;
//     }

//     public void setY(int y) {
//         this.y = y;
//     }
// }

// public class cwh_45_inheritance {
//     public static void main(String[] args) {
//         // Creating an Object of base class
//         Base b = new Base();
//         b.setX(4);
//         System.out.println(b.getX());

//         // Creating an object of derived class
//         Derived d = new Derived();
//         d.setY(43);
//         System.out.println(d.getY());
//     }
// }


// =46

// package com.company;

// class Base1{
//     Base1(){
//         System.out.println("I am a constructor");
//     }
//     Base1(int x){
//         System.out.println("I am an overloaded constructor with value of x as: " + x);
//     }
// }

// class Derived1 extends Base1{
//     Derived1(){
//         //super(0);
//         System.out.println("I am a derived class constructor");
//     }
//     Derived1(int x, int y){
//         super(x);
//         System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
//     }
// }

// class ChildOfDerived extends  Derived1{
//     ChildOfDerived(){
//         System.out.println("I am a child of derived constructor");
//     }
//     ChildOfDerived(int x, int y, int z){
//         super(x, y);
//         System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
//     }
// }
// public class cwh_46_constructors_in_inheritance {
//     public static void main(String[] args) {
//         // Base1 b = new Base1();
//         // Derived1 d = new Derived1();
//         // Derived1 d = new Derived1(14, 9);
//         // ChildOfDerived cd = new ChildOfDerived();
//         ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
//     }
// }


// =47
// class cwh{
//     int x;

// //    getter of x
//     public  int getX(){
//         return  x;
//     }

//     // Constructor with a parameter
//     cwh(int x) {
//         x = x;
//     }

//     // Call the constructor
//     public static void main(String[] args) {
//         cwh obj1 = new cwh(65);
//         System.out.println(obj1.getX());

//     }
// }

// class cwh{
//     int x;

// //    getter of x
//     public  int getX(){
//         return  x;
//     }

//     // Constructor with a parameter
//     cwh(int x) {
//         this.x = x;
//     }

//     // Call the constructor
//     public static void main(String[] args) {
//         cwh obj1 = new cwh(65);
//         System.out.println(obj1.getX());

//     }
// }

// package com.company; 
// import javax.print.Doc; 
// class EkClass{ 
// int a; 
// public int getA() { 
// return a; 
// } 
// EkClass(int a){ 
// this.a = a;
//  } 
// public int returnone(){
//  return 1; 
// } 
// } 
// class DoClass extends EkClass{ DoClass(int c){ super(c); 
// System.out.println("I am a constructor"); } 
// } 
// public class cwh_47_this_super { 
// public static void main(String[] args) {
//  EkClass e = new EkClass(65); 
// DoClass d = new DoClass(5); 
// System.out.println(e.getA()); } }

// =48


// class A{
//     public void meth1(){
//         System.out.println("I am method 1 of class A");
//     }
// }

// class B extends A{

// }
// public class CWH{
//     public static void main(String[] args) {
//         A a = new A();
//         a.meth1();

//         B b = new B();
//         b.meth1();
//     }
// }


// class A{
//     public void meth1(){
//         System.out.println("I am method 1 of class A");
//     }
// }

// class B extends A{
//     @Override
//     public void meth1(){
//         System.out.println("I am method 1 of class B");
//     }


// }
// public class CWH{
//     public static void main(String[] args) {
//         A a = new A();
//         a.meth1();

//         B b = new B();
//         b.meth1();
//     }
// }


// package com.company;

// class A{
//     public int a;
//     public int harry(){
//         return 4;
//     }
//     public void meth2(){
//         System.out.println("I am method 2 of class A");
//     }
// }

// class B extends A{
//     @Override
//     public void meth2(){
//         System.out.println("I am method 2 of class B");
//     }
//     public void meth3(){
//         System.out.println("I am method 3 of class B");
//     }
// }
// public class cwh_48_method_overriding {
//     public static void main(String[] args) {
//         A a = new A();
//         a.meth2();

//         B b = new B();
//         b.meth2();
//     }
// }


// =49

// class Phone{
//     public void showTime(){
//         System.out.println("Time is 8 am");
//     }
//     public void on(){
//         System.out.println("Turning on Phone...");
//     }
// }

// class SmartPhone extends Phone{
//     public void music(){
//         System.out.println("Playing music...");
//     }
//     public void on(){
//         System.out.println("Turning on SmartPhone...");
//     }
// }
// public class CWH {
//     public static void main(String[] args) {

//         Phone obj = new SmartPhone(); // Yes it is allowed
//         // SmartPhone obj2 = new Phone(); // Not allowed

//         obj.showTime();
//         obj.on();
//         // obj.music(); Not Allowed


//     }
// }


// package com.company;
// class Phone{
//     public void showTime(){
//         System.out.println("Time is 8 am");
//     }
//     public void on(){
//         System.out.println("Turning on Phone...");
//     }
// }

// class SmartPhone extends Phone{
//     public void music(){
//         System.out.println("Playing music...");
//     }
//     public void on(){
//         System.out.println("Turning on SmartPhone...");
//     }
// }
// public class cwh_49_dynamic_method_dispatch {
//     public static void main(String[] args) {
//         // Phone obj = new Phone(); // Allowed
//         // SmartPhone smobj = new SmartPhone(); // Allowed
//         // obj.name();

//         Phone obj = new SmartPhone(); // Yes it is allowed
//         // SmartPhone obj2 = new Phone(); // Not allowed

//         obj.showTime();
//         obj.on();
//         // obj.music(); Not Allowed


//     }
// }

// =50


// package com.company;
// import java.util.Random;
// import java.util.Scanner;

// class Game{
//     public int number;
//     public int inputNumber;
//     public int noOfGuesses = 0;

//     public int getNoOfGuesses() {
//         return noOfGuesses;
//     }

//     public void setNoOfGuesses(int noOfGuesses) {
//         this.noOfGuesses = noOfGuesses;
//     }

//     Game(){
//         Random rand = new Random();
//         this.number = rand.nextInt(100);
//     }
//     void takeUserInput(){
//         System.out.println("Guess the number");
//         Scanner sc = new Scanner(System.in);
//         inputNumber = sc.nextInt();
//     }
//     boolean isCorrectNumber(){
//         noOfGuesses++;
//         if (inputNumber==number){
//             System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
//             return true;
//         }
//         else if(inputNumber<number){
//             System.out.println("Too low...");
//         }
//         else if(inputNumber>number){
//             System.out.println("Too high...");
//         }
//         return false;
//     }

// }
// public class cwh_50_ex3sol {
//     public static void main(String[] args) {
//         /*
//             Create a class Game, which allows a user to play "Guess the Number"
//             game once. Game should have the following methods:
//             1. Constructor to generate the random number
//             2. takeUserInput() to take a user input of number
//             3. isCorrectNumber() to detect whether the number entered by the user is true
//             4. getter and setter for noOfGuesses
//             Use properties such as noOfGuesses(int), etc to get this task done!
//          */

//         Game g = new Game();
//         boolean b= false;
//         while(!b){
//         g.takeUserInput();
//         b = g.isCorrectNumber();
//         }

//     }
// }

// 51

// package com.company;

// public class cwh_51_exercise4 {
//     public static void main(String[] args) {
//         // You have to implement a library using Java Class "Library"
//         // Methods: addBook, issueBook, returnBook, showAvailableBooks
//         // Properties: Array to store the available books,
//         // Array to store the issued books
//         //
//     }
// }
 
//       52

// package com.company;

// class Circle{
//     public int radius;
//     Circle(){
//         System.out.println("I am non param of circle");
//     }
//     Circle(int r){
//         System.out.println("I am circle parameterized constructor");
//         this.radius = r;
//     }

//     public double area(){
//         return Math.PI*this.radius*this.radius;
//     }
// }

// class Cylinder1 extends Circle{
//     public int height;
//     Cylinder1(int r, int h){
//         super(r);
//         System.out.println("I am cylinder1 parameterized constructor");
//         this.height = h;
//     }
//     public double volume(){
//         return Math.PI*this.radius*this.radius*this.height;
//     }
// }
// public class cwh_52_ch10ps {
//     public static void main(String[] args) {
//         // Problem 1
//         // Circle objC = new Circle(12);
//         Cylinder1 obj = new Cylinder1(12, 4);
//     }
// }


//      53

// package com.company;

// abstract class Parent2{
//     public Parent2(){
//         System.out.println("Mai base2 ka constructor hoon");
//     }
//     public void sayHello(){
//         System.out.println("Hello");
//     }
//     abstract public void greet();
//     abstract public void greet2();
// }

// class Child2 extends Parent2{
//     @Override
//     public void greet(){
//         System.out.println("Good morning");
//     }
//     @Override
//     public void greet2(){
//         System.out.println("Good afternoon");
//     }
// }

// abstract class Child3 extends Parent2{
//     public void th(){
//         System.out.println("I am good");
//     }
// }
// public class cwh_53_abstract {
//     public static void main(String[] args) {
//         //Parent2 p = new Parent2(); -- error
//         Child2 c = new Child2();
//         //Child3 c3 = new Child3(); -- error
//     }
// }


//      54

// package com.company;

// interface Bicycle{
//     int a = 45;
//     void applyBrake(int decrement);
//     void speedUp(int increment);
// }

// interface HornBicycle{
//     int x = 45;
//     void blowHornK3g();
//     void blowHornmhn();
// }

// class AvonCycle implements Bicycle, HornBicycle{
//     //public int x = 5;
//     void blowHorn(){
//         System.out.println("Pee Pee Poo Poo");
//     }
//     public void applyBrake(int decrement){
//         System.out.println("Applying Brake");
//     }
//     public void speedUp(int increment){
//         System.out.println("Applying SpeedUP");
//     }
//     public void blowHornK3g(){
//         System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
//     }
//     public void blowHornmhn(){
//         System.out.println("Main hoon naa po po po po");
//     }
// }
// public class cwh_54_interfaces {
//     public static void main(String[] args) {
//         AvonCycle cycleHarry = new AvonCycle();
//         cycleHarry.applyBrake(1);
//         // You can create properties in Interfaces
//         System.out.println(cycleHarry.a);
//         System.out.println(cycleHarry.x);

//         // You cannot modify the properties in Interfaces as they are final
//         // cycleHarry.a = 454;
//         //System.out.println(cycleHarry.a);

//         cycleHarry.blowHornK3g();
//         cycleHarry.blowHornmhn();
//     }
// }


//       55

//        56
//             57

// package com.company;

// interface MyCamera{
//     void takeSnap();
//     void recordVideo();
//     private void greet(){
//         System.out.println("Good Morning");
//     }
//     default void record4KVideo(){
//         greet();
//         System.out.println("Recording in 4k...");
//     }
// }

// interface MyWifi{
//     String[] getNetworks();
//     void connectToNetwork(String network);
// }

// class MyCellPhone{
//     void callNumber(int phoneNumber){
//         System.out.println("Calling "+ phoneNumber);
//     }
//     void pickCall(){
//         System.out.println("Connecting... ");
//     }

// }

// class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
//     public void takeSnap(){
//         System.out.println("Taking snap");
//     }
//     public void recordVideo(){
//         System.out.println("Taking snap");
//     }
// //    public void record4KVideo(){
// //        System.out.println("Taking snap and recoding in 4k");
// //    }
//     public String[] getNetworks(){
//         System.out.println("Getting List of Networks");
//         String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
//         return networkList;
//     }
//     public void connectToNetwork(String network){
//         System.out.println("Connecting to " + network);
//     }
// }
// public class cwh_57_default_methods {
//     public static void main(String[] args) {
//         MySmartPhone ms = new MySmartPhone();
//         ms.record4KVideo();
//         // ms.greet(); --> Throws an error!
//         String[] ar = ms.getNetworks();
//         for (String item: ar) {
//             System.out.println(item);
//         }
//     }
// }


//          58

// package com.company;

// interface sampleInterface{
//     void meth1();
//     void meth2();
// }
// interface childSampleInterface extends sampleInterface{
//     void meth3();
//     void meth4();
// }
// class MySampleClass implements childSampleInterface{
//     public void meth1(){
//         System.out.println("meth1");
//     }
//     public void meth2(){
//         System.out.println("meth2");
//     }
//     public void meth3(){
//         System.out.println("meth3");
//     }
//     public void meth4(){
//         System.out.println("meth4");
//     }
// }
// public class cwh_58_inheritance_interfaces {
//     public static void main(String[] args) {
//         MySampleClass obj = new MySampleClass();
//         obj.meth1();
//         obj.meth2();
//         obj.meth3();
//     }
// }


//             59


// package com.company;

// interface MyCamera2{
//     void takeSnap();
//     void recordVideo();
//     private void greet(){
//         System.out.println("Good Morning");
//     }
//     default void record4KVideo(){
//         greet();
//         System.out.println("Recording in 4k...");
//     }
// }

// interface MyWifi2{
//     String[] getNetworks();
//     void connectToNetwork(String network);
// }

// class MyCellPhone2{
//     void callNumber(int phoneNumber){
//         System.out.println("Calling "+ phoneNumber);
//     }
//     void pickCall(){
//         System.out.println("Connecting... ");
//     }

// }

// class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
//     public void takeSnap(){
//         System.out.println("Taking snap");
//     }
//     public void recordVideo(){
//         System.out.println("Taking snap");
//     }
//     //    public void record4KVideo(){
// //        System.out.println("Taking snap and recoding in 4k");
// //    }
//     public String[] getNetworks(){
//         System.out.println("Getting List of Networks");
//         String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
//         return networkList;
//     }
//     public void connectToNetwork(String network){
//         System.out.println("Connecting to " + network);
//     }
//     public void sampleMeth(){
//         System.out.println("meth");
//     }
// }
// public class cwh_59_polymorphism {
//     public static void main(String[] args) {
//         MyCamera2 cam1 = new MySmartPhone2(); // This is a smartphone but, use it as a camera
//         // cam1.getNetworks(); --> Not allowed
//         // cam1.sampleMeth(); --> Not allowed

//         cam1.record4KVideo();

//         MySmartPhone2 s = new MySmartPhone2();
//         s.sampleMeth();
//         s.recordVideo();
//         s.getNetworks();
//         s.callNumber(7979);
//     }
// }


//         60

// package com.company;

// abstract class Pen{
//     abstract void write();
//     abstract void refill();
// }

// class FountainPen extends Pen{
//     void write(){
//         System.out.println("Write");
//     }
//     void refill(){
//         System.out.println("Refill");
//     }
//     void changeNib(){
//         System.out.println("Changing the nib");
//     }
// }
// class Monkey{
//     void jump(){
//         System.out.println("Jumping...");
//     }
//     void bite(){
//         System.out.println("Biting...");
//     }
// }

// interface BasicAnimal{
//     void eat();
//     void sleep();
// }

// class Human extends Monkey implements BasicAnimal{
//     void speak(){
//         System.out.println("Hello sir!");
//     }

//     @Override
//     public void eat() {
//         System.out.println("Eating");
//     }

//     @Override
//     public void sleep() {
//         System.out.println("Sleeping");
//     }
// }

// public class cwh_60_ch11ps {
//     public static void main(String[] args) {
//         // Q1 + Q2
//         FountainPen pen = new FountainPen();
//         pen.changeNib();

//         // Q3
//         Human harry = new Human();
//         harry.sleep();

//         // Q5
//         Monkey m1 = new Human();
//         m1.jump();
//         m1.bite();
//         // m1.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method

//         BasicAnimal lovish = new Human();
//         // lovish.speak(); --> error
//         lovish.eat();
//         lovish.sleep();

//     }
// }


//         61

// package com.company;
// class Library{
//     String[] books;
//     int no_of_books;
//     Library(){
//         this.books = new String[100];
//         this.no_of_books = 0;
//     }

//     void addBook(String book){
//         this.books[no_of_books] = book;
//         no_of_books++;
//         System.out.println(book+ " has been added!");
//     }

//     void showAvailableBooks(){
//         System.out.println("Available Books are:");
//         for (String book : this.books) {
//             if (book == null){
//                 continue;
//             }
//             System.out.println("* " + book);
//         }
//     }

//     void issueBook(String book){
//             for (int i=0;i<this.books.length;i++){
//             if (this.books[i].equals(book)){
//                 System.out.println("The book has been issued!");
//                 this.books[i] = null;
//                 return;
//             }
//         }
//         System.out.println("This book does not exist");
//     }

//     void returnBook(String book){
//         addBook(book);
//     }

// }
// public class cwh_61_ex4sol {
//     public static void main(String[] args) {
//         // You have to implement a library using Java Class "Library"
//         // Methods: addBook, issueBook, returnBook, showAvailableBooks
//         // Properties: Array to store the available books,
//         // Array to store the issued books

//         Library centralLibrary = new Library();
//         centralLibrary.addBook("Think and grow Rich");
//         centralLibrary.addBook("Algorithms");
//         centralLibrary.addBook("C++");
//         centralLibrary.showAvailableBooks();

//         centralLibrary.issueBook("C++");
//         centralLibrary.showAvailableBooks();
//         centralLibrary.returnBook("C++");
//         centralLibrary.showAvailableBooks();
//     }
// }


//         62

//         63

//         64

//          65

// package com.company;

// import java.util.Scanner;
// //import java.util.*;
// public class cwh_65_packages {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // java.util.Scanner sc = new java.util.Scanner(System.in);
//         int a = sc.nextInt();
//         System.out.println("This is my scanner taking input as " + a);
//     }
// }

//         66

// package com.company;

// class C1{
//     public int x = 5;
//     protected int y =45;
//     int z = 6;
//     private int a = 78;
//     public void meth1(){
//         System.out.println(x);
//         System.out.println(y);
//         System.out.println(z);
//         System.out.println(a);
//     }
// }
// public class cwh_66_access_modifiers {
//     public static void main(String[] args) {
//         C1 c = new C1();
//         // c.meth1();
//         System.out.println(c.x);
//         System.out.println(c.y);
//         System.out.println(c.z);
//         // System.out.println(c.a);
//     }
// }


//         67

//         68

// package com.company;

// /*
// *** WRITE THIS CODE IN NOTEPAD ***
//  You have to create a package named com.codewithharry.shape
//  This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
//  These classes should use inheritance to properly manage the code!
//  Include methods like volume, surface area and getters/setters for dimensions
//  */

// public class cwh_68_ex5 {
//     public static void main(String[] args) {

//     }
// }


//          69

//          70

// package com.company;

// class MyThread1 extends Thread{
//     @Override
//     public void run(){
//         int i =0;
//         while(i<40000){
//             System.out.println("My Cooking Thread is Running");
//             System.out.println("I am happy!");
//             i++;
//         }
//     }
// }

// class MyThread2 extends Thread{
//     @Override
//     public void run(){
//         int i =0;
//         while(i<40000){
//             System.out.println("Thread 2 for Chatting with her");
//             System.out.println("I am sad!");
//             i++;
//         }
//     }
// }

// public class cwh_70 {
//     public static void main(String[] args) {
//     MyThread1 t1 = new MyThread1();
//     MyThread2 t2 = new MyThread2();
//     t1.start();
//     t2.start();

//     }
// }


//            71

// package com.company;

// class MyThreadRunnable1 implements Runnable{
//     public void run(){
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//     }
// }
// class MyThreadRunnable2 implements Runnable{
//     public void run(){
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//     }
// }
// public class cwh_71_runnable {
//     public static void main(String[] args) {
//         MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
//         Thread gun1 = new Thread(bullet1);

//         MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
//         Thread gun2 = new Thread(bullet2);

//         gun1.start();
//         gun2.start();
//     }
// }


//             72

//            73

// package com.company;

// class MyThr extends Thread{
//     public MyThr(String name){
//         super(name);
//     }
//     public void run(){
//         int i = 34;
//         System.out.println("Thank you");
// //        while(true){
// //            System.out.println("I am a thread");
// //        }
//     }
// }
// public class cwh_73_thread_constructor {
//     public static void main(String[] args) {
//     MyThr t1 = new MyThr("Harry");
//     MyThr t2 = new MyThr("Ram Candr");
//     t1.start();
//     t2.start();
//     System.out.println("The id of the thread t is " + t1.getId());
//     System.out.println("The name of the thread t is " + t1.getName());
//     System.out.println("The id of the thread t is " + t2.getId());
//     System.out.println("The name of the thread t is " + t2.getName());

//     }
// }


//             74

// package com.company;

// class MyThr1 extends Thread{
//     public MyThr1(String name){
//         super(name);
//     }
//     public void run(){
//         int i = 34;

//         while(true){
// //            System.out.println("I am a thread");
//             System.out.println("Thank you: " + this.getName());
//         }

//     }
// }

// public class cwh_74_thread_priorities {
//     public static void main(String[] args) {
//         // Ready Queue: T1 T2 T3 T4 T5
//         MyThr1 t1 = new MyThr1("Harry1");
//         MyThr1 t2 = new MyThr1("Harry2");
//         MyThr1 t3 = new MyThr1("Harry3");
//         MyThr1 t4 = new MyThr1("Harry4");
//         MyThr1 t5 = new MyThr1("Harry5 (most Important)");
//         t5.setPriority(Thread.MAX_PRIORITY);
//         t1.setPriority(Thread.MIN_PRIORITY);
//         t2.setPriority(Thread.MIN_PRIORITY);
//         t3.setPriority(Thread.MIN_PRIORITY);
//         t4.setPriority(Thread.MIN_PRIORITY);
//         t5.setPriority(Thread.MIN_PRIORITY);
        
//         t1.start();
//         t2.start();
//         t3.start();
//         t4.start();
//         t5.start();

//     }
// }


//        75

// class CWH1 extends Thread{
//     public void run(){
//         try {
//             for (int i=0;i<5;i++){
//                 System.out.println("Child Thread");
//                 Thread.sleep(4000); /* Child thread is put to sleep for 4000ms. As soon as child thread goes to sleep main thread interrupts it. And, InterruptedException is generated which is handled by the catch block. */

//             }
//         }
//         catch (InterruptedException e)
//         {
//             System.out.println("Child Thread Interrupted");
//         }
// 	System.out.println("Thread is running");

//     }
// }

// public class CWH extends Thread{
//     public static void main(String[] args) {
//          CWH1 t= new CWH1();
//          t.start();
//          t.interrupt();
//         System.out.println("Main Thread");

//     }
// }

// package com.company;

// class MyNewThr1 extends Thread{
//     public void run(){
//         int i = 0;
//         while(true){
// //            System.out.println("I am a thread");
//             System.out.println("Thank you: ");
//             try {
//                 Thread.sleep(455);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//             i++;
//         }
//     }
// }

// class MyNewThr2 extends Thread{

//     public void run(){
//         while(true){
// //            System.out.println("I am a thread");
//             System.out.println("My Thank you: ");
//         }
//     }
// }

// public class cwh_75_thread_methods {
//     public static void main(String[] args){
//         MyNewThr1 t1 = new MyNewThr1();
//         MyNewThr2 t2 = new MyNewThr2();
//         t1.start();
// //        try{
// //            t1.join();
// //        }
// //        catch(Exception e){
// //            System.out.println(e);
// //        }

//         t2.start();

//     }
// }

//         76

// import java.util.ArrayList;

// class Thread1 extends Thread{
//     public void run(){
//         while (true){
//         System.out.println("Welcome");
//     }
//     }
// }
// class Thread2 extends Thread {
//     public void run() {
//         while (true) {
//             System.out.println("Good morning");
//         }
//     }
// }
// public class CWH {
//     public static void main(String[] args) {
//         Thread1 t1= new Thread1();
//         Thread2 t2= new Thread2();
//         t1.start();
//         t2.start();
//     }
// }

// import java.util.ArrayList;

// class Thread1 extends Thread{
//     public void run(){
//         try {
//             Thread.sleep(200);
//     }
//         catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//         System.out.println("Welcome");
//     }
// }
// class Thread2 extends Thread {
//     public void run() {
//             System.out.println("Good morning");
//         }
//     }
// public class CWH {
//     public static void main(String[] args) {
//         Thread1 t1= new Thread1();
//         Thread2 t2= new Thread2();
//         t1.start();
//         t2.start();
//     }
// }

// import java.util.ArrayList;

// class Thread1 extends Thread{
//     public void run(){
//         System.out.println("Welcome");
//     }
// }
// class Thread2 extends Thread {
//     public void run() {
//             System.out.println("Good morning");
//         }
//     }
// public class CWH {
//     public static void main(String[] args) {
//         Thread1 t1= new Thread1();
//         Thread2 t2= new Thread2();
//         t1.start();
//         t2.start();
//         t1.setPriority(5);
//         t2.setPriority(1);

//         System.out.println(t1.getPriority());
//         System.out.println(t2.getPriority());
//     }
// }

// package com.company;

// class Practice13 extends Thread{
//     public void run(){
//         while(true){
//             System.out.println("Good Morning!");
//         }
//     }
// }
// class Practice13b extends Thread{
//     public void run(){
// //        while(false){
// //            try {
// //                Thread.sleep(200);
// //            }
// //            catch (Exception e){
// //                System.out.println(e);
// //            }
// //            System.out.println("Welcome");
// //        }
//     }
// }

// public class cwh_76_practice13 {
//     public static void main(String[] args) {
//         Practice13 p1 = new Practice13();
//         Practice13b p2 = new Practice13b();
//         // p1.setPriority(6);
//         // p2.setPriority(9);
//         System.out.println(p1.getPriority());
//         System.out.println(p2.getPriority());
//         System.out.println(p2.getState());
// //        p1.start();
//         p2.start();
//         System.out.println(p2.getState());
//         System.out.println(Thread.currentThread().getState());
//     }
// }


//             77

//            78

// package com.company;

// public class cwh_78_errors {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 9;
//         System.out.println(a+b);
//     }
// }

//            79

// package com.company;

// import java.util.Scanner;

// public class cwh_79_errorsdemo {
//     public static void main(String[] args) {
//         // SYNTAX ERROR DEMO
//         // int a = 0 // Error: no semicolon!
//         // b = 8; // Error: b not declared!

//         // LOGICAL ERROR DEMO
//         // Write a program to print all prime numbers between 1 to 10
//         System.out.println(2);
//         for (int i=1; i<5; i++){
//             System.out.println(2*i+1);
//         }

//         // RUNTIME ERROR
//         int k;
//         Scanner sc = new Scanner(System.in);
//         k = sc.nextInt();
//         System.out.println("Integer part of 1000 divided by k is "+ 1000/k);

//     }
// }


//         80

// package com.company;

// public class cwh_80_try {
//     public static void main(String[] args) {
//         int a = 6000;
//         int b = 0;
//         // Without Try:
// //        int c = a / b;
// //        System.out.println("The result is " + c);
//         // With Try:
//         try {
//             int c = a / b;
//             System.out.println("The result is " + c);
//         }
//         catch(Exception e) {
//             System.out.println("We failed to divide. Reason: ");
//             System.out.println(e);
//         }
//         System.out.println("End of the program");
//     }
// }


//      81

// try (

//     // code

//     )

//    Catch (To Exception e) - Handle all Exceptions of type IO Exception

//         // code

//         )

//    Catch (Exception e) - Handle all Exceptions of type Arithmetic Exception

//         // code

//          ) 

//    Catch (Exception e) - Handle all other Exceptions

//         // code

//         )


// package com.company;

// import java.util.Scanner;

// public class cwh_81 {
//     public static void main(String[] args) {
//         int [] marks = new int[3];
//         marks[0] = 7;
//         marks[1] = 56;
//         marks[2] = 6;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the array index");
//         int ind = sc.nextInt();

//         System.out.println("Enter the number you want to divide the value with");
//         int number = sc.nextInt();
//         try{
//             System.out.println("The value at array index entered is: " + marks[ind]);
//             System.out.println("The value of array-value/number is: " + marks[ind]/number);
//         }
//         catch (ArithmeticException e){
//             System.out.println("ArithmeticException occured!");
//             System.out.println(e);
//         }
//         catch (ArrayIndexOutOfBoundsException e){
//             System.out.println("ArrayIndexOutOfBoundsException occured!");
//             System.out.println(e);
//         }
//         catch (Exception e){
//             System.out.println("Some other exception occured!");
//             System.out.println(e);
//         }
//     }
// }

//            82
// package com.company;

// import java.util.Scanner;

// public class cwh_82_nested_try_catch {
//     public static void main(String[] args) {
//         int [] marks = new int[3];
//         marks[0] = 7;
//         marks[1] = 56;
//         marks[2] = 6;
//         Scanner sc = new Scanner(System.in);
//         boolean flag = true;
//         while(flag) {
//             System.out.println("Enter the value of index");
//             int ind = sc.nextInt();
//             try {
//                 System.out.println("Welcome to video no 82");
//                 try {
//                     System.out.println(marks[ind]);
//                     flag = false;
//                 } catch (ArrayIndexOutOfBoundsException e) {
//                     System.out.println("Sorry this index does not exist");
//                     System.out.println("Exception in level 2");
//                 }
//             } catch (Exception e) {
//                 System.out.println("Exception in level 1");
//             }
//         }
//         System.out.println("Thanks for using this program");
//     }
// }




//        83
// package com.company;

// import java.util.Scanner;

// class MyException extends Exception{
//     @Override
//     public String toString() {
//         return "I am toString()";
//     }

//     @Override
//     public String getMessage() {
//         return "I am getMessage()";
//     }
// }
// class MaxAgeException extends Exception{
//     @Override
//     public String toString() {
//         return "Age cannot be greater than 125";
//     }

//     @Override
//     public String getMessage() {
//         return "Make sure that the value of age entered is correct";
//     }
// }
// public class cwh_83_exception_class {
//     public static void main(String[] args) {
//         int a;
//         Scanner sc = new Scanner(System.in);
//         a = sc.nextInt();
//         if (a<9){
//             try{
//                 // throw new MyException();
//                 throw new ArithmeticException("This is an exception");
//             }
//             catch (Exception e){
//                 System.out.println(e.getMessage());
//                 System.out.println(e.toString());
//                 e.printStackTrace();
//                 System.out.println("Finished");
//             }
//             System.out.println("Yes Finished");
//         }
//     }
// }


//       84
// package com.company;

// class NegativeRadiusException extends Exception{
//     @Override
//     public String toString() {
//         return "Radius cannot be negative!";
//     }

//     @Override
//     public String getMessage() {
//         return "Radius cannot be negative!";
//     }
// }

// public class cwh_84_throw_throws {

//     public static double area(int r) throws NegativeRadiusException{
//         if (r<0){
//             throw new NegativeRadiusException();
//         }
//         double result = Math.PI * r * r;
//         return result;
//     }

//     public static int divide(int a, int b) throws ArithmeticException{
//         // Made By Harry
//         int result = a/b;
//         return result;
//     }
//     public static void main(String[] args) {
//         // Shivam - uses divide function created by Harry
//         try{
// //            int c = divide(6, 0);
// //            System.out.println(c);
//             double ar = area(6);
//             System.out.println(ar);
//         }
//         catch(Exception e){
//             System.out.println("Exception");
//         }
//     }
// }


//        85

// package com.company;

// public class cwh_85_finally {
//     public static int greet(){
//         try{
//             int a = 50;
//             int b = 10;
//             int c = a/b;
//             return c;
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//         finally {
//             System.out.println("Cleaning up resources...This is the end of this function");
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int k = greet();
//         System.out.println(k);
//         int a = 7;
//         int b = 9;
//         while(true){
//             try{
//                 System.out.println(a/b);
//             }
//             catch (Exception e){
//                 System.out.println(e);
//                 break;
//             }
//             finally{
//                 System.out.println("I am finally for value of b = " + b);
//             }
//             b--;
//         }

//         try{
//             System.out.println(50/3);
//         }
//         finally {
//             System.out.println("Yes this is finally");
//         }
//     }
// }


//             86

// package com.company;

// import java.util.Scanner;

// public class cwh_86_ps14 {
//     public static void main(String[] args) {
//         // Problem 1
//         // Syntax Error - int a = 7
//         int age = 78;
//         int year_born = 2000-78; // Logical error
// //        System.out.println(6/0);

//         // Problem 2
//         try{
//             int a = 666/0;
//         }
//         catch (IllegalArgumentException e){
//             System.out.println("HeHe");
//         }
//         catch (ArithmeticException e){
//             System.out.println("Haha");
//         }

//         // Problem 3
//         boolean flag = true;
//         int [] marks = new int[3];
//         marks[0] = 7;
//         marks[1] = 56;
//         marks[2] = 6;
//         Scanner Sc = new Scanner(System.in);
//         int index;
//         int i = 0;
//         while(flag && i<5){
//             try {
//                 System.out.println("Enter the value of index");
//                 index = Sc.nextInt();
//                 System.out.println("The value of marks[index] is " + marks[index]);
//                 break;
//             }
//             catch (Exception e) {
//                 System.out.println("Invalid Index");
//                 i++;
//             }
//         }
//         if(i>=5){
//             System.out.println("Error");
//         }


//     }
// }


//            87

// package com.company;

// public class cwh_87_ex6 {
//     public static void main(String[] args) {
//         /*
//         Exercise 6: You have to create a custom calculator with following operations:
//         1. + -> Addition
//         2. - -> Subtraction
//         3. * -> Multiplication
//         4. / -> Division
//         which throws the following exceptions:
//         1. Invalid input Exception ex: 8 & 9
//         2. Cannot divide by 0 Exception
//         3. Max Input Exception if any of the inputs is greater than 100000
//         4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
//          */
//     }
// }


//              88

// package com.company;

// import java.util.ArrayList;
// import java.util.Set;
// import java.util.TreeSet;

// public class cwh_89_collections {
//     public static void main(String[] args) {
//         // ArrayList
//         // Set
//         // TreeSet
//     }
// }


//            89

// package com.company;

// import java.util.ArrayList;
// import java.util.Set;
// import java.util.TreeSet;

// public class cwh_89_collections {
//     public static void main(String[] args) {
//         // ArrayList
//         // Set
//         // TreeSet
//     }
// }


//           90

//           91

// package com.company;

// import java.util.*;

// public class cwh_92_linkedlist {
//     public static void main(String[] args) {
//         LinkedList<Integer> l1 = new LinkedList<>();
//         LinkedList<Integer> l2 = new LinkedList<>();
//         l2.add(15);
//         l2.add(18);
//         l2.add(19);

//         l1.add(6);
//         l1.add(7);
//         l1.add(4);
//         l1.add(6);
//         l1.add(0, 5);
//         l1.add(0, 1);
//         l1.addAll(0, l2);
//         l1.addLast(676);
//         l1.addFirst(788);
//         System.out.println(l1.contains(27));
//         System.out.println(l1.indexOf(6));
//         System.out.println(l1.lastIndexOf(6));
//         //l1.clear();
//         l1.set(1, 566);
//         for(int i=0; i<l1.size(); i++){
//             System.out.print(l1.get(i));
//             System.out.print(", ");
//         }
//     }
// }


//         92

// import java.util.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {

//         LinkedList<Integer> l1 = new LinkedList<>();

//         l1.add(11);
//         l1.add(22);
//         l1.add(33);
//         l1.add(44);
//         l1.add(55);
//         l1.add(77);
//         l1.add(5,77); // Inserts 77 at index 5
//         System.out.println("L1 Linked list : "+ l1);

//     }
// }

// import java.util.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {

//         LinkedList<Integer> l1 = new LinkedList<>();

//         l1.add(11);
//         l1.add(22);
//         l1.add(33);
//         l1.add(44);
//         l1.add(55);
//         l1.add(77);
//         l1.add(5,77); 
//         System.out.println("L1 Linked list before: "+ l1);

//         l1.remove(2); //removes element present at 2nd index
//         System.out.println("L1 Linked list after: "  + l1);

//     }
// }


// import java.util.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {

//         LinkedList<Integer> l1 = new LinkedList<>();

//         l1.add(11);
//         l1.add(22);
//         l1.add(33);
//         l1.add(44);
//         l1.add(55);
//         l1.add(66);
//         System.out.println("L1 Linked list before: "+ l1);

//         l1.set(2,10); //changes element present at 2nd index (33 changed to 10)
//         System.out.println("L1 Linked list after: "  + l1);

//     }
// }


// F.	import java.util.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {

//         LinkedList<Integer> l1 = new LinkedList<>();

//         l1.add(11);
//         l1.add(22);
//         l1.add(33);
//         l1.add(44);
//         l1.add(55);
//         l1.add(66);
//         System.out.println("L1 Linked list before: "+ l1);

//         l1.addLast(100); //Inserting 100 at the end of L1
//         System.out.println("L1 Linked list after inserting element at last index: "  + l1);

//     }
// }


// import java.util.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {

//         LinkedList<Integer> l1 = new LinkedList<>();

//         l1.add(11);
//         l1.add(22);
//         l1.add(33);
//         l1.add(44);
//         l1.add(55);
//         l1.add(66);
//         System.out.println("L1 Linked list before: "+ l1);

//         l1.addFirst(0); //Inserting 0 at the starting of L1
//         System.out.println("L1 Linked list after: "  + l1);

//     }
// }


// package com.company;

// import java.util.*;

// public class cwh_92_linkedlist {
//     public static void main(String[] args) {
//         LinkedList<Integer> l1 = new LinkedList<>();
//         LinkedList<Integer> l2 = new LinkedList<>();
//         l2.add(15);
//         l2.add(18);
//         l2.add(19);

//         l1.add(6);
//         l1.add(7);
//         l1.add(4);
//         l1.add(6);
//         l1.add(0, 5);
//         l1.add(0, 1);
//         l1.addAll(0, l2);
//         l1.addLast(676);
//         l1.addFirst(788);
//         System.out.println(l1.contains(27));
//         System.out.println(l1.indexOf(6));
//         System.out.println(l1.lastIndexOf(6));
//         //l1.clear();
//         l1.set(1, 566);
//         for(int i=0; i<l1.size(); i++){
//             System.out.print(l1.get(i));
//             System.out.print(", ");
//         }
//     }
// }


//          93

// import java.util.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {

//         ArrayDeque<Integer> ad1 = new ArrayDeque<>();
//         ad1.add(6);
//         ad1.add(56);
//         ad1.add(9);
//         ad1.addFirst(5);
//         ad1.offerFirst(10);
//         System.out.println(ad1);

//     }
// }


// import java.util.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {

//         ArrayDeque<Integer> ad1 = new ArrayDeque<>();
//         ad1.add(6);
//         ad1.add(56);
//         ad1.add(9);
//         ad1.addLast(5);
//         ad1.offerLast(10);
        
//         System.out.println(ad1);

//     }
// }


// import java.util.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {

//         ArrayDeque<Integer> ad1 = new ArrayDeque<>();
//         ad1.add(6);
//         ad1.add(56);
//         ad1.add(9);
//         ad1.add(10);
//         ad1.add(91);
//         ad1.add(19);

//         System.out.println(ad1.getFirst());
//         System.out.println(ad1.peekFirst());

//     }
// }


// import java.util.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {

//         ArrayDeque<Integer> ad1 = new ArrayDeque<>();
//         ad1.add(6);
//         ad1.add(56);
//         ad1.add(9);
//         ad1.add(10);
//         ad1.add(91);
//         ad1.add(19);

//         System.out.println(ad1.getLast());
//         System.out.println(ad1.peekLast());

//     }
// }


// import java.util.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {

//         ArrayDeque<Integer> ad1 = new ArrayDeque<>();
//         ad1.add(6);
//         ad1.add(56);
//         ad1.add(9);
//         ad1.add(10);
//         ad1.add(91);
//         ad1.add(19);

//         ad1.pollFirst(); //deletes 6
//         ad1.removeFirst(); //deletes 56

//         System.out.println(ad1);

//     }
// }


// import java.util.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {

//         ArrayDeque<Integer> ad1 = new ArrayDeque<>();
//         ad1.add(6);
//         ad1.add(56);
//         ad1.add(9);
//         ad1.add(10);
//         ad1.add(91);
//         ad1.add(19);

//         ad1.pollLast(); //deletes 19
//         ad1.removeLast(); //deletes 91

//         System.out.println(ad1);

//     }
// }


// package com.company;

// import java.util.ArrayDeque;

// public class cwh_93_arraydeque {
//     public static void main(String[] args) {
//         ArrayDeque<Integer> ad1 = new ArrayDeque<>();
//         ad1.add(6);
//         ad1.add(56);
//         ad1.add(9);
//         ad1.addFirst(5);
//         System.out.println(ad1.getFirst());
//         System.out.println(ad1.getLast());
//     }
// }


// package com.company;

// import java.util.ArrayDeque;

// public class cwh_93_arraydeque {
//     public static void main(String[] args) {
//         ArrayDeque<Integer> ad1 = new ArrayDeque<>();
//         ad1.add(6);
//         ad1.add(56);
//         ad1.add(9);
//         ad1.addFirst(5);
//         System.out.println(ad1.getFirst());
//         System.out.println(ad1.getLast());
//     }
// }


//                94

//              95

// import java.util.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {
//         HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
//         myHashSet.add(6);
//         myHashSet.add(8);
//         myHashSet.add(3);
//         myHashSet.add(11);
//         myHashSet.add(11); // This element will be ignored

//         System.out.println(myHashSet);

//     }
// }


// import java.util.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {
//         HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
//         myHashSet.add(6);
//         myHashSet.add(8);
//         myHashSet.add(3);
//         myHashSet.add(11);
//         myHashSet.add(11); // This element will be ignored

//         System.out.println("myHashSet before removing any element : " + myHashSet);
//         myHashSet.remove(3); //deletes 3 from the hashset
//         System.out.println("myHashSet after removing a element : " + myHashSet);

//     }
// }


// import java.util.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {
//         HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
//         myHashSet.add(6);
//         myHashSet.add(8);
//         myHashSet.add(3);
//         myHashSet.add(11);

//         HashSet<Integer> myHashSet1 = new HashSet<>();

//         System.out.println(myHashSet.isEmpty());
//         System.out.println(myHashSet1.isEmpty());


//     }
// }


// import java.util.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {
//         HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
//         myHashSet.add(16);
//         myHashSet.add(33);
//         myHashSet.add(78);
//         myHashSet.add(19);
//         myHashSet.add(29);
//         myHashSet.add(10); 

//         System.out.println("myHashSet before : " + myHashSet);
//         myHashSet.clear(); //deletes all the elements from the hashset
//         System.out.println("myHashSet after  : " + myHashSet);
        
//     }
// }


// import java.util.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {
//         HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
//         myHashSet.add(16);
//         myHashSet.add(33);
//         myHashSet.add(78);
//         myHashSet.add(19);
//         myHashSet.add(29);
//         myHashSet.add(10); 

//         System.out.println("The size of myHashSet is : " + myHashSet.size());

//     }
// }


// package com.company;

// import java.util.HashSet;

// public class cwh_95_set {
//     public static void main(String[] args) {
//         HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
//         myHashSet.add(6);
//         myHashSet.add(8);
//         myHashSet.add(3);
//         myHashSet.add(11);
//         myHashSet.add(11);
//         System.out.println(myHashSet);
//     }
// }


//         96

// package com.company;

// public class cwh_96_date {
//     public static void main(String[] args) {
//         System.out.println(System.currentTimeMillis()/1000/3600/24/365);
//     }
// }


//       97

// package com.company;

// import java.util.Date;
// public class cwh_97_date_class {
//     public static void main(String[] args) {
// //        System.out.println(Long.MAX_VALUE);
// //        System.out.println(System.currentTimeMillis());
//         Date d = new Date();
//         System.out.println(d);
//         System.out.println(d.getTime());
//         System.out.println(d.getDate());
//         System.out.println(d.getSeconds());
//         System.out.println(d.getYear()); 
//     }
// }


//          98

// import java.util.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {
//         Calendar c = Calendar.getInstance();
//         System.out.println(c.getCalendarType());  //getCalendarType() returns the type of the calendar

//     }
// }


// import java.util.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {
//         Calendar c = Calendar.getInstance();
//         System.out.println("Current year is :"+ c.get(Calendar.YEAR));
//         System.out.println("Current month is :"+ c.get(Calendar.MONTH)); //The indexing for month field ranges from [0,11]
//         System.out.println("Current day is :"+ c.get(Calendar.DAY_OF_WEEK));
//         System.out.println("Current hour is :"+ c.get(Calendar.HOUR_OF_DAY));
//         System.out.println("Current minute is :"+ c.get(Calendar.MINUTE));
//         System.out.println("Current second is :"+ c.get(Calendar.SECOND));

        
//     }
// }


// import java.util.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {
//         Calendar c = Calendar.getInstance();
//         System.out.println("Current date is : " + c.getTime());
//         c.add(Calendar.YEAR, 4);
//         System.out.println("After 4 years  : "+ c.getTime());
//         c.add(Calendar.YEAR, -12);
//         System.out.println("Before 12 years  : "+ c.getTime());
//         c.add(Calendar.MONTH,2);
//         System.out.println("After 2 months  : "+ c.getTime());

//     }
// }




// import java.util.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {
//         Calendar c = Calendar.getInstance();
//         System.out.println(" The maximum no. of weeks in a year : " + c.getMaximum(Calendar.WEEK_OF_YEAR));


//     }
// }


//       100

// import java.time.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {
//         Clock cl = Clock.systemUTC();

//         System.out.println(cl.instant());
//     }
// }

// import java.time.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {
//         Duration d1 = Duration.between(LocalTime.MIN,LocalTime.NOON);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '12:00' 
//                   System.out.println(d1.isNegative());                                         
                                                                                                  
//         Duration d2 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'
                                                                                                                  
//         System.out.println(d2.isNegative());
//     }
// }

// import java.time.*;
// public class CWH extends Thread{
//     public static void main(String[] args) {
//         Duration d1 = Duration.between(LocalTime.MIN,LocalTime.MIDNIGHT);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '00:00'
//         System.out.println(d1.isZero());

//         Duration d2 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'

//         System.out.println(d2.isZero());
//     }
// }

// import java.time.*;
// public class CWH extends Thread{
//             public static void main(String[] args) {
//                 LocalDate d = LocalDate.now();
//                 System.out.println(d);
//             }
// }
        

// import java.time.*;
// public class CWH extends Thread{
//             public static void main(String[] args) {
//                 LocalDate d = LocalDate.parse("2021-05-27");
//                 LocalDate d1= LocalDate.parse("2021-05-26");
//                 LocalDate d2= LocalDate.parse("2021-05-26");

//                 System.out.println(d1.equals(d));
//                 System.out.println(d2.equals(d1));
//             }
// }


// package com.company;

// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.LocalTime;

// public class cwh_100_java_time {
//     public static void main(String[] args) {
//         LocalDate d = LocalDate.now();
//         System.out.println(d);

//         LocalTime t = LocalTime.now();
//         System.out.println(t);

//         LocalDateTime dt = LocalDateTime.now();
//         System.out.println(dt);
//     }
// }


// import java.time.*;
// public class CWH extends Thread{
//             public static void main(String[] args) {
//                 LocalTime t = LocalTime.of(15,28,19);
//                 System.out.println("Time before : "  + t);

//                 LocalTime t1= t.minusMinutes(8);
//                 System.out.println("Time after subtracting 8 minutes : " + t1);

//             }
// }


//       101










