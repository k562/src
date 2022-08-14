package Encapsulation;

public class dog {

    private  int age ;

      private String name ;

      public int getAge (){
          return age ;
    }


    public void setAge(int age ){
          if(age>20){
              System.out.println("You are old school");
          } else {
              this.age = age;
          }
      }


    public static void main(String[] args) {





    }
}
