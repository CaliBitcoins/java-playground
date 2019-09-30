package com.galvanize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        //=====================================
        // ** Accumulator Example **
        //=====================================
        // EXAMPLE No. 1
        System.out.println("ACCUMULATOR EXAMPLE");
        System.out.println("-------------------");

        Accumulator acc = new Accumulator();
        List<Integer> input = Arrays.asList(1,2,4,5);

        System.out.println(acc.sum(input));

        // Example No. 2
        System.out.println(acc.shortWords("Mushroom, pill, drink, thong, crystal, yellow, eat", 16));
        System.out.println(" ");

        //=====================================
        // ** HashMaps **
        //=====================================
        System.out.println("HASHMAP EXAMPLE");
        System.out.println("-------------------");
        HashMap<String, Integer> birthYears = new HashMap<>();
        birthYears.put("David", 1979);
        birthYears.put("Esther", 1994);

        System.out.println(birthYears);
        System.out.println(birthYears.get("Esther"));
        System.out.println(birthYears.containsKey("David"));
        System.out.println(birthYears.containsValue(1994));

        birthYears.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(key + value);
        });


        //=====================================
        // ** Arrays and ArrayLists **
        //=====================================
        System.out.println("ARRAY TESTS:");
        String[] names = new String[10]; // Initialize an Array of 4 Strings called names
        names[0] = "Candy";
        names[1] = "Melissa";
        names[2] = "Veronica";
        names[3] = "Cassandra";

        for(String name : names) {
            System.out.println(name);
        }

        String[] girls = new String[] {"Candy", "Molina", "Ariceli", "Gina"};

        for(String girl : girls) {
            System.out.println(girl);
        }

        System.out.println(names); // Returns [Ljava.lang.String;@3fb4f649

        System.out.println("----------------------------");
        System.out.println("");
        System.out.println("ArrayList TESTS:"); // Start ArrayList Tests

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Molina");
        nameList.add("Bambi");
        nameList.add("Rebecca");

        System.out.println(nameList.get(1));

        for (String name : nameList) {
            System.out.println(name);
        }

        nameList.forEach(System.out::println); // Abbreviated Iteration using forEach
        System.out.println(nameList.indexOf("Molina")); // Outputs index of Molina
        System.out.println(nameList);

        ArrayList<String> newList = new ArrayList<>(Arrays.asList("Molina", "Araceli", "Melissa"));
        newList.sort(null);
        System.out.println(newList);

        //=====================================
        // ** Casting
        //=====================================
        // 1) Casting from string to more general object - works, but unnecessary
        Object myString = (Object) "Hi there!";
        System.out.println(myString);

        //=====================================
        // ** PREVIOUS EXERCISES **
        //=====================================
        //for(int i=2; i<=6; i++) {
        //    if (i % 2 == 0 ) System.out.println(i);
        //}

        //Table roundTable = new Table();
        //roundTable.setShape("round");

        //System.out.println(roundTable);
        //--------------------------------------

    }
}
