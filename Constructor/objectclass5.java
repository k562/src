package Constructor;

 class  cat {
     int legs,eyes ;
     boolean hasfur;
     String name;


     public void walk(){
         System.out.println(name + " is walking");
     }

     public void eat(){
         System.out.println(name + " is eating ");
     }

     public void discription (){
         System.out.println(name + " is having " + legs + " legs and having " + eyes + " eyes and have a brown fur its true  " + hasfur + " and her name is " + name );
     }

 }
 public class objectclass5 {

     public static void main(String[] args) {

         cat cat1 = new cat();
         cat1.name = "Olive";
         cat1.legs =  4;
         cat1.eyes = 2;
         cat1.eat();
         cat1.eat();
         cat1.discription();

    }
}
