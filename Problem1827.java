import java.util.Scanner;

public class Problem1827 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int arraySize = sc.nextInt();

            int[][] array = new int[arraySize][arraySize];
            int center = arraySize / 2;
            int oneSquare = arraySize / 3;
            int oneSquareLimit = (arraySize - 1) - oneSquare;

            for (int i = 0; i < arraySize; i++) {
                for (int j = 0; j < arraySize; j++) {
                    if (i == center && j == center) {
                        array[i][j] = 4;
                    } else if (i >= oneSquare && j >= oneSquare && i <= oneSquareLimit && j <= oneSquareLimit) {
                        array[i][j] = 1;
                    } else if (i == j) {
                        array[i][j] = 2;
                    } else if (i + j == arraySize - 1) {
                        array[i][j] = 3;
                    } else {
                        array[i][j] = 0;
                    }
                }
            }

            for (int i = 0; i < arraySize; i++) {
                for (int j = 0; j < arraySize; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }

        sc.close();
    }
}
