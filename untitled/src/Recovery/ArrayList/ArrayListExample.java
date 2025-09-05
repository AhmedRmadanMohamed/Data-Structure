package Recovery.ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public void ArrayListEx() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Node1");
        list.add("Node2");
        list.add("Node3");
        list.add("Node4");
        list.add("Node5");
        list.add("Node6");
        list.add("Node7");
        list.add("Node8");
        list.add("Node9");
        list.add(1, "Add  New String on index");
        if (list.contains("Add  New String on index")) {
            list.remove(1);
        }
        if (list.size() >= 6) {
            for (int i = 0; i < 3; i++) {
                list.remove(i);
            }
        }

        list.set(1, "New String");

        System.out.println(list.get(2));
        list.addFirst("New String first");
        list.addLast("New String last");
        list.stream().forEach(System.out::println);
    }

}
