package Recovery.Array;

import java.util.Arrays;

public class OneDArrayExample {
    public void OneDArray() {
        int[] array = {1, 2, 3, 4, 5};
        for (int j : array) {
            System.out.println(j);
        }
    }

    public void OneDArray2() {
        int[] Array = new int[10];
        for (int x = 0; x < 10; x++) {
            Array[x] = x;
        }
        Arrays.stream(Array).forEach(System.out::println);
    }


    public int[] Array() {
        int[] Array = new int[10];

        for (int x = 0; x < 10; x++) {
            Array[x] = x;
        }
        return Array;
    }


}
