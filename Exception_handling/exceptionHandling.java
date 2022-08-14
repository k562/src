package Exception_handling;

public class exceptionHandling {

    public static void main(String[] args) {


        // Arthmetic operator
       try {
           int a  = 3;
           int b  = 0;

           int divide  = a/b;

           System.out.println(divide);

       } catch (ArithmeticException e){

           System.out.println(e.getMessage() + "occured,Plzz check your code");
       }

        System.out.println("Very imp code");
        System.out.println("Need to run");
    }
}
