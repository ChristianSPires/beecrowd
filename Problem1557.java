import java.util.Scanner;

public class Problem1557 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        boolean first = true;

        while ((n = sc.nextInt()) != 0) {
            int[][] matrix = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 && j == 0) {
                        matrix[i][j] = 1;
                    } else if (i != 0 && j == 0) {
                        matrix[i][j] = matrix[i - 1][j] * 2;
                    } else {
                        matrix[i][j] = matrix[i][j - 1] * 2;
                    }
                }
            }

            int maxValue = matrix[0][0];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] > maxValue) {
                        maxValue = matrix[i][j];
                    }
                }
            }

            int fieldWidth = String.valueOf(maxValue).length();

            if (!first) {
                System.out.println();
            }
            first = false;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j > 0) {
                        System.out.print(" ");
                    }
                    System.out.print(String.format("%" + fieldWidth + "d", matrix[i][j]));
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
