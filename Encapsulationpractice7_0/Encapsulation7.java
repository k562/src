package Encapsulationpractice7_0;
class Student {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age>20){
            System.out.println("You are old");
        }else {
            this.age = age;

        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}


public class Encapsulation7 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setAge(23);
        System.out.println(s1.getAge());

    }
}
