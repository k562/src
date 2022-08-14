package Constructor;

public class Method7 {

    int wheels ;
    Method7(){
        System.out.println("hello constructor");
        wheels =4;
    }

    public static void main(String[] args) {
        Method7 method1 = new Method7();

        System.out.println(method1.wheels);


    }
}
