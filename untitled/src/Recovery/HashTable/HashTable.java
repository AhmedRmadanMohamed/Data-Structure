package Recovery.HashTable;

import java.util.Hashtable;

import static java.lang.System.out;

public class HashTable {

    public static void HashTableMethod() {

        Hashtable<Integer, String> integerStringHashtable = new Hashtable<>();
        integerStringHashtable.put(1, "one");
        integerStringHashtable.put(2, "two");
        integerStringHashtable.put(3, "three");
        integerStringHashtable.put(4, "four");
        integerStringHashtable.forEach((integer, string) -> out.println("Kay   " + integer + "Value    " + string));
        out.println();
        Object CopyReference = integerStringHashtable.clone();
        out.println(CopyReference);

        integerStringHashtable.clone();
//        integerStringHashtable.clear();
        integerStringHashtable.put(1, "one");
        integerStringHashtable.replace(1, "ahmed");
        integerStringHashtable.forEach((integer, string) -> out.println("Kay   " + integer + "Value    " + string));

        try {
            Hashtable<Integer, String> copy = (Hashtable<Integer, String>) integerStringHashtable.clone();
            copy.put(1, "one");

            copy.forEach((integer, string) ->
                    out.println("Kay   " + integer + "Value    " + string));
        }catch (Exception e) {
            e.printStackTrace();
        }


        out.println("----------------------------------------------------");


        integerStringHashtable.forEach((integer, string) -> out.println(integerStringHashtable.get(integer)));


    }
}
