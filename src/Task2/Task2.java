package Task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void task2() {
        System.out.println("\n<Task 2:\n");

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

        long start = System.nanoTime();

        printHighestLowestPath(calculateTileMatrix(convertToTileMatrix(list)));

        long end = System.nanoTime();
        long timeElapsed = end-start;
        System.out.println(timeElapsed/1000000 + "ms");
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

    public static List<Tile[]> calculateTileMatrix(List<Tile[]> tileMatrix) {

        Tile firstTile = new Tile(tileMatrix.getFirst()[0]);
        firstTile.setHighestPathSum(firstTile.getValue());
        firstTile.setLowestPathSum(firstTile.getValue());
        List<int[]> path = new ArrayList<>();
        path.add(firstTile.getPosition());
        firstTile.setHighestPath(path);
        firstTile.setLowestPath(path);
        tileMatrix.getFirst()[0] = firstTile;

        for (int i = 1; i < tileMatrix.size(); i++) {
            for (int j = 0; j < tileMatrix.get(i).length; j++) {
                List<Tile> tiles = new ArrayList<>();
                try {
                    tiles.add(tileMatrix.get(i-1)[j-1]);
                } catch (Exception _) {}
                try {
                    tiles.add(tileMatrix.get(i-1)[j]);
                } catch (Exception _) {}
                try {
                    tiles.add(tileMatrix.get(i-1)[j+1]);
                } catch (Exception _) {}

                tileMatrix.get(i)[j] = calculateTile(tiles, tileMatrix.get(i)[j]);
            }
        }

        return tileMatrix;
    }

    public static Tile calculateTile(List<Tile> prevTiles, Tile currentTile) {
        int highestPathSum = 0;
        List<int[]> highestPath = new ArrayList<>();
        int lowestPathSum = -1;
        List<int[]> lowestPath = new ArrayList<>();

        for (Tile tile : prevTiles) {
            if (tile.getHighestPathSum() > highestPathSum) {
                highestPathSum = tile.getHighestPathSum();
                highestPath = tile.getHighestPath();
            }
            if (tile.getLowestPathSum() < lowestPathSum || lowestPathSum == -1) {
                lowestPathSum = tile.getLowestPathSum();
                lowestPath = tile.getLowestPath();
            }
        }

        highestPathSum += currentTile.getValue();
        highestPath.add(currentTile.getPosition());
        lowestPathSum += currentTile.getValue();
        lowestPath.add(currentTile.getPosition());

        return new Tile(currentTile.getValue(), currentTile.getPosition(), highestPathSum, lowestPathSum, highestPath, lowestPath);
    }

    public static void printHighestLowestPath(List<Tile[]> tileMatrix) {
        Tile[] lastRow = tileMatrix.getLast();
        Tile highestTile = new Tile(lastRow[0]);
        Tile lowestTile = new Tile(lastRow[0]);

        for (Tile tile : lastRow) {
            if (tile.getHighestPathSum() > highestTile.getHighestPathSum()) {
                highestTile = new Tile(tile);
            }
            if (tile.getLowestPathSum() < lowestTile.getLowestPathSum()) {
                lowestTile = new Tile(tile);
            }
        }

        System.out.println("Path with the highest sum:");
        System.out.println("Sum: " + highestTile.getHighestPathSum());
        System.out.println("Path: " + printPath(highestTile.getHighestPath()));

        System.out.println("\nPath with the lowest sum:");
        System.out.println("Sum: " + lowestTile.getHighestPathSum());
        System.out.println("Path: " + printPath(lowestTile.getHighestPath()));

    }

    public static String printPath(List<int[]> path) {
        String result = "";
        for (int[] pos : path) {
            result += "{" + pos[0] + ", " + pos[1] + "}, ";
        }
        return result;
    }
}
