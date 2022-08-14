package com.company.java_oops;



class Student {

     private int age;
     private String name;

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         if(age>20){

         } else {
             this.age = age;
         }

     }
 }

  public class Encapsulation {
    public static void main(String[] args) {


        Student kks =  new Student();
        kks.setAge(23);
        System.out.println(kks.getAge());

    }
}
