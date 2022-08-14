package com.company.java_oops;

public class methods {

    public static int logic(int x , int y){
     if (x>y){
         return x;
     } else
         return y;


    }

    public static int addnumbers(int x , int y){
        int sum =  x + y;
        return sum;
     }






    public static  void sayhey(){
        System.out.println("HEllo aarvi");
    }


        public  static void hellodeepak(){
            System.out.println("HEllo deepak");
        }

        public static int additionoftwonumbers(int x, int y){

        int z  = x+y;

        return z;


        }

    public static void main(String[] args) {


     int greaternumber = logic(12,45);
     int greaternumber2 = logic(45,87);
        System.out.println("The greater number is :- "  + greaternumber);
        System.out.println("The greater number is :- " + greaternumber2);
         int output = addnumbers(45,56);
        System.out.println(output);
        sayhey();
        hellodeepak();

        int sum = additionoftwonumbers(46,78);
        System.out.println(sum);

    }
}
