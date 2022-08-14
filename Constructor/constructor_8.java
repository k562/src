package Constructor;

    class cat2 {
        int legs;
        String name;


        cat2(){
            legs =4;
            name = "olive";
        }

}


public class constructor_8 {
        constructor_8(){
            System.out.println("Hello aarvi");;
        }

    public static void main(String[] args) {

            cat2 obj = new cat2();
            constructor_8 obj2 = new constructor_8();

        System.out.println("The cat2 has " + obj.legs + " legs and his name is " + obj.name);

    }
}
