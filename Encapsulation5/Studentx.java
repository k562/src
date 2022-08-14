package Encapsulation5;

public class Studentx {

    private int age;

    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int ages) {
        if (age > 20) {
            System.out.println("You are too old go to school "); 
        } else {
            this.age = ages;
        }





    }
}