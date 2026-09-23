package Prelim;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Marchilyn");
        names.add("Hudson");
        names.add("MJ");
        names.addFirst("Opaw");
        names.addLast("Jamaica");

        System.out.println(names);

        names.set(0, "Marcella");

        System.out.println(names.contains("mJ"));
        names.remove("MJ");
        System.out.println(names.isEmpty());
        //  names.clear();

        for (int i = 0; i < names.size(); i++) {
            System.out.println();
            
        }

    }

}
