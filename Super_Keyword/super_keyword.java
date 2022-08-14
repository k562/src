package Super_Keyword;


 class bird {
     public void fly(){
         System.out.println("A bird can fly ");
     }

 }

 class koyal extends bird {

     public void fly(){
         super.fly();
         System.out.println("Koyal can fly");
     }
 }


public class super_keyword {

    public static void main(String[] args) {

        koyal k1 = new koyal();
        k1.fly();

    }
}
