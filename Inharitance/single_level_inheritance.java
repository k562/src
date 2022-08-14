package Inharitance;

class shape{
    public void display(){
        System.out.println("Public void display area");
    }
}
 class triangle extends shape{
    public void area(int b, int h){
        System.out.println(1/2 * b * h);
    }
 }
public class single_level_inheritance {


    public static void main(String[] args) {
        triangle t1 = new triangle();
        t1.area(12,34);




    }
}
