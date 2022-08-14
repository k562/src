package Encapsulation3;

public class Cat {

     private int age;

     private   String name ;

    public int getAge(){
        return age;
    }

    public void setAge(int ages){
        if(age>20){
            System.out.println("You are old ");
        }else{
            this.age =ages;

        }
    }

    public String getName() {
        return name;
    }


    public void setName(String names) {

        String name =  "Kaushik karan singh";

        System.out.println(name.length());


        this.name = names;



    }
}
