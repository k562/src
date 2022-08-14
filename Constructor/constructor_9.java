package Constructor;


class student {
    int id;
    String name ;

    student(int id2, String name2){
        System.out.println("The student information:- ");
        this.id = id2;
        this.name = name2;
    }
}
public class constructor_9 {
    constructor_9 () {
        System.out.println("Hello constructor");
    }
    public static void main(String[] args) {
        constructor_9 kks2 = new constructor_9();
        student kks = new student(4,"Aarvi");
        System.out.println(kks.id);
        System.out.println(kks.name);

    }
}
