package Collectionframework;
import java.util.ArrayList;
import java.util.List;
public class learnlist {
    public static void main(String[] args) {

         List<String> name = new ArrayList<>();

        name.add("kks");
        name.add("Aarvi");
        name.add("kaurvi");
        name.add("Aishwarya");
        name.add("Dad");
        name.add("mom");
        name.add("gouri");


        System.out.println(name);

        name.add("brother");
        System.out.println(name);

        name.add(0,"kaushik");
        System.out.println(name);

        name.set(3,"karan");
        System.out.println(name);

        name.remove(4);
        System.out.println(name);



        System.out.println(name.contains("karan"));
        System.out.println(name.containsAll(name));
        System.out.println(name.contains("seepak"));


        }
    }

