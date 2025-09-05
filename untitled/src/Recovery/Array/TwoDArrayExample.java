package Recovery.Array;

import java.util.Arrays;

public class TwoDArrayExample {


    public void TwoDArray() {
        int[][] TowArray = new int[10][3];

        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 3; y++) {
                TowArray[x][y] = x;
                System.out.println(Arrays.deepToString(TowArray));
            }

        }

    }

}
