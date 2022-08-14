package Constructor;

import org.w3c.dom.ls.LSOutput;

class Student3 {

     int id ;
     String name ;
     double rollno;
     int legs;

     Student3(int id2 , String name2){

         this.id = id2;
         this.name = name2;
     }

     Student3(int id2 , String name2 , double rollno2) {
         this.name = name2;
         this.id = id2;
         this.rollno = rollno2;
           legs =4;
     }
     }
     public class constructor_10 {
     constructor_10() {
         System.out.println("Hello Aarvi");
     }
    public static void main(String[] args) {

         constructor_10 obj = new constructor_10();
         Student3 rv = new Student3(34,"Kaushik",34.5);

        System.out.println("The student info " + rv.name );
        System.out.println("The student info " + rv.id );
        System.out.println("The student info " + rv.rollno);
        System.out.println("The student info " + rv.legs );




    }
}
