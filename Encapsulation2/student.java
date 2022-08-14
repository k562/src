package Encapsulation2;

import org.w3c.dom.ls.LSOutput;

public class student {

   private int age ;
   private String name;

   public int getAge(){
       return age;

   }
   public void setAge(int ages){

       if (age>20){
           System.out.println("You are old");
       } else {
           this.age =ages;

       }

   }



}
