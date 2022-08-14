package com.company;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import javax.swing.*;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
//	// write your code here
//        //System.out.println("Hello java");
//
//        //Primitives Data types :-
////        int x  =  10;
////        System.out.println(x);
////        byte y = 67;
////        System.out.println(y);
////        short z = 12;
////        System.out.println(z);
////        long a = 102931L;
////        System.out.println(a);
////        char b = 'A';
////        System.out.println(b);
////        double c = 12.45d;
////        System.out.println(c);
////        float d = 13.3234f;
////        System.out.println(d);
////        boolean e = true;
////        System.out.println(e);
//
//        // There are non primitive data types which are Strings,Array, Interfaces etc (Discuss it further)
//
//
//        // The operators :-
//
//        // the arithmetic operators
//
////        int x =  20;
////        int y =  10;
//// n
////        int   sum = x+y ;
////
////        System.out.println(sum);
////
////        int difference =  x-y;
////        System.out.println(difference);
////
////
////        int module =  x%y;
////        System.out.println(module);
////
////        int divide =  x/y;
////        System.out.println(divide);
////
////        int product  =   x*y;
////        System.out.println(product);
//
//
//        // The assignment operator
//
////        int x  =  20;
////
////        x += 20;
////        System.out.println(x);
////
////        x -= 10;
////        System.out.println(x);
////
////        x /= 20;
////        System.out.println(x);
////
////        x %= 10;
////        System.out.println(x);
////
////        x  *= 10;
////        System.out.println(x);
//
//
//
//// Question 1 :-  Add two integer :-
//
////        Scanner sc =  new Scanner(System.in);
////
////        System.out.println("Enter your  1st number: ");
////        int x =  sc.nextInt();
////
////        System.out.println("Enter your 2nd number: ");
////        int y  =   sc.nextInt();
////
////        int sum  =  x+y;
////        System.out.println(sum);
//
//
//        // Question 2 :- Multiply two floating number :-
//
////        Scanner sc =  new Scanner(System.in);
////
////        System.out.println("Enter your first floating point number: ");
////        float x  =  sc.nextFloat();
////
////        System.out.println("Enter your second floating number:  ");
////        float y =  sc.nextFloat();
////
////        float sum = x*y;
////        System.out.println(sum);
//
//
//         // Taking input from user :-
//
//       /* Scanner sc =  new Scanner(System.in);
//        System.out.println("Enter your name : -");
//        String x  =  sc.nextLine();
//
//        System.out.println("Enter your  2nd name: ");
//        String y  =   sc.nextLine();
//
//        String full_name = x + y ;
//
//        System.out.println(full_name); */
//
//
//            // Relational operator
////
////        int x  =  57;
////
////        int y =  54;
////
////        System.out.println(x!=y);
//
//
//
//
//        // Conditional operators :-
//
////             int x =  10;
////        System.out.println(x>=5 && x<=10);
////
////
////
////        int y =  20;
////        System.out.println(y==20 || y==30);
//
//
////        int age = 20;
////        System.out.println(!(age>20));
//
//
//
//
        // question 4 :-   Compute quotient and remainder :-
// int dividend = 20;
//
//        int divisor = 10;
//
//        int divide =  20/10;
//        System.out.println(divide);
//
//        int remainder =  20%10;
//
//        System.out.println(remainder);
//
//
//          // Question 5 :- Take a text input:-
//
//        Scanner sc =  new Scanner(System.in);
//
//        System.out.println("Enter your name: ");
//
//        String your_name  =  sc.nextLine();
//
//
//        System.out.println("Your name is : " + your_name);


//        Flow controls :-

//       Scanner sc =  new Scanner(System.in);
//       int age =  sc.nextInt();
//        if (age >=20 ){
//            System.out.println("You are young ");
//        }


//        Scanner sc=  new Scanner(System.in);
//        System.out.println("Enter your age: ");
//        int age  = sc.nextInt();
//        if(age<=20){
//            System.out.println("You can go to school");
//        } else {
//            System.out.println("You can go the collage ");
//        }


        // If else ladder :-
//
//        Scanner  sc =  new Scanner(System.in);
//        System.out.println("Enter your age: ");
//
//        int age  = sc.nextInt();
//
//        if (age<=20){
//            System.out.println("You are going to collage");
//        } else if(age<=30){
//            System.out.println("you are going to the collage");
//        } else if (age<=40){
//            System.out.println("You are going to office ");
//        } else {
//            System.out.println("You are doing nothing");
//        }



        // Switch- break case :-

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your food id: ");
//        int foodid = sc.nextInt();
//        switch (foodid) {
//            case 10:
//                System.out.println("You ordered pizza");
//                break;
//            case 20 :
//                System.out.println("You ordered burger ");
//                break;
//            case 30:
//                System.out.println("You ordered maggie");
//                break;
//            case 40 :
//                System.out.println("You ordered Pastaa");
//                break;
//            default:
//                System.out.println("You ordered nothing ");
//        }


         //  The loops

        // For loops:-

//        for ( int i = 0 ;i<=100  ;i++  ){
//            System.out.println("The number is: "  + i);
//        }

//        for (int i =  100; i>=1;i--){
//            System.out.println("Backword count: " + i);
//        }


        // The while loop:-

//        int i = 10;
//        while(i>=0){
//            System.out.println("The number is " + i);
//            i--;

//        int i = 0;
//        do {
//            System.out.println("The number is: " + i);
//            i++;
//        } while (i<=10);

//        int i = 10;
//        do {
//            System.out.println("Backword number: ");
//            i--;
//        } while(i>=1);

//         int [] score = new int[5];
//         score[0] = 100;
//         score[1]=200;
//         score[2]= 300;
//         score[3]=400;
//         score[4]=500;
//
//        System.out.println(score[3]);


//        int [] score;
//        score = new int[5];
//        score[1]=100;
//        score[2]=200;
//        score[3]= 300;
//        score[4]=400;
//
//        System.out.println(score[2]);


//        int [] x =  {12,3,34,23,4,7,46,5,446,66,446,67,};
//
//        System.out.println(x[5]);

//        String name =  "kaushik karan singh";
//        System.out.println(name.charAt(4));
//
//        String name2 = "kaushik karan singh";
//        System.out.println(name2.length());
//
//        String name3 =  "kaushik karan singh";
//        System.out.println(name3.substring(4,8));


//        String name4 =  "kaushik karan singh";
//        System.out.println(Conta);


          // Break and Continue Statment in java :-


//        for(int i = 0 ; i<=10;i++){
//            if (i==6){
//               break;
//            }
//            System.out.println("The programme will stop at 5: " + i);
//        }


           // And now continue statement : -


//        for(int i = 0; i<=10 ; i++){
//            if (i%2!=0){
//                continue;
//            }
//            System.out.println("All even numbers from 0 to 10 " + i);
//        }


//       int[] x = {13,34,34,3,334,4,3,23,4,32,34};
//
//       x[3] =45;
//
//       for(int i =1; i<x.length;i++){
//           System.out.println(x[i]);
//       }
//        System.out.println(x.length);
//
//
//       String[] y  = {"Aarvi","kaushik","Roshan"};
//
//       for(String name : y){
//           System.out.println("Print all the name " + name);
//       }


      //  question  Copy one array to another :-

//      int [] x = {12,34,45,76,32,235,23,5};
//
//      int [] y = x;
//
//    for (int i =0; i<x.length; i++){
//        System.out.print(y[i] + ",");
//    }



 // question create an array of string type: -

//        String [] name  =  {"Aarvi","kaushik","kaurvi","Mom","Dad"};
//
//            for (String  names : name){
//                System.out.print(names + " , ");
//            }


// question :-  Round number to n decimal place :-

//  double x =  54.5687d;
//
//        System.out.format("%.3f" , x);


// Wap to swap two numbers:-

//        int x ,y, temp;
//
//        x= 4;
//        y=5;
//
//        temp = x;
//
//        x =  y;
//
//        y = temp;
//
//        System.out.println(x);
//        System.out.println(y);



// Break and Continue statement :-

//            for(int i = 0;  i<=10 ; i++){
//                if (i==6){
//                    break;
//                }
//                System.out.println("The number will stop at 5" + i);
//            }



// Continue statement :-

//        for(int i = 0; i<=10;i++){
//            if (i%2!=0){
//                continue;
//
//            }
//            System.out.println("Print even numbers from 1 to 10: " + i);
//        }



//         Question Convert double type into int type:-

//          double x = (int) 12.345;
//
//
//        System.out.println("Int number: " + x);


        // Question:-  Convert int type into char


//        int x = 45;
//
//        char y =  (char) x;
//
//        System.out.println(y);


        // Question :- Check whether the number is even or odd

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter your number: ");
//
//        int x = sc.nextInt();
//
//        if( x%2==0){
//            System.out.println("The number is even:  " + x);
//        } else {
//            System.out.println("The number is odd: " + x);
//        }
//
//        sc.close();

           // Question Check weather the given number is odd or even  : -



//        int x = 23;
//
//        if(x%2==0){
//            System.out.println("The number is even");
//        } else {
//            System.out.println("The number is odd");
//        }


        // By scanner method :-

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//
//        int x = sc.nextInt();
//
//        if(x%2==0){
//            System.out.println("The number is even");
//        } else {
//            System.out.println("The number is odd");
//        }



        // Question check vowel or consonant:-

//
//        char alphabet  = 'b';
//
//        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' ){
//            System.out.println("The number is vowel");
//        } else {
//            System.out.println("The number is consonent");
//        }

         // By scanner method :-
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter your alphabet: ");
//
//        char alphabet = sc.next().charAt(0);
//
//        if(alphabet=='a'|| alphabet=='e' || alphabet=='i'|| alphabet=='o'|| alphabet=='u'){
//            System.out.println("The alphabet is Vowel");
//        } else {
//            System.out.println("The alphabet is consonant");
//        }

        // Using switch case : -

//        char alphabet  = 'w';
//
//        switch (alphabet){
//
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//
//                System.out.println("The alphabet is vowel  ");
//                break;
//
//            default:
//                System.out.println("The alphabet is consonant ");
//
//
//        }


//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter your alphabet");
//
//        char alphabet  = sc.next().charAt(0);
//
//        switch (alphabet){
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//
//                System.out.println("The alphabet is vowel");
//              break;
//
//            default:
//                System.out.println("The alphabet is consonant");
//
//
//        }




       // Question :- Calculate the sum of natural numbers:-
//       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your  natural number : ");
//       int num = sc.nextInt();
//               int sum  = 0;
//        for (int i =0;i<=num;i++){
//
//         sum = sum + i;
//
//        }
//        System.out.println(sum);


//   int value = 34;
//        System.out.println(value);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        int x  =  sc.nextInt();
//
//        System.out.println("Ennter your second:  ");
//        int y = sc.nextInt();
//
//        int sum =  x+y;
//
//        System.out.println("The sum if two number is: " + sum);


//       Strings :-

         String name = "Kaushik karan singh";
     //   System.out.println(name.length());

        System.out.println(name.charAt(2));

        System.out.println(name.contains("z"));










    }



    }





