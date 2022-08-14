package com.company.java_oops;



public class method3 {



    public  static int additionoftwonumbers(int x, int y){

        int z  = x + y;
        return z;
    }



    static void sayHey(){
        System.out.println("Hey aarvi");
    }

    static int product_of_two(int x){
        int result = x * 2;
        return result ;
    }


    static int greatest_of_twonumber(int x, int y){
        if(x>y){
            return x;
        } else {
            return y;

        }
    }

    


    public static void main(String[] args) {


        System.out.println(additionoftwonumbers(34,56));
        sayHey();
        System.out.println(product_of_two(56));
        System.out.println(greatest_of_twonumber(45,43));



    }
}
