import java.util.Scanner;

public class Problem1185 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        float[][] M = new float[12][12];
        char operation = Character.toUpperCase(sc.next().charAt(0));

        for (int row = 0 ; row < 12; row++) {
            for (int col = 0 ; col < 12 ; col++) {
                M[row][col] = sc.nextFloat();
            }
        }

        for (int row = 0; row < 12; row++) {
            for (int col = 0; col < 12; col++) {
                if (row + col < 11) {
                    sum += M[row][col];
                }
            }
        }

        if (operation == 'S') {
            System.out.printf("%.1f%n", sum);
        } else if (operation == 'M') {
            System.out.printf("%.1f%n", sum / 66);
        }
    }
}
