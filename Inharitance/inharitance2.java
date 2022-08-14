package Inharitance;

class Aarvi {

    String name = "Aarvi";

    public void her_will(){
        System.out.println(name + " can do anything ,If she want");
    }
}

 class kks extends Aarvi {

    String name = "kaushik";

    public void my_action(){
        System.out.println(name + " Follow her will and create his own action");
    }

 }
public class inharitance2 {
    public static void main(String[] args) {
         kks k1 = new kks();
        System.out.println("Give the output " + k1.name );
        k1.my_action();
        k1.her_will();
        k1.notifyAll();
    }
}
