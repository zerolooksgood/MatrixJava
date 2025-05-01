import Task1.Task1;
import Task2.Task2;
import Task3.Task3;

public class Main {
    public static void main(String[] args) {
        long start = System.nanoTime();

        Task1.task1();
        Task2.task2();
        Task3.task3();

        long end = System.nanoTime();
        long timeElapsed = end - start;

        System.out.println("\nTotal time elapsed: " + timeElapsed / 1000000 + "ms");
    }
}