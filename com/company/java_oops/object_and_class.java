package com.company.java_oops;

    class Cat{
        int legs;
        int eyes = 2;
        String name;
        boolean hasfur;

        public void walk(){
            System.out.println(name + " is walking");
        }

        public void eat(){
            System.out.println( name + " is eating");
        }

        public void description(){
            System.out.println("I am having a cat her name is " + name + " she has " + eyes + " eyes and " +  legs + " legs  &" +
                    "  she has a brownfur and its  " + hasfur );

        }

    }
    public class object_and_class {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.name = "Oggy";
        cat1.legs = 4;

        cat1.hasfur = true;
        cat1.walk();
        cat1.description();



        cat2.name = "Olive";
        cat2.hasfur = true;
        cat2.legs =  4;
        cat2.eyes = 2;
        cat2.description();
        cat2.eat();








    }
}
