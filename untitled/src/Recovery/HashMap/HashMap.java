package Recovery.HashMap;

import java.util.Hashtable;

public class HashMap {

    public static void HashMapMethod() {

        Hashtable<Integer, String> hashMap = new Hashtable<>();
        hashMap.put(1, " One");
        hashMap.put(2, "Tow");
        hashMap.put(3, "three");
        hashMap.put(4, "four");

        hashMap.forEach((integer, _) -> {
                    switch (integer) {
                        case 1:
                            System.out.println(hashMap.get(1));
                            hashMap.replace(1, "ReplaceOne");
                            System.out.println("-----------------------");
                            System.out.println(hashMap.get(1));
                            break;
                        case 2:
                            System.out.println(hashMap.get(2));
                            hashMap.replace(2, "ReplaceTow");
                            System.out.println("-----------------------");
                            System.out.println(hashMap.get(2));
                            break;
                        case 3:
                            System.out.println(hashMap.get(3));
                            hashMap.replace(3, "ReplaceThree");
                            System.out.println("-----------------------");
                            System.out.println(hashMap.get(3));
                            break;
                        default:
                            System.out.println("Invalid key");

                    }
                }

        );


    }


}
