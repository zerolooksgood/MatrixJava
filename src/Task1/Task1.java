package Task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {




    public static void task1() {
        long start = System.nanoTime();

        calculateMatrix(convertToTileMatrix(generateMatrix(10,10,1,100)));
        calculateMatrix(convertToTileMatrix(generateMatrix(10,10,1,100)));
        calculateMatrix(convertToTileMatrix(generateMatrix(10,10,1,100)));
        calculateMatrix(convertToTileMatrix(generateMatrix(10,10,1,100)));
        calculateMatrix(convertToTileMatrix(generateMatrix(10,10,1,100)));
        calculateMatrix(convertToTileMatrix(generateMatrix(10,10,1,100)));

        long end = System.nanoTime();
        long elapsedTime = end-start;
        System.out.println(elapsedTime / 1000000 + "ms");
    }

    public static Tile[][] convertToTileMatrix(int[][] matrix) {

        Tile[][] tileMatrix = new Tile[matrix.length][matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                tileMatrix[row][col] = new Tile(matrix[row][col], new int[] {row, col});
            }
        }

        return tileMatrix;
    }

    public static Tile[][] calculateMatrix(Tile[][] tileMatrix) {
        Tile startTile = tileMatrix[0][0];
        startTile.setHighestPathSum(startTile.getValue());
        startTile.setLowestPathSum(startTile.getValue());

        List<int[]> path = new ArrayList<>();
        path.add(startTile.getPosition());

        startTile.setHighestPath(path);
        startTile.setLowestPath(path);

        for (int row = 1; row < tileMatrix.length; row++) {
            Tile prevTile = new Tile(tileMatrix[0][row - 1]);
            Tile currentTile = new Tile(tileMatrix[0][row]);

            path = prevTile.getHighestPath();
            path.add(currentTile.getPosition());

            int pathSum = prevTile.getHighestPathSum() + currentTile.getValue();

            currentTile = new Tile(currentTile.getValue(), currentTile.getPosition(), pathSum, pathSum, path, path);
            tileMatrix[0][row] = currentTile; //I don't trust reference type
        }

        for (int col = 1; col < tileMatrix[0].length; col++) {
            Tile prevTile = new Tile(tileMatrix[col - 1][0]);
            Tile currentTile = new Tile(tileMatrix[col][0]);

            path = prevTile.getHighestPath();
            path.add(currentTile.getPosition());
            int pathSum = prevTile.getHighestPathSum() + currentTile.getValue();

            currentTile = new Tile(currentTile.getValue(), currentTile.getPosition(), pathSum, pathSum, path, path);
            tileMatrix[col][0] = currentTile; //I don't trust reference type
        }

        for (int row = 1; row < tileMatrix.length; row++) {
            for (int col = 1; col < tileMatrix[0].length; col++) {
                Tile tileAbove = tileMatrix[row - 1][col];
                Tile tileLeft = tileMatrix[row][col - 1];
                Tile currentTile = new Tile(tileMatrix[row][col].getValue(), tileMatrix[row][col].getPosition());

                List<int[]> highestPath;
                int highestPathSum;
                if (tileAbove.getHighestPathSum() > tileLeft.getHighestPathSum()) {
                    highestPath = tileAbove.getHighestPath();
                    highestPathSum = tileAbove.getHighestPathSum();
                } else {
                    highestPath = tileLeft.getHighestPath();
                    highestPathSum = tileLeft.getHighestPathSum();
                }
                highestPath.add(currentTile.getPosition());
                highestPathSum += currentTile.getValue();

                List<int[]> lowestPath;
                int lowestPathSum;
                if (tileAbove.getLowestPathSum() < tileLeft.getLowestPathSum()) {
                    lowestPath = tileAbove.getLowestPath();
                    lowestPathSum = tileAbove.getLowestPathSum();
                } else {
                    lowestPath = tileLeft.getLowestPath();
                    lowestPathSum = tileLeft.getLowestPathSum();
                }
                lowestPath.add(currentTile.getPosition());
                lowestPathSum += currentTile.getValue();

                currentTile = new Tile(currentTile.getValue(), currentTile.getPosition(), highestPathSum, lowestPathSum, highestPath, lowestPath);

                tileMatrix[row][col] = currentTile;
            }
        }

        return tileMatrix;
    }

    public static void printResults(Tile[][] tileMatrix) {
        Tile lastTile = tileMatrix[tileMatrix.length -1 ][tileMatrix[0].length - 1];
        System.out.println("Highest path:");
        System.out.println(lastTile.getHighestPathSum());
        System.out.println(printPath(lastTile.getHighestPath()));
        System.out.println("Lowest path");
        System.out.println(lastTile.getLowestPathSum());
        System.out.println(printPath(lastTile.getLowestPath()));
    }

    public static int[][] generateMatrix(int height, int width, int min, int max) {
        int[][] matrix = new int[height][width];

        for (int[] row : matrix) {
            for (int col : row) {
                col = min + (int)(Math.random() * ((max - min) + 1));
            }
        }

        return matrix;
    }

    public static String printPath(List<int[]> path) {
        String result = "";

        for (int[] pos : path) {
            result += "{" + pos[0] + ", " + pos[1] + "}, ";
        }

        return result;
    }
}
