package Task3;

public class Tile {
    private boolean wall;
    private boolean visited;

    public Tile(boolean wall, boolean visited) {
        this.wall = wall;
        this.visited = visited;
    }

    public boolean isWall() {
        return wall;
    }

    public void setWall(boolean wall) {
        this.wall = wall;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
