package Task2;

import java.util.ArrayList;
import java.util.List;

public class Tile {
    public int value;
    public int[] position;
    public int highestPathSum;
    public int lowestPathSum;
    public List<int[]> highestPath;
    public List<int[]> lowestPath;

    public Tile(Tile tile) {
        this.value = tile.getValue();
        this.position = tile.getPosition();

        try {
            this.highestPathSum = tile.getHighestPathSum();
            this.lowestPathSum = tile.getLowestPathSum();
            this.highestPath = tile.getHighestPath();
            this.lowestPath = tile.getLowestPath();
        } catch (Exception e) {

        }
    }

    public Tile(int value, int[] position) {
        this.value = value;
        this.position = new int[] {position[0], position[1]};
    }

    public Tile(int value, int[] position, int highestPathSum, int lowestPathSum, List<int[]> highestPath, List<int[]> lowestPath) {
        this.value = value;
        this.position = new int[] {position[0], position[1]};
        this.highestPathSum = highestPathSum;
        this.lowestPathSum = lowestPathSum;
        this.highestPath = deepCopy(highestPath);
        this.lowestPath = deepCopy(lowestPath);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int[] getPosition() {
        return new int[] {position[0], position[1]};
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public int getHighestPathSum() {
        return highestPathSum;
    }

    public void setHighestPathSum(int highestPathSum) {
        this.highestPathSum = highestPathSum;
    }

    public int getLowestPathSum() {
        return lowestPathSum;
    }

    public void setLowestPathSum(int lowestPathSum) {
        this.lowestPathSum = lowestPathSum;
    }

    public List<int[]> getHighestPath() {
        return deepCopy(highestPath);
    }

    public void setHighestPath(List<int[]> highestPath) {
        this.highestPath = highestPath;
    }

    public List<int[]> getLowestPath() {
        return deepCopy(lowestPath);
    }

    public void setLowestPath(List<int[]> lowestPath) {
        this.lowestPath = lowestPath;
    }

    public static List<int[]> deepCopy(List<int[]> input) {
        List<int[]> output = new ArrayList<>();

        for (int[] i : input) {
            output.add(new int[] {i[0], i[1]});
        }

        return output;
    }
}
