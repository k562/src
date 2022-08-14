package Constructor;

import java.util.jar.JarOutputStream;

class vehicle{

    int wheels , headlights;
    String name ;

    vehicle(int wheels , int headlights){
       this.wheels= wheels;
     this.headlights = headlights;

       name = "Audi";
    }

}
  public class constructor2 {

 constructor2(){
     System.out.println("Constructor is now created");
 }

    public static void main(String[] args) {

        vehicle car1 =  new vehicle(4,4);
        vehicle car2 = new vehicle(4,4);

        System.out.println(car1.wheels  + " Wheels");
        System.out.println(car1.headlights + " headlights");

        System.out.println(car2.name);

        constructor2 obj = new constructor2();


    }
}
