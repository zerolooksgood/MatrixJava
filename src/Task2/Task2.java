package Task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void task2() {
        List<int[]> list = new ArrayList<>();
        list.add(new int[] {0});
        list.add(new int[] {2, 4});
        list.add(new int[] {0, 5, 6});
        list.add(new int[] {7, 2, 9, 10});
        list.add(new int[] {25, 11, 1, 0, 5});
        list.add(new int[] {93, 12, 73, 36, 71, 65, 34});
        list.add(new int[] {233, 5, 2, 1, 6, 7, 55, 1});
        list.add(new int[] {16, 111, 213, 9, 23, 433, 1, 34, 13});
        list.add(new int[] {5, 23, 453, 789, 123, 200, 212, 345, 556, 99});
    }

    public static List<Tile[]> convertToTileMatrix(List<int[]> input) {
        List<Tile[]> tileMatrix = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            Tile[] tempArray = new Tile[input.get(i).length];
            for (int j = 0; j < input.get(i).length; j++) {
                tempArray[j] = new Tile(input.get(i)[j], new int[] {i, j});
            }
            tileMatrix.add(tempArray);
        }

        return tileMatrix;
    }
}
