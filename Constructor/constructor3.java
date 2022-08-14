package Constructor;

 class Railroad_truck {
     int wheel ,  railroader;

     String train;

     Railroad_truck(int wheels , int railroaders ){
         this.wheel = wheels;
         this.railroader = railroaders;

         train = "Rajdhani";
     }

      int passenger ;

      String color ;

      Railroad_truck(int passengers ,  String colors){
         this.passenger =  passengers;
         this.color =  colors;

         train = "Rajdhani";
     }
 }

 public class constructor3 {
      constructor3() {
          System.out.println("Constructor is now created");
      }
    public static void main(String[] args) {

        Railroad_truck tr1 = new Railroad_truck(600,12);
        Railroad_truck tr2 = new Railroad_truck(1000,"Blue");

        System.out.println("In the bokaro city there is train and it is called  " +  tr1.train);


        System.out.println("Rajdhani is having " + tr1.wheel + " wheels and  " + tr1.railroader + " railroaders");
        System.out.println("Rajdhani trains contains " + tr2.passenger + " and the train color is " + tr2.color);

        constructor3 obj = new constructor3();


      }
}
