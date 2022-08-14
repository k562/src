package Collectionframework;
import java.util.ArrayList;
import java.util.Collections;

public class learnArraylist {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<Integer>();

        number.add(1);
        number.add(2);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);

        System.out.println(number);

        number.add(2,3);
        System.out.println(number);

        number.remove(1);
        System.out.println(number);


        number.addAll(number);
        System.out.println(number);


        number.retainAll(number);
        System.out.println(number);

        number.contains(number);
        System.out.println(number);

        number.containsAll(number);
        System.out.println(number);













    }
}
