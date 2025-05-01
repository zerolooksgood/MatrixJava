package Task3;

public class Task3 {

    public static void task3() {
        System.out.println("\nTask 3:\n");

        int [][] maze = {
                {1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
                {1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
                {1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
                {1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 1 },
                {1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                {1, 1, 0, 0, 0, 1, 1, 1, 0, 1 }
        };

        long start = System.nanoTime();

        Tile[][] tileMaze = convertToTileMaze(maze);
        checkTile(tileMaze, new int[] {0, 0});
        checkIfMazePossible(tileMaze);

        long end = System.nanoTime();
        long elapsedTime = end - start;
        System.out.println(elapsedTime / 1000000 + "ms");
    }

    public static Tile[][] convertToTileMaze(int[][] maze) {
        Tile[][] tileMaze = new Tile[maze.length][maze[0].length];

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if (maze[i][j] == 1) {
                    tileMaze[i][j] = new Tile(false, false);
                } else {
                    tileMaze[i][j] = new Tile(true, false);
                }
            }
        }

        return tileMaze;
    }

    public static void checkTile(Tile[][] tileMaze, int[] pos) {
        tileMaze[pos[0]][pos[1]].setVisited(true);
        if (pos[0] > 0 && !tileMaze[pos[0] - 1][pos[1]].isWall() && !tileMaze[pos[0] - 1][pos[1]].isVisited()) {
            checkTile(tileMaze, new int[] {pos[0] - 1, pos[1]});
        }
        if (pos[0] < tileMaze.length - 1 && !tileMaze[pos[0] + 1][pos[1]].isWall() && !tileMaze[pos[0] + 1][pos[1]].isVisited()) {
            checkTile(tileMaze, new int[] {pos[0] + 1, pos[1]});
        }
        if (pos[1] > 0 && !tileMaze[pos[0]][pos[1] - 1].isWall() && !tileMaze[pos[0]][pos[1] - 1].isVisited()) {
            checkTile(tileMaze, new int[] {pos[0], pos[1] - 1});
        }
        if (pos[1] < tileMaze[0].length - 1 && !tileMaze[pos[0]][pos[1] + 1].isWall() && !tileMaze[pos[0]][pos[1] + 1].isVisited()) {
            checkTile(tileMaze, new int[] {pos[0], pos[1] + 1});
        }
    }

    public static void checkIfMazePossible(Tile[][] tileMaze) {
        if (tileMaze[tileMaze.length - 1][tileMaze[0].length - 1].isVisited()) {
            System.out.println("The maze is possible");
        } else {
            System.out.println("The maze is impossible");
        }
    }
}
