package Recovery.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class SinglyLinkedLisExample {
    public void SinglyLinkedLis() {
        LinkedList<String> LinkedList = new LinkedList<>();
        LinkedList.add("NodeA");
        LinkedList.add("NodeB");
        LinkedList.add("NodeC");
        LinkedList.add("NodeD");
        LinkedList.add("NodeE");
        LinkedList.push("Head");
        String popped = LinkedList.pop();
        System.out.println("Popped element: " + popped);
        LinkedList.stream().forEach(System.out::println);
        String popped2 = LinkedList.peek();
        System.out.println("peek element: " + popped2);

    }

    public void SinglyLinkedLisUseIterator() {
        LinkedList<String> names = new LinkedList<>();
        names.add("Ahmed");
        names.add("Mohamed");
        names.add("Ramadan");
        names.add("Karim");
        ListIterator<String> iterator = names.listIterator();

        while (iterator.hasNext()) {
            System.out.println("Iterator" + iterator.next());


        }



    }

}
