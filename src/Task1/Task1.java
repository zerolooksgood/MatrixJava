package Task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {




    public static void task1() {
        System.out.println("\nTask 1:\n");

        int[][] matrix1 = {
                {1, 8, 921, 238, 366, 938, 246, 940, 736, 585},
                {36, 9, 161, 717, 224, 489, 141, 160, 496, 838},
                {389, 22, 766, 19, 498, 655, 727, 130, 279, 392},
                {667, 220, 1, 581, 468, 96, 495, 169, 134, 14},
                {279, 30, 786, 780, 306, 533, 498, 637, 344, 599},
                {896, 224, 521, 948, 467, 208, 791, 371, 739, 48},
                {505, 592, 465, 586, 714, 540, 758, 488, 130, 609},
                {190, 851, 153, 433, 644, 444, 441, 401, 666, 118},
                {432, 662, 497, 926, 646, 686, 722, 196, 60, 854},
                {494, 818, 815, 355, 63, 778, 914, 812, 900, 999}
        };
        int[][] matrix2= {
                {272, 362, 965, 995, 603, 909, 758, 390, 709, 693},
                {665, 600, 806, 201, 905, 688, 294, 860, 6, 501},
                {362, 454, 902, 479, 632, 78, 469, 255, 650, 755},
                {337, 927, 535, 858, 839, 236, 813, 457, 360, 482},
                {153, 742, 367, 793, 749, 870, 413, 81, 961, 165},
                {937, 88, 291, 35, 325, 580, 912, 15, 777, 779},
                {813, 638, 641, 918, 140, 758, 755, 522, 745, 12},
                {902, 978, 273, 9, 80, 498, 850, 863, 651, 123},
                {262, 104, 32, 735, 780, 177, 327, 175, 667, 128},
                {45, 344, 622, 627, 349, 184, 802, 400, 701, 550}
        };
        int[][] matrix3= {
                {101, 892, 495, 633, 59, 331, 216, 352, 49, 49},
                {925, 288, 737, 224, 734, 94, 361, 35, 826, 710},
                {712, 133, 609, 927, 908, 725, 626, 601, 878, 773},
                {325, 708, 968, 940, 877, 416, 115, 434, 594, 890},
                {58, 617, 813, 127, 176, 20, 784, 565, 863, 178},
                {405, 352, 545, 795, 216, 814, 491, 355, 516, 423},
                {239, 776, 654, 433, 453, 644, 708, 113, 354, 404},
                {663, 571, 0, 532, 842, 520, 874, 988, 322, 576},
                {630, 469, 879, 609, 37, 965, 888, 277, 975, 87},
                {337, 260, 79, 110, 428, 410, 963, 898, 517, 735}
        };
        int[][] matrix4= {
                {70, 562, 376, 993, 689, 354, 369, 519, 981, 786},
                {539, 756, 364, 445, 650, 23, 456, 901, 955, 83},
                {259, 967, 396, 745, 810, 218, 986, 593, 360, 415},
                {601, 479, 670, 406, 321, 845, 667, 420, 34, 853},
                {796, 204, 548, 162, 355, 583, 611, 23, 227, 882},
                {498, 796, 258, 851, 339, 847, 378, 330, 107, 46},
                {548, 48, 746, 356, 115, 48, 503, 213, 80, 519},
                {285, 260, 162, 644, 885, 916, 771, 657, 622, 92},
                {472, 336, 931, 257, 798, 881, 911, 486, 736, 664},
                {107, 248, 52, 958, 596, 133, 191, 960, 785, 776}
        };
        int[][] matrix5= {
                {239, 493, 26, 156, 588, 424, 88, 914, 921, 494},
                {90, 681, 600, 338, 620, 689, 149, 245, 739, 686},
                {854, 261, 14, 761, 929, 671, 349, 615, 626, 10},
                {965, 125, 938, 900, 764, 939, 766, 182, 274, 714},
                {538, 288, 941, 251, 903, 80, 807, 879, 616, 891},
                {411, 546, 273, 575, 419, 682, 357, 63, 397, 541},
                {266, 599, 402, 972, 156, 180, 639, 83, 19, 618},
                {62, 289, 436, 67, 29, 720, 38, 543, 775, 969},
                {229, 316, 707, 537, 48, 297, 989, 469, 895, 191},
                {106, 538, 652, 624, 308, 722, 17, 885, 497, 490}
        };
        int[][] matrix6= {
                {571, 7, 514, 699, 399, 94, 407, 153, 941, 638},
                {296, 39, 622, 601, 341, 986, 605, 47, 596, 543},
                {549, 26, 117, 770, 258, 259, 433, 381, 698, 764},
                {350, 359, 182, 344, 396, 51, 169, 418, 248, 865},
                {827, 678, 449, 808, 176, 256, 149, 688, 561, 585},
                {634, 999, 158, 774, 383, 274, 651, 731, 449, 660},
                {158, 190, 985, 696, 634, 279, 484, 287, 648, 732},
                {400, 412, 957, 317, 376, 244, 664, 732, 463, 691},
                {544, 831, 523, 299, 149, 198, 964, 863, 502, 954},
                {497, 793, 915, 58, 573, 120, 491, 776, 728, 291}
        };

        long start = System.nanoTime();

        printResults(calculateMatrix(convertToTileMatrix(matrix1)));
        printResults(calculateMatrix(convertToTileMatrix(matrix2)));
        printResults(calculateMatrix(convertToTileMatrix(matrix3)));
        printResults(calculateMatrix(convertToTileMatrix(matrix4)));
        printResults(calculateMatrix(convertToTileMatrix(matrix5)));
        printResults(calculateMatrix(convertToTileMatrix(matrix6)));

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

    public static String printPath(List<int[]> path) {
        String result = "";

        for (int[] pos : path) {
            result += "{" + pos[0] + ", " + pos[1] + "}, ";
        }

        return result;
    }
}
