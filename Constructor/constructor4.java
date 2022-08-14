package Constructor;

import org.w3c.dom.ls.LSOutput;

public class constructor4 {

     String java;

     constructor4(String java2){

        this.java = java2;

    }

    public void javaworks(){
        System.out.println("Java is working ");
    }

    public static void main(String[] args) {

        constructor4 obj = new constructor4("Java is working perfectly");

        System.out.println(obj.java);

       obj.javaworks();

    }
}
