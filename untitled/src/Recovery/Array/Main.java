package Recovery.Array;

import java.util.Arrays;

public class Main {
    public static OneDArrayExample oneDArrayExample;
    public static TwoDArrayExample twoDArrayExample;

    public static void main(String[] args) {
        oneDArrayExample = new OneDArrayExample();
//        oneDArrayExample.OneDArray();
//        oneDArrayExample.OneDArray2();
        twoDArrayExample = new TwoDArrayExample();
//      twoDArrayExample.TwoDArray();
        Arrays.stream(oneDArrayExample.Array()).forEach(System.out::println);

    }
}
