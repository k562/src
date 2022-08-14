package Encapsulation5;

import java.util.Set;

class Student{

     private int age;
     private String name;

     public int getAge() {
         return age;
     }

     public void setAge(int age) {

         if (age>20){
             System.out.println("You are an old student");
         }else {
             this.age=age;
         }
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
        System.out.println(name.charAt(3));

    }
}




public class incapsulation_6 {

    public static void main(String[] args) {

        Student kks = new Student();
        kks.setAge(21);
        kks.setName("kaushik");

    }
}
