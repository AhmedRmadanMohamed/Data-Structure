package Recovery.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class DoublyLinkedListExample {
    public void DoublyLinkedLisUseIterator() {
        LinkedList<String> Names = new LinkedList<>();

        Names.add("Ahmed");
        Names.add("Mohamed");
        Names.add("Ramadan");
        Names.add("Karim");
        ListIterator<String> iterator = Names.listIterator();

        while (iterator.hasNext()) {System.out.println("Iterator" + iterator.next());}
        System.out.print("------------------------------------DoublyLinkedLisUseIterator--------------------------------------");
        System.out.println();
        do {
            System.out.println("Previous element: " + iterator.previous());
            System.out.println("previous Index: " + iterator.previousIndex());
        } while (iterator.hasPrevious());


    }
}
